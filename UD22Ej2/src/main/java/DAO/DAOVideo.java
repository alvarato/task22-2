package DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import models.Video;

public class DAOVideo extends DAO {
	
	public void crearTabla() throws Exception{
		
		String query = "CREATE TABLE videos(id int(11) NOT NULL AUTO_INCREMENT, titulo varchar(250) default null, director varchar(250) default null, id_cliente int(11) default null, PRIMARY KEY (id), CONSTRAINT videos_fk FOREIGN KEY (id_cliente) REFERENCES cliente(id));";
		String query2 = "INSERT INTO videos (titulo, director, id_cliente) VALUES ('Manequin Challenge', 'Alfonso Cuaron', '1'),('Unboxing', 'Ted Burton', '2'),('Tik Tok Compilation', 'Pedro Almodovar', '3'),('Funny fails', 'Alfred Hitchcock', '4'),('Reto de la canela', 'David Copperfield', '5');";
		CUD(query); // Creamos la tabla
		CUD(query2); // Insertamos valores en las tablas
		
	}
	
	public void create(String titulo, String director, int id_cliente) throws Exception {
		System.out.println("Creamos nuevo video");
		String query = "INSERT INTO videos (titulo, director, id_cliente) VALUES (";
		String aux = "'" + titulo + "', '" + director + "', '" + id_cliente + "');";
		query = query + aux;
		CUD(query);
		
	}
	
	public ArrayList<Video> selectAll() throws SQLException {
		
		String query = "SELECT * FROM videos";
		READ(query);
		ArrayList<Video> listaVideos = new ArrayList<>();
		
		while (resultado.next()) {
			
			Video video = new Video();
			Integer id = resultado.getInt(1);
			String titulo = resultado.getString(2);
			String director = resultado.getString(3);
			int id_cliente = resultado.getInt(4);
			video.setId(id);
			video.setTitulo(titulo);
			video.setDirector(director);
			video.setId_cliente(id_cliente);
			listaVideos.add(video);
			
		}
		
		return listaVideos;
		
	}
	
	public ArrayList<Video> selectAllWhereTitulo(String titulo) throws SQLException {
		
		String query = "SELECT * FROM videos WHERE titulo = '" + titulo + "';";
		READ(query);
		ArrayList<Video> listaVideos = new ArrayList<>();
		
		while (resultado.next()) {
			
			Video video = new Video();
			Integer id = resultado.getInt(1);
			String title = resultado.getString(2);
			String director = resultado.getString(3);
			int id_cliente = resultado.getInt(4);
			video.setId(id);
			video.setTitulo(title);
			video.setDirector(director);
			video.setId_cliente(id_cliente);
			listaVideos.add(video);
			
		}
		
		return listaVideos;
		
	}
	
	public void deleteFromId(int id) throws Exception {
		String query = "DELETE FROM	videos WHERE id=" + id;
		CUD(query);
	}
	

}
