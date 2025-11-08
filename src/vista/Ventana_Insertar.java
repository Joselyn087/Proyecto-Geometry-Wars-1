package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.event.ActionEvent;

/**
 * @author josel
 * @date 6 nov 2025
 * @version 1.0
 * @description Breve descripción de la clase
 */

public class Ventana_Insertar extends JDialog {

	private static final long serialVersionUID = 1L;
	
	private JTextField textNombre;
	private JPasswordField passwordField;
	private JButton btnGuardar;
	



	
	public Ventana_Insertar(JFrame parent) {
		super(parent); // Si extiende de JDialog
	    setTitle("Crear nuevo usuario");

	    // Configuración básica
	    setBounds(100, 100, 450, 300);
	    setResizable(false);
	    setLocationRelativeTo(parent);

	    // Layout nulo (manual)
	    getContentPane().setLayout(null);
	    getContentPane().setBackground(Color.BLACK);

	    // Inicializar componentes
	    initComponent();

	    // Mostrar ventana DESPUÉS de terminar la construcción
	    setVisible(true);
		
		
		
		
		
		
	}
	
	private void initComponent() {
		JLabel lblNombre = new JLabel("Nombre o nickname: ");
		lblNombre.setForeground(new Color(255, 255, 0));
		lblNombre.setBounds(53, 34, 167, 18);
		getContentPane().add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBackground(new Color(0, 255, 0));
		textNombre.setBounds(52, 54, 230, 18);
		getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Contraseña:");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setBounds(53, 95, 84, 12);
		getContentPane().add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(0, 255, 0));
		passwordField.setBounds(53, 117, 229, 18);
		getContentPane().add(passwordField);
		
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setForeground(new Color(255, 255, 0));
		btnGuardar.setBackground(new Color(0, 255, 0));
		btnGuardar.setBounds(198, 145, 84, 20);
		getContentPane().add(btnGuardar);

	}
	
	public void setActionListener(ActionListener listener) {
        btnGuardar.addActionListener(listener);
        
        System.out.println("VISTA - GRÁFICA LISTA PARA ESCUCHAR EVENTOS");
    }   
    
    // Muestra un mensaje emergente (reutilizable por el controlador)
    public void mostrarMensaje(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }

    // Cierra la ventana
    public void cerrar() {
        System.out.println("CERRAR - Vista GRÁFICA - Agregar");
        dispose();
    }

    // Obtiene el texto que el usuario escribió como pregunta
    public String getNombre() {
        return textNombre.getText();
    }

    // Devuelve la opción seleccionada (true si es "Verdadero")
    public char[] getContrasena() {
        return passwordField.getPassword();
    } 
}
