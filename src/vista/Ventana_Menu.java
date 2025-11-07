package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;

/**
 * @author josel
 * @date 2 nov 2025
 * @version 1.0
 * @description Breve descripción de la clase
 */

public class Ventana_Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton btnInsertar;
	private JButton btnMostrar;
	private JButton btnActualizar;
	private JButton btnEliminar;
	private JButton btnConfiguracion;
	private JLabel lblTitulo;
	

	

	
	public Ventana_Menu() {
		getContentPane().setBackground(new Color(0, 0, 0));
		initComponents();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 777, 507);
		
		setBackground(new Color(0, 0, 0));
		//setBounds(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);
		setLocationRelativeTo(null); // centra la ventana
		setVisible(true);

	}
	
	private void initComponents() {
		getContentPane().setLayout(null);
		btnInsertar = new JButton("Insertar");
		btnInsertar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnInsertar.setBackground(new Color(102, 255, 0));
		btnInsertar.setForeground(new Color(255, 255, 0));
		btnInsertar.setBounds(326, 191, 129, 38);
		getContentPane().add(btnInsertar);
		
		btnMostrar = new JButton("Mostrar");
		btnMostrar.setBackground(new Color(0, 255, 64));
		btnMostrar.setForeground(Color.YELLOW);
		btnMostrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMostrar.setBounds(326, 239, 129, 38);
		getContentPane().add(btnMostrar);
		
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBackground(Color.GREEN);
		btnActualizar.setForeground(Color.YELLOW);
		btnActualizar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnActualizar.setBounds(326, 287, 129, 38);
		getContentPane().add(btnActualizar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setForeground(Color.YELLOW);
		btnEliminar.setBackground(Color.GREEN);
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEliminar.setBounds(326, 335, 129, 38);
		getContentPane().add(btnEliminar);
		
		btnConfiguracion = new JButton("Configuración");
		btnConfiguracion.setForeground(Color.YELLOW);
		btnConfiguracion.setBackground(Color.GREEN);
		btnConfiguracion.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnConfiguracion.setBounds(326, 383, 129, 38);
		getContentPane().add(btnConfiguracion);
		
		lblTitulo = new JLabel("Geometry Wars");
		lblTitulo.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 50));
		lblTitulo.setForeground(new Color(51, 219, 94));
		lblTitulo.setLabelFor(lblTitulo);
		lblTitulo.setBackground(new Color(57, 255, 20));
		lblTitulo.setBounds(202, 59, 462, 104);
		getContentPane().add(lblTitulo);

	}
	
	
	
	public JButton getBtnInsertar() {
		return btnInsertar;
	}
	
	
	public JButton getBtnMostrar() {
		return btnMostrar;
	}

	public JButton getBtnActualizar() {
		return btnActualizar;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public JButton getBtnConfiguracion() {
		return btnConfiguracion;
	}

	public JLabel getLblTitulo() {
		return lblTitulo;
	}


	public void setActionListener(ActionListener listener) {
		
		btnInsertar.addActionListener(listener);
		btnMostrar.addActionListener(listener);
		btnActualizar.addActionListener(listener);
		btnEliminar.addActionListener(listener);
		btnConfiguracion.addActionListener(listener);

		System.out.println("VISTA - GRÁFICA LISTA PARA ESCUCHAR EVENTOS");
	}

	// Muestra un mensaje emergente al usuario
	public void mostrarMensaje(String msg) {
		JOptionPane.showMessageDialog(this, msg);
	}

	// Cierra la ventana principal
	public void cerrar() {
		System.out.println("CERRAR - Vista GRÁFICA");
		dispose();
	}
}
