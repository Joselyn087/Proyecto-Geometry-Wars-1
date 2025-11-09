package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.dao.archivoJSON.IDAOUsuario;
import vista.Actualizar;
import vista.Ventana_Insertar;

/**
 * @author Lenovo
 * @date 7 nov 2025
 * @version 1.0
 * @description Breve descripción de la clase
 */

public class Controlador_Actualizar implements ActionListener {
	
	private Actualizar vista;
	private IDAOUsuario modelo;
	
	public Controlador_Actualizar(Actualizar vista, IDAOUsuario modelo) {
        this.vista = vista;
        this.modelo = modelo;
        
        // Se registra el propio controlador como oyente (listener)
        // de los eventos que genera la vista (por ejemplo, el clic en un botón "Agregar").
        vista.setActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == vista.getBtnAceptar()) {
			System.out.println("Se han actualizado los datos");
			vista.cerrar();
		}
	}

}
