package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Vista extends JFrame {

	private JPanel contentPane;
	public JTextField textField_BuscarNombre;
	public JTextField textField_Nombre;
	public JTextField textField_Apellido;
	public JTextField textField_Direccion;
	public JTextField textField_Fecha;
	public JTextField textField_Dni;
	public JButton btnBorrarTodo, btnBuscar, btnCrearTabla, btnInsertarVideo, btnBorrarVideos, btnBuscarPorTitulo, btnAñadirCliente, btnCrearTablaVideo;
	public JTextArea textArea;
	public JTextField textField_IdABorrar;
	public JTextArea textAreaCliente, textArea_Video;
	public JTextField textField_Titulo;
	public JTextField textField_IDCliente;
	public JTextField textField_Director;
	public JLabel lblTitulo;
	public JLabel lblDirector;
	public JLabel lblIDCliente;
	public JTextField textField_BuscarXTitulo;
	public JLabel lblFormularioVideo;
	public JLabel lblBuscadorDeVideos;
	public JTextField textFieldBorrarVideo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		setBounds(20, 20, 1244, 948);
		getContentPane().setLayout(null);
	//	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

	//	setContentPane(contentPane);
	//	getContentPane().setLayout(null);

		btnBuscar = new JButton("Buscar por nombre");
		btnBuscar.setBounds(257, 311, 168, 43);
		getContentPane().add(btnBuscar);

		textField_BuscarNombre = new JTextField();
		textField_BuscarNombre.setBounds(39, 311, 199, 43);
		getContentPane().add(textField_BuscarNombre);
		textField_BuscarNombre.setColumns(10);

		btnBorrarTodo = new JButton("Borrar");
		btnBorrarTodo.setBounds(447, 381, 70, 31);
		getContentPane().add(btnBorrarTodo);

		btnCrearTabla = new JButton("Crear tabla");
		btnCrearTabla.setBounds(274, 125, 187, 31);
		getContentPane().add(btnCrearTabla);

		textField_Nombre = new JTextField();
		textField_Nombre.setBounds(39, 100, 114, 19);
		getContentPane().add(textField_Nombre);
		textField_Nombre.setColumns(10);

		textField_Apellido = new JTextField();
		textField_Apellido.setColumns(10);
		textField_Apellido.setBounds(39, 130, 114, 19);
		getContentPane().add(textField_Apellido);

		textField_Direccion = new JTextField();
		textField_Direccion.setColumns(10);
		textField_Direccion.setBounds(39, 161, 114, 19);
		getContentPane().add(textField_Direccion);

		textField_Fecha = new JTextField();
		textField_Fecha.setColumns(10);
		textField_Fecha.setBounds(39, 192, 114, 19);
		getContentPane().add(textField_Fecha);

		textField_Dni = new JTextField();
		textField_Dni.setColumns(10);
		textField_Dni.setBounds(39, 226, 114, 19);
		getContentPane().add(textField_Dni);

		JLabel lblNombre = new JLabel("Apellido");
		lblNombre.setBounds(191, 133, 70, 15);
		getContentPane().add(lblNombre);

		JLabel lblNombre_1 = new JLabel("Nombre");
		lblNombre_1.setBounds(191, 103, 70, 15);
		getContentPane().add(lblNombre_1);

		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(191, 164, 70, 15);
		getContentPane().add(lblDireccion);

		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(191, 195, 70, 15);
		getContentPane().add(lblFecha);

		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(191, 226, 70, 15);
		getContentPane().add(lblDni);
		
		JLabel lblClientes = new JLabel("Panel Clientes");
		lblClientes.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblClientes.setBounds(153, 11, 168, 43);
		getContentPane().add(lblClientes);
		
		JLabel lblFormularioCliente = new JLabel("Formulario para añadir nuevo cliente:");
		lblFormularioCliente.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFormularioCliente.setHorizontalAlignment(SwingConstants.LEFT);
		lblFormularioCliente.setBounds(39, 65, 315, 14);
		getContentPane().add(lblFormularioCliente);
		
		JLabel lblBuscarNombre = new JLabel("Buscador de clientes por nombre:");
		lblBuscarNombre.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBuscarNombre.setBounds(40, 277, 260, 14);
		getContentPane().add(lblBuscarNombre);
		
		btnAñadirCliente = new JButton("Añadir Cliente");
		btnAñadirCliente.setBounds(274, 187, 187, 31);
		getContentPane().add(btnAñadirCliente);
		
		textArea = new JTextArea();
		textArea.setBounds(39, 430, 478, 300);
		getContentPane().add(textArea);
		
		textField_IdABorrar = new JTextField();
		textField_IdABorrar.setBounds(257, 386, 168, 19);
		getContentPane().add(textField_IdABorrar);
		textField_IdABorrar.setColumns(10);
		
		JLabel lblVideos = new JLabel("Panel Videos");
		lblVideos.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblVideos.setBounds(812, 11, 168, 43);
		getContentPane().add(lblVideos);
		
		textField_Titulo = new JTextField();
		textField_Titulo.setColumns(10);
		textField_Titulo.setBounds(705, 100, 114, 19);
		getContentPane().add(textField_Titulo);
		
		textField_IDCliente = new JTextField();
		textField_IDCliente.setColumns(10);
		textField_IDCliente.setBounds(705, 226, 114, 19);
		getContentPane().add(textField_IDCliente);
		
		textField_Director = new JTextField();
		textField_Director.setColumns(10);
		textField_Director.setBounds(705, 161, 114, 19);
		getContentPane().add(textField_Director);
		
		lblTitulo = new JLabel("Título");
		lblTitulo.setBounds(858, 103, 70, 15);
		getContentPane().add(lblTitulo);
		
		lblDirector = new JLabel("Director");
		lblDirector.setBounds(858, 164, 70, 15);
		getContentPane().add(lblDirector);
		
		lblIDCliente = new JLabel("ID Cliente");
		lblIDCliente.setBounds(858, 229, 70, 15);
		getContentPane().add(lblIDCliente);
		
		textField_BuscarXTitulo = new JTextField();
		textField_BuscarXTitulo.setColumns(10);
		textField_BuscarXTitulo.setBounds(705, 311, 199, 43);
		getContentPane().add(textField_BuscarXTitulo);
		
		btnBuscarPorTitulo = new JButton("Buscar por título");
		btnBuscarPorTitulo.setBounds(929, 311, 168, 43);
		getContentPane().add(btnBuscarPorTitulo);
		
		btnInsertarVideo = new JButton("Insertar Video");
		btnInsertarVideo.setBounds(939, 187, 187, 31);
		getContentPane().add(btnInsertarVideo);
		
		btnBorrarVideos = new JButton("Borrar");
		btnBorrarVideos.setBounds(1124, 381, 82, 31);
		getContentPane().add(btnBorrarVideos);
		
		lblFormularioVideo = new JLabel("Formulario para añadir nuevo video:");
		lblFormularioVideo.setHorizontalAlignment(SwingConstants.LEFT);
		lblFormularioVideo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFormularioVideo.setBounds(705, 65, 315, 14);
		getContentPane().add(lblFormularioVideo);
		
		lblBuscadorDeVideos = new JLabel("Buscador de videos por nombre:");
		lblBuscadorDeVideos.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBuscadorDeVideos.setBounds(705, 278, 260, 14);
		getContentPane().add(lblBuscadorDeVideos);
		
		textArea_Video = new JTextArea();
		textArea_Video.setBounds(661, 430, 545, 300);
		getContentPane().add(textArea_Video);
		
		btnCrearTablaVideo = new JButton("Crear tabla");
		btnCrearTablaVideo.setBounds(939, 125, 187, 31);
		getContentPane().add(btnCrearTablaVideo);
		
		JLabel lblNewLabel = new JLabel("Borrar cliente (por identificador):");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(39, 389, 222, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblBorrarVideopor = new JLabel("Borrar video (por identificador):");
		lblBorrarVideopor.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBorrarVideopor.setBounds(706, 389, 222, 14);
		getContentPane().add(lblBorrarVideopor);
		
		textFieldBorrarVideo = new JTextField();
		textFieldBorrarVideo.setColumns(10);
		textFieldBorrarVideo.setBounds(929, 386, 168, 19);
		getContentPane().add(textFieldBorrarVideo);

		btnCrearTabla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

	}
}
