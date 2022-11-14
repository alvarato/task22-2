package models;

public class Video {
	
	private int id;
	private String titulo;
	private String director;
	private int id_cliente;
	
	public Video() {
		
	}
	
	public Video(int id, String titulo, String director, int id_cliente) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.director = director;
		this.id_cliente = id_cliente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	@Override
	public String toString() {
		return "El vídeo " + id + ", se llama " + titulo + ", su director es " + director + ", y el ID del cliente es " + id_cliente ;
	}

}
