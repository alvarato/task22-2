package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;

import DAO.DAOCliente;
import models.Cliente;
import views.Vista;

public class Controlador implements ActionListener{

	private Cliente cliente;
	private Vista vista;
	private DAOCliente daoCliente;
	
	public Controlador (Cliente cliente, Vista vista) {
		this.cliente = cliente;
		this.vista = vista;
		this.daoCliente = new DAOCliente();
		this.vista.btnCrearTabla.addActionListener(this);
		this.vista.btnBorrarTodo.addActionListener(this);
		this.vista.btnBuscar.addActionListener(this);
	}
	
	public void iniciarVista() {
		vista.setTitle("Cliente");
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
	}
	
		

}
