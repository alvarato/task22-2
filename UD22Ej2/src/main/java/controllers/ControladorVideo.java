package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;

import DAO.DAOVideo;
import models.Cliente;
import models.Video;
import views.Vista;

public class ControladorVideo implements ActionListener{
	
	private Video video;
	private Vista vista;
	private DAOVideo daoVideo;
	private ArrayList<Video> lista;
	
	public ControladorVideo (Video video, Vista vista) {
		this.video = video;
		this.vista = vista;
		this.daoVideo = new DAOVideo();
		this.vista.btnCrearTablaVideo.addActionListener(this);
		this.vista.btnInsertarVideo.addActionListener(this);
		this.vista.btnBuscarPorTitulo.addActionListener(this);
		this.vista.btnBorrarVideos.addActionListener(this);
	}
	
	public void iniciarVista() {
		vista.setTitle("Video");
		vista.pack();
		vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vista.setLocationRelativeTo(null);
		vista.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if (vista.btnCrearTablaVideo == event.getSource()){
			try {
				daoVideo.crearTabla();
				lista = daoVideo.selectAll();
				pintar();
			} catch (Exception e) {
				System.out.println("Fallo al crear tabla");
			}
			
		}
		else if (vista.btnBuscarPorTitulo == event.getSource()) {
			try {
				System.out.println(vista.textField_BuscarXTitulo.getText().equals(""));
				if (vista.textField_BuscarXTitulo.getText().equals("")) {
					lista = daoVideo.selectAll();
					System.out.println("(Buscar todos) Lista ahora es " + this.lista);
				}
				else {
					lista = daoVideo.selectAllWhereTitulo(vista.textField_BuscarXTitulo.getText());
					System.out.println("(Buscar " + vista.textField_BuscarXTitulo.getText() + ") Lista ahora es " + this.lista);
				}
				pintar();
				System.out.println(lista);
			} catch (SQLException e) {
				System.out.println("Fallo al buscar: " + e);
			}
		}
		else if (vista.btnBorrarVideos == event.getSource()) {
			//id = Integer.parseInt(textId.getText());
			try {
				daoVideo.deleteFromId(Integer.parseInt(vista.textFieldBorrarVideo.getText()));
				lista = daoVideo.selectAll();
				pintar();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		} else if (vista.btnInsertarVideo == event.getSource()) {
			try {
				daoVideo.create(vista.textField_Titulo.getText(), vista.textField_Director.getText(),
						Integer.parseInt(vista.textField_IDCliente.getText()));
				lista = daoVideo.selectAll();
				pintar();
			} catch (SQLException e) {
				System.out.println("Fallo al buscar: " + e);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private void pintar() {
		System.out.println("Pintamos");
		vista.textArea_Video.setText("");
		for (int i = 0; i<this.lista.size(); i++) {
			vista.textArea_Video.setText(vista.textArea_Video.getText() + lista.get(i).toString() + "\n");
			System.out.println(lista.get(i).toString());
		}		
	}

}
