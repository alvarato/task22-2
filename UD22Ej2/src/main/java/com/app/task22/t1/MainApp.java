package com.app.task22.t1;

import javax.swing.JPanel;

import controllers.Controlador;
import models.Cliente;
import models.Video;
import views.Vista;

public class MainApp {
	
	private JPanel contentPane;
	
	public static void main (String[] args) {
		Cliente cliente = new Cliente();
		Video video = new Video();
		Vista vista = new Vista();
		Controlador controlador = new Controlador(cliente,video,vista);
		controlador.iniciarVista();
		//controlador.addUser();
	}
}