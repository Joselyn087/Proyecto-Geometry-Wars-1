package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Usuario;
import modelo.dao.archivoJSON.IDAOUsuario;
import vista.Ventana_Insertar;

/**
 * @author josel
 * @date 7 nov 2025
 * @version 1.0
 * @description Breve descripción de la clase
 */

public class Controlador_Insertar implements ActionListener {
	private Ventana_Insertar vista;
    
    // El modelo utiliza una INTERFAZ (IDAOPregunta), lo que permite
    // intercambiar distintas implementaciones de manera POLIFORMICA
    // (por ejemplo, guardar los datos en arreglos, archivo o en base de datos, sin afectar a la vista)

    private IDAOUsuario modelo;

    /**
     * Dentro del patrón MVC:
     *  - La vista muestra los datos y recibe la interacción (eventos) del usuario.
     *  - El modelo gestiona los datos (Dataset o fuente de datos (archivos, arreglo, base de datos)).
     *  - El controlador "escucha" los eventos y coordina las acciones entre ambos.
     */
    public Controlador_Insertar(Ventana_Insertar vista, IDAOUsuario modelo) {
        this.vista = vista;
        this.modelo = modelo;
        
        // Se registra el propio controlador como oyente (listener)
        // de los eventos que genera la vista (por ejemplo, el clic en un botón "Agregar").
        vista.setActionListener(this);
    }

    /**
     * El actionPerformed es un método que se ejecuta cuando el usuario presiona el botón agregar).
     * 
     * Que hace el metodo:
     *   1. Recupera los datos que el usuario ingresó en la vista.
     *   2. Crea un objeto del modelo (Pregunta) con esos datos.
     *   3. Solicita al MODELO que guarde la pregunta (interactuando con el Dataset).
     *   4. Informa el resultado al usuario.
     */
    public void actionPerformed(ActionEvent e) {
        // 1. Obtener los datos ingresados desde la vista
        String nombre = vista.getNombre();
        char[] contrasena = vista.getContrasena();
        
        // 2. Crear un nuevo objeto del modelo (Pregunta)
        //    Este objeto representa una fila o registro de datos
        Usuario usuario = new Usuario(nombre, contrasena, 0);
        
        // 3. Delegar al MODELO la responsabilidad de guardar la pregunta.
        //    En un archivo, base de datos, arreglo, entre otros.
        boolean seAgrego = modelo.agregar(usuario);
        
        // 4. Mostrar un mensaje según el resultado
        if (seAgrego) {
            vista.mostrarMensaje("Pregunta agregada correctamente.");
        } else {
            vista.mostrarMensaje("Pregunta NO fue agregada correctamente.");
        }
        
        // 5. Cerrar la ventana de la vista agregar 
        vista.dispose();
    }
}
