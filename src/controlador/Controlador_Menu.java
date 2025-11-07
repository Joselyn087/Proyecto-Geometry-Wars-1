package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.dao.archivoJSON.IDAOUsuario;
import vista.Ventana_Insertar;
import vista.Ventana_Menu;
import vista.Ventana_Mostrar;

/****************************
 * 		INTERFAZ GRÁFICA 
 * 
 *  Esta clase representa el "Controlador del Menú" dentro del patrón 
 *  Modelo - Vista - Controlador (MVC).
 *  
 *  Su función es escuchar los eventos del menú principal (la vista)
 *  y decidir qué otras vistas deben abrirse, coordinando también 
 *  la creación de sus respectivos controladores.
 *  
 *  En este caso, el menú puede abrir las ventanas:
 *  	- Vista_Mostrar : para mostrar preguntas almacenadas.
 *  	- Vista_Agregar : para agregar nuevas preguntas.
 *  
 *  Cada ventana tendrá su propio controlador (Controlador_Mostrar o Controlador_Agregar),
 *  pero todos comparten el mismo modelo (IDAOPregunta), que se encarga del acceso a los datos.
 ****************************/
public class Controlador_Menu implements ActionListener{

	// Referencia al modelo (DAO), encargado de manejar el acceso al Dataset
	private IDAOUsuario modelo;
	
	// Referencias a las distintas vistas del sistema
	private Ventana_Menu vista;
	private Ventana_Insertar vistaA;
	private Ventana_Mostrar vistaM;
	
	// Referencias a los controladores secundarios
	//private Controlador_Mostrar controladorM;
	//private Controlador_Agregar controladorA;
	
	/**
	 * Dentro del patrón MVC:
	 *   - La vista (Vista_Menu) genera los eventos (clics en opciones del menú).
	 *   - El controlador (Controlador_Menu) interpreta esos eventos y 
	 *   - crea las vistas secundarias (Vista_Agregar o Vista_Mostrar).
	 *   - El modelo (IDAOPregunta) sigue siendo compartido por todas las vistas.
	 */
    public Controlador_Menu(Ventana_Menu vista, IDAOUsuario modelo) {
        this.vista = vista;
        this.modelo = modelo;
                 
		// Se registra el controlador como "oyente" (listener) 
        // de las acciones generadas por la vista del menú.
		vista.setActionListener(this);
    }
    
	/**
	 * El método actionPerformed - se ejecuta automáticamente cuando el usuario 
	 * realiza una acción en la vista.
	 * En este caso, responde a las opciones del menú:
	 * 	 - Mostrar preguntas
	 *   - Agregar preguntas
	 *   - Salir del programa
	 * 
	 * Según la opción seleccionada, el controlador crea la vista y el controlador correspondiente.
	 */
@Override    
    public void actionPerformed(ActionEvent e){
	
		/*if (e.getSource() == vista.getjM_Mostrar()){ // Opción: Mostrar preguntas almacenadas
        	vistaM = new Vista_Mostrar(vista);            
        	controladorM = new Controlador_Mostrar(vistaM, modelo);
        }/*else if (e.getSource() == vista.getjM_agregar()){ // Opción: Agregar nueva pregunta
        	vistaA = new Vista_Agregar(vista);
        	controladorA = new Controlador_Agregar(vistaA, modelo);
        }else if (e.getSource() == vista.getjMSalir()){ // Opción: Salir del programa
        	vista.cerrar();
        } */       
    }
    
}

