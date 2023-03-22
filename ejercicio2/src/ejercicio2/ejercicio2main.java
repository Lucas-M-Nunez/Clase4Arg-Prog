package ejercicio2;

import static java.lang.Integer.parseInt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ejercicio2main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ejercicio 2;
        Scanner leer = new Scanner(System.in);

        int suma = 0;
        int multiplicacion = 1;
        char operacion;

        Path archivo = Paths.get("A:\\ARGENTINA-PROGRAMA-4.0\\CLASES\\word tp\\TP4\\numeros.txt");

        System.out.print("Ingrese la operacion a realizar: ");
        operacion = leer.next().charAt(0);

        if (operacion == 'x') {
            System.out.println("Multiplicacion: ");
            try {
				for (String line : Files.readAllLines(archivo)) {
				    System.out.println(line);
				    int num = parseInt(line);
				    multiplicacion = multiplicacion * num;
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println("La multiplicacion de todos los numeros es: " + multiplicacion);
        } else if (operacion == 's') {
//          Recorriendo el Archivo:
            System.out.println("Suma: ");
            try {
				for (String line : Files.readAllLines(archivo)) {
				    System.out.println(line);
				    suma += parseInt(line);
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

            System.out.println("La sumatoria de todos los numeros es: " + suma);
        }

	}

}
