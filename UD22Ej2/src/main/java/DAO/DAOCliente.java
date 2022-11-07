package DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import models.Cliente;

public class DAOCliente extends DAO{

	public void crearTabla() throws Exception {
		String query = "CREATE TABLE cliente(id int(11) NOT NULL AUTO_INCREMENT, nombre varchar(250) default null, apellido varchar(250) default null, direccion varchar(250) default null,	dni int(11) default null, fecha date default null, PRIMARY KEY (id));";
		String query2 = "INSERT INTO dbtareas.cliente (nombre, apellido, direccion, dni, fecha) VALUES ('alvaro', 'bernabey', 'ribes 27', '43597789', '2020-07-16'),('carlos', 'sanchez', 'cerdanyola 22', '40602658', '2010-05-17'),('oscar', 'vilamit', 'reus 28', '42608974', '2012-03-26'),('jose', 'martinez', ' villalba 52', '35421036', '2015-04-19'),('dani', 'jimenez', 'sucre 86', '45032156', '2011-02-14');";
		CUD(query); // Creamos la tabla
		CUD(query2); // Insertamos valores en las tablas

	}

	public void create(String nombre, String apellido, String direccion, int dni, String fecha) throws Exception {
		String query = "INSERT INTO dbtareas.cliente (nombre, apellido, direccion, dni, fecha) VALUES (";
		String aux = "'" + nombre + "', '" + apellido + "', '" + direccion + "', '" + dni + "', '" + fecha + "'";
		query = query + aux;
		CUD(query);
	}

	public ArrayList<Cliente> selectAll() throws SQLException {
		String query = "SELECT * FROM cliente";
		READ(query);
		ArrayList<Cliente> listaClientes = new ArrayList<>();
		while (resultado.next()) {
			Cliente cliente = new Cliente();
			Integer id = resultado.getInt(1);
			String nombre = resultado.getString(2);
			String apellido = resultado.getString(3);
			String direccion = resultado.getString(4);
			String fecha = resultado.getString(5);
			cliente.setId(id);
			cliente.setNombre(nombre);
			cliente.setApellido(apellido);
			cliente.setDireccion(direccion);
			cliente.setFecha(fecha);
			listaClientes.add(cliente);
		}
		return listaClientes;
	}

	public ArrayList<Cliente> selectAllWhereNombre(String name) throws SQLException {
		String query = "SELECT * FROM cliente WHERE nombre = '" + name + "';";
		READ(query);
		ArrayList<Cliente> listaClientes = new ArrayList<>();
		while (resultado.next()) {
			Cliente cliente = new Cliente();
			Integer id = resultado.getInt(1);
			String nombre = resultado.getString(2);
			String apellido = resultado.getString(3);
			String direccion = resultado.getString(4);
			String fecha = resultado.getString(5);
			cliente.setId(id);
			cliente.setNombre(nombre);
			cliente.setApellido(apellido);
			cliente.setDireccion(direccion);
			cliente.setFecha(fecha);
			listaClientes.add(cliente);
		}
		return listaClientes;
	}

	public void deleteFromId(int id) throws Exception {
		String query = "DELETE FROM	cliente WHERE id=" + id;
		CUD(query);
	}

}
