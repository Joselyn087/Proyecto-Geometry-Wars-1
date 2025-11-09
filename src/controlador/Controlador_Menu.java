package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.dao.archivoJSON.IDAOUsuario;
import vista.Actualizar;
import vista.Conf_Juego;
import vista.Eliminar;
import vista.Ventana_Insertar;
import vista.Ventana_Menu;
import vista.Ventana_Mostrar;


public class Controlador_Menu implements ActionListener{

	private IDAOUsuario modelo;
	
	
	private Ventana_Menu vista;
	private Ventana_Insertar vistaI;
	private Ventana_Mostrar vistaM;
	private Actualizar vistaA;
	private Conf_Juego vistaJ;
	private Eliminar vistaEliminar;
	private Controlador_Insertar controladorI;
	private Controlador_Actualizar controladorA;
	private Controlador_Conf_Juego controladorConf;
	
	
    public Controlador_Menu(Ventana_Menu vista, IDAOUsuario modelo) {
        this.vista = vista;
        this.modelo = modelo;
                 
		
		vista.setActionListener(this);
    }
    
	
@Override    
    public void actionPerformed(ActionEvent e){
	
	if (e.getSource() == vista.getBtnInsertar()){ // Opción: Mostrar preguntas almacenadas
        	vistaI = new Ventana_Insertar(vista);       
        	controladorI = new Controlador_Insertar(vistaI, modelo);
        }else if (e.getSource() == vista.getBtnActualizar()){ // Opción: Agregar nueva pregunta
        	vistaA = new Actualizar(vista);
        	controladorA = new Controlador_Actualizar(vistaA, modelo);
        }else if (e.getSource() == vista.getBtnConfiguracion()){ // Opción: Salir del programa
        	vistaJ = new Conf_Juego(vista);
        	controladorConf = new Controlador_Conf_Juego(vistaJ, modelo);
        }       
    }
    
}

