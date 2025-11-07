package modelo.dao.archivoJSON;


import modelo.Usuario;

/**
 * Interfaz IDAOPregunta
 * 
 * Esta interfaz define las operaciones básicas que se pueden realizar
 * sobre los objetos de tipo Pregunta dentro del modelo.
 * 
 * Forma parte del patrón DAO (Data Access Object), el cual separa
 * la lógica de acceso a datos del resto de la aplicación (Modelo, Vista y Controlador).
 * 
 * Esto permite cambiar la forma en que se almacenan los datos (por ejemplo,
 * en memoria, en archivos o en bases de datos) sin modificar otras partes del programa.
 */
public interface IDAOUsuario {


    /**
     * Se encarga de leer los datos y cargarlos al dataset.
     */
    public abstract void cargarPreguntas();

    /**
     * Se encarga de almacenar o guardar los datos que estan en el dataset.
     */
   public abstract void guardarDataset();

	/**
     * Agrega una nueva pregunta al almacenamiento de datos.
     * 
     * @param pregunta objeto de tipo Pregunta que se desea agregar
     * @return true si la operación fue exitosa, false en caso contrario
     * 
     * Ejemplo de uso:
     * dao.agregar(new Pregunta("¿El sol es una estrella?", true));
     */
    public abstract boolean agregar(Usuario usuario);

    /**
     * Devuelve una pregunta aleatoria del conjunto disponible en el dataset.
     * @return una instancia de Pregunta seleccionada al azar o null si no hay preguntas
     */
   
    
    /**
     * Actualiza los datos de una pregunta existente.
     * @param pregunta, objeto Pregunta con los nuevos datos (se asume que el objeto ya existe)
     * @return true si la actualización fue exitosa, false en caso contrario
     */
    public abstract boolean actualizar(Usuario usuario);
    
    /**
     * Elimina una pregunta del almacenamiento según su identificador.
     * @param id identificador único de la pregunta a eliminar
     * @return true si se eliminó correctamente, false si no se encontró
     */
    public abstract boolean eliminar(int id);
    
    /**
     * Busca una pregunta específica según su identificador.
     * @param id identificador único de la pregunta
     * @return el objeto Pregunta correspondiente o null si no existe
     */
    public abstract Usuario buscar(int id);
}
