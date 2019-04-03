package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import utiles.Teclado;

/**
 * Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
 * contenidas en un fichero de texto. El nombre del fichero que contiene las
 * palabras se debe pasar como argumento en la línea de comandos. El nombre del
 * fichero resultado debe ser el mismo que el original añadiendo la coletilla
 * sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una
 * línea.
 * 
 * @author Álvaro Leiva Toledano
 * @version 1.0
 */
public class Ejercicio4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// array en el que hiré recopilando cada línea que tiene el fichero.
		ArrayList<String> array = new ArrayList<String>();

		String fichero = Teclado.leerCadena("Introduce el nombre del fichero: ");

		try {
			BufferedReader br = new BufferedReader(
					new FileReader("C:\\Users\\d17letoa\\eclipse-java18\\java18\\src\\ficheros\\" + fichero + ".txt"));
			BufferedWriter bw = new BufferedWriter(
					new FileWriter("C:\\Users\\d17letoa\\eclipse-java18\\java18\\src\\ficheros\\" + fichero + "_sort.txt"));

			String linea = "";
			while (linea != null) {
				array.add(linea);
				linea = br.readLine();
			}

			br.close();

			Collections.sort(array);

			for (String x : array) {
				bw.write(x + "\n");
			}

			bw.close();

			// for (int i = 0; i < array.size(); i++) {
			// System.out.println(array.get(i));
			// }

			System.out.println(array.get(0));

			System.out.println("Operación realizada correctamente.");

		} catch (FileNotFoundException e) {
			System.err.println("El fichero indicado no existe");
		} catch (IOException e) {
			System.err.println("No se ha podido escribir en el archivo");
		}
	}
}
