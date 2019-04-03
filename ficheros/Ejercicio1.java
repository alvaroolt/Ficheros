package ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Escribe un programa que guarde en un fichero con nombre primos.dat los
 * números primos que hay entre 1 y 500.
 * 
 * @author Álvaro Leiva Toledano
 * @version 0.9
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String ruta = "C:\\Users\\d17letoa\\eclipse-java18\\java18\\src\\ficheros\\primos.dat";
			// Creamos el fichero (en modo escritura).
			BufferedWriter bw = new BufferedWriter(new FileWriter(ruta));

			// arraylist en el que se almacenarán los números primos, para luego imprimir el
			// contenido del arraylist a un fichero.
			ArrayList<Integer> numerosPrimos = new ArrayList<Integer>();

			// Sucesión de números desde el 0 al 500 para comprobar cuáles son primos.
			for (int i = 0; i < 501; i++) {
				if (compruebaSiPrimo(i) == true) {
					numerosPrimos.add(i);
				}
			}

			for (int i : numerosPrimos) {
				bw.write(i + "\n");
			}
			bw.close();
			System.out.println("Fichero guardado con éxito.");
		} catch (IOException e) {
			System.err.println("ERROR. El fichero no se ha guardado.");
		}
	}

	private static boolean compruebaSiPrimo(int numero) {

		// números menores que 1 no son primos.
		if (numero <= 1) {
			return false;
		}

		// el número 2 siempre es primo.
		else if (numero == 2) {
			return true;
		} else {
			for (int i = 2; i < numero; i++) {
				if (numero % i == 0) {
					return false;
				}
			}
			return true;
		}
	}

}