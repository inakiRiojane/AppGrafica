package login;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7446704165038411251L;
	private static Login frame;
	private static int AnchoLabel = 100; // las statics se ponen en mayusculas
	private static int AltoLabel = 20;

	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				frame = new Login();
				frame.setSize(800, 600);
				frame.setResizable(false);
				frame.setVisible(true);
				frame.cambioPanel(1);

			}
		});

	}

	protected void cambioPanel(int opcion) {

		switch (opcion) {

		case 1:
			frame.setContentPane(datosVentanPrincipal());
			break;
		case 2:
			frame.setContentPane(panelRegistrar());
		}
	}

	// ahora mismo no se esta utilizando
	public void ventanaPrincipal() {
		JFrame ventana = new JFrame("Ventana");
		ventana.setSize(800, 600);
		ventana.setResizable(false);// no puedes cambiarle el tama�o a la ventana
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);

// en un equals la variable constante se pone al principio 

	}

	public JPanel datosVentanPrincipal() {

		JPanel login = new JPanel();

		login.setBounds(0, 0, frame.getWidth(), frame.getHeight());
		login.setLayout(null);
		JLabel usuario = new JLabel("Introduce el usuario: ");
		JLabel contrase�a = new JLabel("Introduce la contrase�a: ");
		usuario.setBounds(60, 150, AnchoLabel, AltoLabel);
		contrase�a.setBounds(60, 200, AnchoLabel, AltoLabel);

		login.add(contrase�a);
		login.add(usuario);

		JTextField nombre = new JTextField();
		JTextField contrase�a2 = new JTextField();
		nombre.setBounds(200, 150, AnchoLabel, AltoLabel);
		contrase�a2.setBounds(200, 200, AnchoLabel, AltoLabel);
		login.add(nombre);
		login.add(contrase�a2);

		JLabel error = new JLabel();
		error.setBounds(150, 300, 200, AltoLabel);
		error.setForeground(Color.BLUE);
		login.add(error);

		JButton botonLogin = new JButton("Log");
		botonLogin.setBounds(150, 250, AnchoLabel, AltoLabel);
		botonLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (nombre.getText().equalsIgnoreCase("Elorrieta")
						&& contrase�a2.getText().equalsIgnoreCase("Elorrieta")) {
					frame.cambioPanel(2);

				} else if (!nombre.getText().equalsIgnoreCase("Elorrieta")
						&& contrase�a2.getText().equalsIgnoreCase("Elorrieta")) {
					error.setText("Nombre incorrecto");

				} else if (nombre.getText().equalsIgnoreCase("Elorrieta")
						&& !contrase�a2.getText().equalsIgnoreCase("Elorrieta")) {
					
					error.setText("Contrase�a incorrecto");


				} else if (!nombre.getText().equalsIgnoreCase("Elorrieta")
						&& !contrase�a2.getText().equalsIgnoreCase("Elorrieta")) {
					error.setText("Nombre y contrase�a incorrectos");

				}

			}

		});
		login.add(botonLogin);
		return login;

	}

	public JPanel panelRegistrar() {
		JPanel login = new JPanel();
		// asignar tama�o suponer 600 x 600
		login.setBounds(0, 0, frame.getWidth(), frame.getHeight());
		// disposicion absoluta
		login.setLayout(null);

		JLabel lblUsuario = new JLabel("Usuario");
		JLabel lblPass = new JLabel("Contrase�a");
		// posicion label usuario
		lblUsuario.setBounds(60, 150, AnchoLabel, AltoLabel);
		lblPass.setBounds(60, 200, AnchoLabel, AltoLabel);
		login.add(lblUsuario);
		login.add(lblPass);

		JButton btnLogin = new JButton("login");
		btnLogin.setBounds(150, 250, AnchoLabel, AltoLabel);
		btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.cambioPanel(2);

			}
		});
		login.add(btnLogin);
		return login;
	}
}
