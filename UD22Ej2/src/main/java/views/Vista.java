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
	public JTable table_1;
	public JTextField textField_Nombre;
	public JTextField textField_Apellido;
	public JTextField textField_Direccion;
	public JTextField textField_Fecha;
	public JTextField textField_Dni;
	public JButton btnBorrarTodo, btnBuscar, btnCrearTabla, btnInsertarVideo, btnBorrarVideos, btnBuscarPorTitulo;
	public JTable tableVideos;
	public JTextField textField_Titulo;
	public JTextField textField_IDCliente;
	public JTextField textField_Director;
	public JLabel lblTitulo;
	public JLabel lblDirector;
	public JLabel lblIDCliente;
	public JTextField textField_BuscarXTitulo;
	public JLabel lblFormularioVideo;
	public JLabel lblBuscadorDeVideos;

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
		textField_BuscarNombre.setBounds(40, 311, 199, 43);
		getContentPane().add(textField_BuscarNombre);
		textField_BuscarNombre.setColumns(10);

		btnBorrarTodo = new JButton("Borrar todo");
		btnBorrarTodo.setBounds(274, 187, 187, 31);
		getContentPane().add(btnBorrarTodo);

		btnCrearTabla = new JButton("Insertar Cliente");
		btnCrearTabla.setBounds(274, 133, 187, 31);
		getContentPane().add(btnCrearTabla);

		table_1 = new JTable();
		table_1.setModel(
				new DefaultTableModel(
			new Object[][] {
				{"id", "nombre", "apellido", "dni", "direccion", "fecha"},
			},
			new String[] {
				"Id", "Nombre", "Apellido", "Dni", "Direccion", "Fecha"
			}
		));
		table_1.setBounds(23, 394, 468, 341);
		getContentPane().add(table_1);

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
		
		tableVideos = new JTable();
		tableVideos.setModel(new DefaultTableModel(
			new Object[][] {
				{"id", "titulo", "director", "id_cliente"},
			},
			new String[] {
				"ID", "Titulo", "Director", "ID_Cliente"
			}
		));
		tableVideos.setBounds(652, 394, 468, 341);
		getContentPane().add(tableVideos);
		
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
		btnInsertarVideo.setBounds(939, 133, 187, 31);
		getContentPane().add(btnInsertarVideo);
		
		btnBorrarVideos = new JButton("Borrar todo");
		btnBorrarVideos.setBounds(939, 187, 187, 31);
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

		btnCrearTabla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

	}
}
