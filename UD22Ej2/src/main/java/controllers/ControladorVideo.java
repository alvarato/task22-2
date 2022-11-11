package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

import DAO.DAOVideo;
import models.Video;
import views.Vista;

public class ControladorVideo implements ActionListener{
	
	private Video video;
	private Vista vista;
	private DAOVideo daoVideo;
	
	public ControladorVideo (Video video, Vista vista) {
		this.video = video;
		this.vista = vista;
		this.daoVideo = new DAOVideo();
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
		if (vista.btnInsertarVideo == event.getSource()){
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
