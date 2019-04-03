package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import utiles.Teclado;

/**
 * Realiza un programa que diga cuántas ocurrencias de una palabra hay en un
 * fichero. Tanto el nombre del fichero como la palabra se deben pasar como
 * argumentos en la línea de comandos.
 * 
 * @author Álvaro Leiva Toledano
 * @version 1.0
 */
public class Ejercicio6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int contador = 0;
		String nombreFichero = "";
		String palabra = "";

		nombreFichero = Teclado.leerCadena("Introduce el nombre del fichero: ");
		palabra = Teclado.leerCadena("Palabra a buscar: ");

		try {

			// Se abre el fichero (modo lectura)
			BufferedReader br = new BufferedReader(
					new FileReader("C:\\Users\\d17letoa\\eclipse-java18\\java18\\src\\ficheros\\" + nombreFichero + ".txt"));

			// Ambos strings deben estar inicializados, o dará error.
			String linea = "";
			String contenidoLinea = "";

			while (linea != null) {
				contenidoLinea = linea;
				linea = br.readLine();

				// Creo un array donde almacenaré cada palabra del fichero. Se inicializa para
				// evitar que en el for-each pueda dar un error.
				String[] palabrasFichero = new String[] { "" };

				if (linea != null) {
					palabrasFichero = linea.split(" "); // split separa las palabras para almacenarse
				}

				// Recorre el array palabrasFichero[], y si coincide con la palabra a buscar,
				// aumenta el contador
				for (String i : palabrasFichero) {
					if (i.equals(palabra)) {
						contador++;
					}
				}
			}

			// Se cierra el fichero.
			br.close();

		} catch (FileNotFoundException e) {
			System.err.println("No se ha encontrado el fichero.");
		} catch (IOException e) {
			System.err.println("Error al leer el fichero.");
		}

		System.out.println("La palabra " + palabra + " se encontró " + contador + " veces.");
	}
}