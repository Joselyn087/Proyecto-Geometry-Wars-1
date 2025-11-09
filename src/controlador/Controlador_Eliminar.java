package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Eliminar;

/**
 * @author Lenovo
 * @date 7 nov 2025
 * @version 1.0
 * @description Breve descripción de la clase
 */

public class Controlador_Eliminar implements ActionListener{
	
	private Eliminar eliminar;

	public Controlador_Eliminar(Eliminar eliminar) {
		this.eliminar = eliminar;
		
		eliminar.setActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		eliminar.cerrar();
		
	}
	
}
