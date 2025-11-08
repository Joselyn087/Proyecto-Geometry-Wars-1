package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.dao.archivoJSON.IDAOUsuario;
import vista.Ventana_Insertar;
import vista.Ventana_Menu;
import vista.Ventana_Mostrar;


public class Controlador_Menu implements ActionListener{

	private IDAOUsuario modelo;
	
	
	private Ventana_Menu vista;
	private Ventana_Insertar vistaI;
	private Ventana_Mostrar vistaM;
	private Controlador_Insertar controladorI;
	
	
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
        }/*else if (e.getSource() == vista.getjM_agregar()){ // Opción: Agregar nueva pregunta
        	vistaA = new Vista_Agregar(vista);
        	controladorA = new Controlador_Agregar(vistaA, modelo);
        }else if (e.getSource() == vista.getjMSalir()){ // Opción: Salir del programa
        	vista.cerrar();
        } */       
    }
    
}

