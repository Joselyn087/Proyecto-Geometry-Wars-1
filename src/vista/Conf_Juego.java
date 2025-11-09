package vista;

import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * @author Lenovo
 * @date 6 nov 2025
 * @version 1.0
 * @description Breve descripción de la clase
 */

public class Conf_Juego extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField txt_Enemigos;
	private JTextField textField;
	private JTextField txt_CantidadEnemigos;
	private JTextField txt_VidasExtra;
	private JTextField txt_VelocidadJuego;
	private JTextField txt_TipoDeArma;
	private JTextField txtDificultadNivel;

	public Conf_Juego(JFrame parent) {
		initComponent();
		
		setTitle("Menu Configuracion del Juego");
		setSize(400, 400);
		setResizable(false);
		setLocationRelativeTo(parent);
		
		setVisible(true);
	}
	
	public void initComponent() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblConfiguracionesDelJuego = new JLabel("Configuraciones del Juego");
		lblConfiguracionesDelJuego.setBounds(114, 0, 170, 14);
		getContentPane().add(lblConfiguracionesDelJuego);
		
		JLabel lblTipoDeEnemigos = new JLabel("Tipo de enemigos");
		lblTipoDeEnemigos.setBounds(10, 27, 124, 14);
		getContentPane().add(lblTipoDeEnemigos);
		
		txt_Enemigos = new JTextField();
		txt_Enemigos.setBounds(225, 24, 96, 20);
		getContentPane().add(txt_Enemigos);
		txt_Enemigos.setColumns(10);
		
		JLabel lblNivelActual = new JLabel("Nivel Actual");
		lblNivelActual.setBounds(10, 65, 96, 14);
		getContentPane().add(lblNivelActual);
		
		textField = new JTextField();
		textField.setBounds(225, 62, 96, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCantidadDeEnemigos = new JLabel("Cantidad de enemigos por tipo");
		lblCantidadDeEnemigos.setBounds(10, 101, 176, 14);
		getContentPane().add(lblCantidadDeEnemigos);
		
		txt_CantidadEnemigos = new JTextField();
		txt_CantidadEnemigos.setBounds(225, 98, 96, 20);
		getContentPane().add(txt_CantidadEnemigos);
		txt_CantidadEnemigos.setColumns(10);
		
		JLabel lblCantidadDeVidas = new JLabel("Cantidad de vidas extra");
		lblCantidadDeVidas.setBounds(10, 139, 162, 14);
		getContentPane().add(lblCantidadDeVidas);
		
		txt_VidasExtra = new JTextField();
		txt_VidasExtra.setBounds(225, 136, 96, 20);
		getContentPane().add(txt_VidasExtra);
		txt_VidasExtra.setColumns(10);
		
		JLabel lblVelocidadDelJuego = new JLabel("Velocidad del juego");
		lblVelocidadDelJuego.setBounds(10, 176, 139, 14);
		getContentPane().add(lblVelocidadDelJuego);
		
		txt_VelocidadJuego = new JTextField();
		txt_VelocidadJuego.setBounds(225, 170, 96, 20);
		getContentPane().add(txt_VelocidadJuego);
		txt_VelocidadJuego.setColumns(10);
		
		JLabel lblTipoDeArma = new JLabel("Tipo de arma del jugador");
		lblTipoDeArma.setBounds(10, 201, 151, 14);
		getContentPane().add(lblTipoDeArma);
		
		txt_TipoDeArma = new JTextField();
		txt_TipoDeArma.setBounds(225, 198, 96, 20);
		getContentPane().add(txt_TipoDeArma);
		txt_TipoDeArma.setColumns(10);
		
		JLabel lblIncrementoDeDificultad = new JLabel("Incremento de dificultad por nivel");
		lblIncrementoDeDificultad.setBounds(10, 226, 210, 26);
		getContentPane().add(lblIncrementoDeDificultad);
		
		txtDificultadNivel = new JTextField();
		txtDificultadNivel.setBounds(225, 229, 96, 20);
		getContentPane().add(txtDificultadNivel);
		txtDificultadNivel.setColumns(10);
	}
	
	//otros metodos

	public void mensaje(String msj) {
		JOptionPane.showMessageDialog(null, msj);
	}
	
	public void cerrar() {
		System.out.println("Cerrar vista Actualizar");
		dispose();
	}
	
	

	public void setActionListener(ActionListener listener) {
		
	}
}
