package modelo.dataset;

import java.util.Random;
import modelo.Usuario;

/**
 * @author josel
 * @date 6 nov 2025
 * @version 1.0
 * @description Breve descripción de la clase
 */

public class ListaUsuarios {
	private Usuario[] lista;
	private int size;
	private static final int TAMANO_INICIAL = 10;
	
	
	public ListaUsuarios() {
		lista = new Usuario[TAMANO_INICIAL];
		size = 0;
	}
	
	public ListaUsuarios(int tamano) {
		if (tamano >= 1) {
			lista = new Usuario[tamano];
			size = 0;
		}
	}
	
	public Usuario getElemento(int indice){
		if (indice > 0 && indice< size) {
			return lista[indice];
		}else {
			return null;
		}	
	}
	
	public boolean existeNombre(String nombre) {
	    for (int i = 0; i < size; i++) {
	        if (lista[i].getNombre().equalsIgnoreCase(nombre)) {
	            return true;
	        }
	    }
	    return false;
	}

	
	private void crecer() {
		int nuevoTamano = lista.length * 2;
		Usuario[] nuevaLista = new Usuario[nuevoTamano];
		for (int i = 0; i < lista.length; i++) {
			nuevaLista[i]= lista[i];	
		}
		lista = nuevaLista;
		System.out.println("Dataset ampliado a " + nuevoTamano + " elementos.");
	}
	
	public void agregar(Usuario usuario) {
		if (usuario != null) {
			if (size >= lista.length) {
				crecer();	
			}
			lista[size ++] = usuario;
		}else {
			System.out.println("Error");
		}
	}
	
	public void clear() {
		for (int i = 0; i < lista.length; i++) {
			lista[i] = null;
		}
		size = 0;
	}
	
	public String imprimir() {
		if (size != 0) {
			for (Usuario usuario : lista) {
				System.out.println(usuario);
			}
		}
		return null;
		
		
		
		

	}

	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}else {
			return false;
		}

	}

}
