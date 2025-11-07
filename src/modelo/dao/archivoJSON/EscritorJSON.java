package modelo.dao.archivoJSON;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.json.JSONArray;
import org.json.JSONObject;

import modelo.Usuario;
import modelo.dataset.ListaUsuarios;

public class EscritorJSON {

	private ListaUsuarios dataset;
	private final String fileName;

	public EscritorJSON(ListaUsuarios dataset, String fileName) {
		this.dataset = dataset;
		this.fileName = fileName;
	}

	/**
	 * Guarda todas las preguntas en un archivo JSON con estructura: { "preguntas":
	 * [ { "enunciado": "...", "respuesta": true }, ... ] }
	 * 
	 * @param fileName ruta del archivo de salida
	 * @throws IOException
	 */
	public void writeAll() throws IOException {
		File file = new File(fileName);

		// Crear directorios si no existen
		file.getParentFile().mkdirs();

		JSONArray jsonArray = new JSONArray();

		for (int i = 0; i < dataset.getSize(); i++) {
			Usuario usuario = dataset.getElemento(i);
			if (usuario != null) {
				JSONObject elemento_json = new JSONObject();
				elemento_json.put(Usuario.NOMBRE, usuario.getNombre());
				elemento_json.put(Usuario.CONTRASENA, usuario.isContrasena());
				
				//añadir el  resto 
				jsonArray.put(elemento_json);
			}
		}

		JSONObject root = new JSONObject();
		root.put("data", jsonArray);

		try (FileOutputStream output = new FileOutputStream(file)) {
			output.write(root.toString(4).getBytes(StandardCharsets.UTF_8));
			System.out.println("Archivo JSON guardado en: " + file.getAbsolutePath());
		} catch (IOException e) {
			System.err.println("Error al guardar JSON: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
