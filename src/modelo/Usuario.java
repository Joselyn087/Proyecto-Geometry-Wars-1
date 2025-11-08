package modelo;
/**
 * @author josel
 * @date 1 nov 2025
 * @version 1.0
 * @description Breve descripción de la clase
 */

public class Usuario {
	public static final String NOMBRE = "nombre";
	public static final String CONTRASENA = "contrasena";
	public static final String NIVEL = "nivel";
	public static final String PUNTAJE = "puntaje";
	public static final String ID = "id";

    private String nombre;
    private char[] contrasena; 
    private int nivel;
    private int puntaje;
    private int id;
   
    public Usuario() {
        this.nombre = "";
        this.contrasena = new char[10];
        this.nivel = 0;
        this.puntaje = 0;
        this.id = 0;
    }

   
    public Usuario(String nombre, char[] contrasena, int nivel) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.nivel = nivel;
        this.id ++;
    }

    
    public String getNombre() {
    	
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            this.nombre = "No hay nombre";
        }
    }
    
    

    public char[] isContrasena() {
        return contrasena;
    }

    public void setContrasena(char[] contrasena) {
        this.contrasena = contrasena;
    }
    public boolean validarContrasena(String contrasena) {
        if (contrasena.length() < 4 || contrasena.length() > 10) {
            return false;
        }

        boolean may = false, min = false, num = false, esp = false;

        for (int i = 0; i < contrasena.length(); i++) {
            char c = contrasena.charAt(i);

            if (Character.isUpperCase(c)) may = true;
            else if (Character.isLowerCase(c)) min = true;
            else if (Character.isDigit(c)) num = true;
            else esp = true;
        }

        return may && min && num && esp;
    }
    
    public void setNivel(int nuevoNivel) {
        this.nivel = nuevoNivel;
        if (nuevoNivel > puntaje) {
            this.puntaje = nuevoNivel; 
        }
    }


   
    @Override
    public String toString() {
        return "Usuario - nombre: " + nombre + ", contrasena: " + contrasena;
    }
}
