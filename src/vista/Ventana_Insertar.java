package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;

/**
 * @author josel
 * @date 6 nov 2025
 * @version 1.0
 * @description Breve descripción de la clase
 */

public class Ventana_Insertar extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textNombre;
	private JPasswordField passwordField;

	
	public static void main(String[] args) {
		try {
			Ventana_Insertar dialog = new Ventana_Insertar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public Ventana_Insertar() {
		setTitle("Crear nuevo usuario");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(0, 0, 0));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre o nickname: ");
		lblNombre.setForeground(new Color(255, 255, 0));
		lblNombre.setBounds(53, 34, 167, 18);
		contentPanel.add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBackground(new Color(0, 255, 0));
		textNombre.setBounds(52, 54, 230, 18);
		contentPanel.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Contraseña:");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setBounds(53, 95, 84, 12);
		contentPanel.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(0, 255, 0));
		passwordField.setBounds(53, 117, 229, 18);
		contentPanel.add(passwordField);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(0, 0, 0));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnGuardar = new JButton("Guardar");
				btnGuardar.setBackground(new Color(255, 255, 0));
				btnGuardar.setActionCommand("OK");
				buttonPane.add(btnGuardar);
				getRootPane().setDefaultButton(btnGuardar);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setBackground(new Color(255, 255, 0));
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
