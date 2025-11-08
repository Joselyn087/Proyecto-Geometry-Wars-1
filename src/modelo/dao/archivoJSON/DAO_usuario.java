package modelo.dao.archivoJSON;

/**
 * @author Denis Gonzalez Herrera
 * @date 17 oct 2025
 * @version 1.0
 * @description Breve descripción de la clase
 */

import java.io.IOException;
import modelo.Usuario;
import modelo.dataset.ListaUsuarios;

/***********************************************
 *	ARCHIVOS - JSON 
 ***********************************************/
/***********************************************
 * CLASE: DAO_pregunta
 * PATRÓN: DAO (Data Access Object)
 * 
 * OBJETIVO:
 * Esta clase actúa como un intermediario entre el MODELO lógico (Pregunta)
 * y la estructura de almacenamiento físico o en memoria (ListaPreguntas) conocido como DATASET.
 ***********************************************/
public class DAO_usuario implements IDAOUsuario {

	private ListaUsuarios dataset;
	private EscritorJSON escritor;
	private LectorJSON lector;
	public static final String FILE_NAME = "data/RegistroUsuarios.json"; 

    /***********************************************
     * CONSTRUCTOR
     * Recibe el dataset donde se almacenan las preguntas.
     ***********************************************/	
	public DAO_usuario(ListaUsuarios dataset) {
		this.dataset = dataset;
		escritor = new EscritorJSON(dataset, FILE_NAME);
		lector = new LectorJSON(dataset, FILE_NAME);
		
		cargarUsuarios();
	}

    /***********************************************
     * Trata de leer el archivo si lo logra, Carga los datos del archivo JSON 
     * al dataset para que el programa pueda acceder directamente a la memoria.
     * Si falla la lectura del archivo se cargar datos de PRUEBA
     ***********************************************/	
	@Override
	public void cargarUsuarios() {
		try {
			lector.readAll();
		} catch (IOException ex) {
			System.err.println("Error al leer JSON. Cargando datos de prueba.");
			
		}
	}

    /***********************************************
     * Trata de almacenar todos los datos que se encuentran en el dataset.
     * y los almacena de manera permanente (PERSISTENCIA DE DATOS)
     ***********************************************/	
	@Override
	public void guardarDataset() {
		try {
			escritor.writeAll();
		} catch (IOException ex) {
			System.err.println("Error al guardar JSON: " + ex.getMessage());
		}
	}

    /***********************************************
     * MÉTODO agregar()
     * Añade una nueva pregunta al dataset.
     * Retorna true si la operación se realizó con éxito.
     ***********************************************/
	@Override
	public boolean agregar(Usuario usuario) {
		dataset.agregar(usuario);
		guardarDataset();// Guarda los datos del dataset al archivo JSON
		return true;
	}
	
    /***********************************************
     * MÉTODO generarPreguntaRandom()
     * Devuelve una pregunta seleccionada al azar del dataset.
     * 
     * Este método abstrae la forma en que se obtiene la pregunta,
     * demostrando el principio de encapsulamiento: el controlador 
     * no necesita saber si los datos están en memoria o en archivo.
     ***********************************************/
	

    /***********************************************
     * MÉTODO actualizar() SE DEBE COMPLETAR
     ***********************************************/
    @Override
    public boolean actualizar(Usuario usuario) {
        return false;
    }
    
    /***********************************************
     * MÉTODO eliminar() SE DEBE COMPLETAR
     ***********************************************/
    @Override
    public boolean eliminar(int id) {
        return true;
    }

    /***********************************************
     * MÉTODO eliminar() SE DEBE COMPLETAR
     ***********************************************/
    
    @Override
    public Usuario buscar(int id) {
    	// TODO Auto-generated method stub
    	return null;
    }
   
}
