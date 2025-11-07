package Principal;

import controlador.Controlador_Menu;
import modelo.dao.archivoJSON.DAO_usuario;
import modelo.dataset.ListaUsuarios;
import vista.Ventana_Menu;

/**
 * @author josel
 * @date 7 nov 2025
 * @version 1.0
 * @description Breve descripción de la clase
 */

public class Prueba {
	private ListaUsuarios dataset;

	public static void main(String[] args) {
		Prueba prueba = new Prueba();
		prueba.iniciar();

	}
	
	public void iniciar() {
		dataset = new ListaUsuarios();
		DAO_usuario modelo = new DAO_usuario(dataset);
		Ventana_Menu vista = new Ventana_Menu();
		Controlador_Menu controlador = new Controlador_Menu(vista, modelo);
		

	}

}
