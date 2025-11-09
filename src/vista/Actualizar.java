package vista;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * @author Lenovo
 * @date 4 nov 2025
 * @version 1.0
 * @description Breve descripción de la clase
 */

public class Actualizar extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField txt_Nombre;
	private JTextField txt_Nivel;
	private JTextField txt_Puntaje;
	private JButton btnAceptar;
	
	public Actualizar(JFrame parent) {
		initComponent();
		
		setTitle("Menu Actualizar");
		setSize(400, 300);
		setResizable(false);
		setLocationRelativeTo(parent);
		
		setVisible(true);
	}
	
	private void initComponent() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblActualizarJugador = new JLabel("Actualizar jugador");
		lblActualizarJugador.setBounds(114, 0, 168, 24);
		getContentPane().add(lblActualizarJugador);
		
		JLabel lblBuscarPorNombre = new JLabel("Buscar por nombre: ");
		lblBuscarPorNombre.setBounds(10, 29, 126, 14);
		getContentPane().add(lblBuscarPorNombre);
		
		JLabel lblBuscarPorNivel = new JLabel("Buscar por nivel: ");
		lblBuscarPorNivel.setBounds(10, 94, 104, 14);
		getContentPane().add(lblBuscarPorNivel);
		
		JLabel lblBuscarPorPuntaje = new JLabel("Buscar por puntaje: ");
		lblBuscarPorPuntaje.setBounds(10, 161, 126, 14);
		getContentPane().add(lblBuscarPorPuntaje);
		
		txt_Nombre = new JTextField();
		txt_Nombre.setBounds(76, 54, 96, 20);
		getContentPane().add(txt_Nombre);
		txt_Nombre.setColumns(10);
		
		txt_Nivel = new JTextField();
		txt_Nivel.setBounds(76, 119, 96, 20);
		getContentPane().add(txt_Nivel);
		txt_Nivel.setColumns(10);
		
		txt_Puntaje = new JTextField();
		txt_Puntaje.setBounds(76, 186, 96, 20);
		getContentPane().add(txt_Puntaje);
		txt_Puntaje.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(147, 230, 104, 22);
		getContentPane().add(btnAceptar);
	}
	
	//set y get
	public JTextField getTxt_Nombre() {
		return txt_Nombre;
	}

	public JTextField getTxt_Nivel() {
		return txt_Nivel;
	}

	public JTextField getTxt_Puntaje() {
		return txt_Puntaje;
	}
	
	public JButton getBtnAceptar() {
		return btnAceptar;
	}
	
	//otros metodos

	public void setBtnAceptar(JButton btnAceptar) {
		this.btnAceptar = btnAceptar;
	}

	public void setActionListener(ActionListener listener) {
		btnAceptar.addActionListener(listener);
	}
	
	public void mensaje(String msj) {
		JOptionPane.showMessageDialog(null, msj);
	}
	
	public void cerrar() {
		System.out.println("Cerrar vista Actualizar");
		dispose();
	}
	
	
}
