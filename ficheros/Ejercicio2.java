package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Realiza un programa que lea el fichero creado en el ejercicio anterior y que
 * muestre los números por pantalla.
 * 
 * @author Álvaro Leiva Toledano
 * @version 1.0
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			// Abre el fichero primos.dat (modo lectura).
			BufferedReader br = new BufferedReader(new FileReader("primos.dat"));

			System.out.println("El contenido del fichero es el siguiente:\n");

			// Este string equivale a una línea del fichero primos.dat. De esta manera, con
			// el bucle, el programa lee todo el fichero.
			String linea = "";
			while (linea != null) {

				System.out.println(linea);
				linea = br.readLine();

			}

			// cierra el fichero.
			br.close();

		} catch (FileNotFoundException e) {
			System.err.println("Hubo algún problema al encontrar el fichero primos.dat");
		} catch (IOException e) {
			System.err.println("No fue posible leer el fichero primos.dat");
		} catch (Exception e) {
			System.err.println("Hubo algún problema con el fichero.");
		}
	}
}