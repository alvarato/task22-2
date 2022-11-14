package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;

import DAO.DAOCliente;
import DAO.DAOVideo;
import models.Cliente;
import models.Video;
import views.Vista;

public class Controlador implements ActionListener{

	private Cliente cliente;
	private Vista vista;
	private DAOCliente daoCliente;
	private ArrayList<Cliente> lista;
	
	public Controlador (Cliente cliente, Vista vista) {
		this.cliente = cliente;
		this.vista = vista;
		this.daoCliente = new DAOCliente();
		this.vista.btnAñadirCliente.addActionListener(this);
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
		if (vista.btnCrearTabla == event.getSource()) {
			try {
				daoCliente.crearTabla();
				lista = daoCliente.selectAll();
				pintar();
			} catch (Exception e) {
				System.out.println("Fallo al crear la tabla: " + e);
			}
		} else if (vista.btnBuscar == event.getSource()) {
			try {
				System.out.println(vista.textField_BuscarNombre.getText().equals(""));
				if (vista.textField_BuscarNombre.getText().equals("")) {
					lista = daoCliente.selectAll();
					System.out.println("(Buscar todos) Lista ahora es" + this.lista);
				}
				else {
					lista = daoCliente.selectAllWhereNombre(vista.textField_BuscarNombre.getText());
					System.out.println("(Buscar " + vista.textField_BuscarNombre.getText() + ") Lista ahora es2" + this.lista);
				}
				pintar();
				System.out.println(lista);
			} catch (SQLException e) {
				System.out.println("Fallo al buscar: " + e);
			}
		} else if (vista.btnAñadirCliente == event.getSource()) {
			try {
				daoCliente.añadirNuevoCliente(vista.textField_Nombre.getText(), vista.textField_Apellido.getText(),
						vista.textField_Direccion.getText(), Integer.parseInt(vista.textField_Dni.getText()),
						vista.textField_Fecha.getText());
				lista = daoCliente.selectAll();
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
		} else if (vista.btnBorrarTodo == event.getSource()) {
			// id = Integer.parseInt(textId.getText());
			try {
				daoCliente.deleteFromId(Integer.parseInt(vista.textField_IdABorrar.getText()));
				lista = daoCliente.selectAll();
				pintar();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void pintar() {
		System.out.println("Pintamos");
		vista.textArea.setText("");
		for (int i = 0; i<this.lista.size(); i++) {
			vista.textArea.setText(vista.textArea.getText() + lista.get(i).toString() + "\n");
			System.out.println(lista.get(i).toString());
		}		
	}
	
		

}
