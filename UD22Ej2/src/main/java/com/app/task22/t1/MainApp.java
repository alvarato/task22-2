package com.app.task22.t1;

import javax.swing.JPanel;

import DAO.DAO;
import controllers.Controlador;
import controllers.ControladorVideo;
import models.Cliente;
import models.Video;
import views.Vista;

public class MainApp {
	
	private JPanel contentPane;
	
	public static void main (String[] args) throws Exception {
		
		DAO dao = new DAO();
		dao.Create();
		
		Cliente cliente = new Cliente();
		Video video = new Video();
		Vista vista = new Vista();
		Controlador controlador = new Controlador(cliente,vista);
		ControladorVideo controladorVideo = new ControladorVideo(video, vista);
		controlador.iniciarVista();
		controladorVideo.iniciarVista();
		
		//controlador.addUser();
	}

}
