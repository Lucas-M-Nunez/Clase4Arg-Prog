package Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		// ejercicio2
		String archivoEntrada = null;
		FileReader lectura = null;
		BufferedReader br = null;
		String textoCodificado = "";

		try {
			archivoEntrada = "A:\\ARGENTINA-PROGRAMA-4.0\\CLASES\\word tp\\TP4\\entrada.txt";
			for (String linea : Files.readAllLines(Paths.get(archivoEntrada))) {

			}
			lectura = new FileReader(archivoEntrada);
			br = new BufferedReader(lectura);
			String linea;
			int desplazamiento = 1;

			while ((linea = br.readLine()) != null) {
				String abecedario = " abcdefghijklmnñopqrstuvwxyz";
				for (int i = 0; i < linea.length(); i++) {
					char letra = linea.charAt(i);
					for (int j = 0; j < abecedario.length(); j++) {
						if (abecedario.charAt(j) == letra) {
							textoCodificado += abecedario.charAt((j + desplazamiento) % abecedario.length());
						}
					}
				}
				System.out.println("Termino correctamente");
			}

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error con el archivo");

		}

		String ruta2 = "A:\\ARGENTINA-PROGRAMA-4.0\\CLASES\\word tp\\TP4\\Salida.txt";
		try {
			Files.writeString(Paths.get(ruta2), "El texto codificado es: " + textoCodificado);

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error en el archivo");
		}
	}
}
