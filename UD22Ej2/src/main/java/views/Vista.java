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

public class Vista extends JFrame {

	private JPanel contentPane;
	public JTextField textField_BuscarNombre;
	public JTable table_1;
	public JTextField textField_Nombre;
	public JTextField textField_Apellido;
	public JTextField textField_Direccion;
	public JTextField textField_Fecha;
	public JTextField textField_Dni;
	public JButton btnBorrarTodo, btnBuscar, btnCrearTabla;

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
	//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//	setBounds(100, 100, 944, 548);
	//	contentPane = new JPanel();
	//	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

	//	setContentPane(contentPane);
		setLayout(null);

		btnBuscar = new JButton("Buscar por nombre");
		btnBuscar.setBounds(748, 12, 168, 43);
		add(btnBuscar);

		textField_BuscarNombre = new JTextField();
		textField_BuscarNombre.setBounds(562, 12, 160, 43);
		add(textField_BuscarNombre);
		textField_BuscarNombre.setColumns(10);

		btnBorrarTodo = new JButton("Borrar todo");
		btnBorrarTodo.setBounds(12, 479, 117, 25);
		add(btnBorrarTodo);

		btnCrearTabla = new JButton("Insertar Cliente");
		btnCrearTabla.setBounds(39, 311, 150, 31);
		add(btnCrearTabla);

		table_1 = new JTable();
		table_1.setModel(
				new DefaultTableModel(new Object[][] { { "id", "nombre", "apellido", "dni", "direccion", "fecha" }, },
						new String[] { "Id", "Nombre", "Apellido", "Dni", "Direccion", "Fecha" }));
		table_1.setBounds(448, 66, 468, 382);
		add(table_1);

		textField_Nombre = new JTextField();
		textField_Nombre.setBounds(39, 151, 114, 19);
		add(textField_Nombre);
		textField_Nombre.setColumns(10);

		textField_Apellido = new JTextField();
		textField_Apellido.setColumns(10);
		textField_Apellido.setBounds(39, 184, 114, 19);
		add(textField_Apellido);

		textField_Direccion = new JTextField();
		textField_Direccion.setColumns(10);
		textField_Direccion.setBounds(39, 212, 114, 19);
		add(textField_Direccion);

		textField_Fecha = new JTextField();
		textField_Fecha.setColumns(10);
		textField_Fecha.setBounds(39, 244, 114, 19);
		add(textField_Fecha);

		textField_Dni = new JTextField();
		textField_Dni.setColumns(10);
		textField_Dni.setBounds(39, 270, 114, 19);
		add(textField_Dni);

		JLabel lblNombre = new JLabel("Apellido");
		lblNombre.setBounds(191, 186, 70, 15);
		add(lblNombre);

		JLabel lblNombre_1 = new JLabel("Nombre");
		lblNombre_1.setBounds(191, 153, 70, 15);
		add(lblNombre_1);

		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(191, 214, 70, 15);
		add(lblDireccion);

		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(191, 246, 70, 15);
		add(lblFecha);

		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(191, 272, 70, 15);
		add(lblDni);

		JLabel lblNombre_1_1 = new JLabel("Panel de clientes");
		lblNombre_1_1.setBounds(50, 12, 178, 53);
		add(lblNombre_1_1);

		btnCrearTabla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});

	}
}
