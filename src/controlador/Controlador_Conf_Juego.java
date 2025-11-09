package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.dao.archivoJSON.IDAOUsuario;
import vista.Conf_Juego;
import vista.Ventana_Insertar;

/**
 * @author Lenovo
 * @date 7 nov 2025
 * @version 1.0
 * @description Breve descripción de la clase
 */

public class Controlador_Conf_Juego implements ActionListener{
	
	private IDAOUsuario modelo;
	private Conf_Juego vista;
	

	public Controlador_Conf_Juego(Conf_Juego vista, IDAOUsuario modelo) {
		this.vista = vista;
        this.modelo = modelo;
        
		
		vista.setActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		vista.cerrar();
		
	}
}
