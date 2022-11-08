package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;

import DAO.DAOCliente;
import DAO.DAOVideo;
import models.Cliente;
import models.Video;
import views.Vista;

public class Controlador implements ActionListener{

	private Cliente cliente;
	private Video video;
	private Vista vista;
	private DAOCliente daoCliente;
	private DAOVideo daoVideo;
	
	public Controlador (Cliente cliente, Video video, Vista vista) {
		this.cliente = cliente;
		this.video = video;
		this.vista = vista;
		this.daoCliente = new DAOCliente();
		this.vista.btnCrearTabla.addActionListener(this);
		this.vista.btnBorrarTodo.addActionListener(this);
		this.vista.btnBuscar.addActionListener(this);
	}
	
	public void iniciarVista() {
		vista.setTitle("Cliente+Video");
		vista.pack();
		vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vista.setLocationRelativeTo(null);
		vista.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent event) {
		if(vista.btnCrearTabla == event.getSource()) {
			try {
				daoCliente.crearTabla();
			} catch (Exception e) {
				System.out.println("Fallo al crear la tabla: " + e);
			}
		}
		else if (vista.btnBuscar == event.getSource()) {
			try {
				daoCliente.selectAll();
			} catch (SQLException e) {
				System.out.println("Fallo al buscar: " + e);
			}
		}
		else if (vista.btnBorrarTodo == event.getSource()) {
			//id = Integer.parseInt(textId.getText());
			try {
				daoCliente.deleteFromId(0);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if (vista.btnInsertarVideo == event.getSource()){
			try {
				daoVideo.crearTabla();
			} catch (Exception e) {
				System.out.println("Fallo al crear tabla");
			}
			
		}
		else if (vista.btnBuscarPorTitulo == event.getSource()) {
			try {
				daoVideo.selectAll();
			} catch (Exception e) {
				System.out.println("Fallo al buscar: " + e);
			}
		}
		else if (vista.btnBorrarVideos == event.getSource()) {
			//id = Integer.parseInt(textId.getText());
			try {
				daoVideo.deleteFromId(0);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
		

}
