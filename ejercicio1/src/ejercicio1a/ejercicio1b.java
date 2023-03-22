package ejercicio1a;

import java.util.Scanner;

public class ejercicio1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub

		// Ejercicio 1 b)
		Scanner leer = new Scanner(System.in);

		int numeros[];
		numeros = new int[4];
		int agregarNum;
		char letra;

		System.out.println("Ingrese los numeros: ");

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Numero en la posicion " + i + " : ");
			agregarNum = leer.nextInt();
			numeros[i] = agregarNum;
		}
		System.out.println("Ingrese la Letra 'A' o 'D'");
		letra = leer.next().charAt(0);

		if (letra == 'A') {
			int Resultado[] = ordenAsc(numeros);

			for (int num : Resultado) {
				System.out.print(num + " ");
			}
		} else if (letra == 'D') {
			int Resultado[] = ordenDesc(numeros);

			for (int num : Resultado) {
				System.out.print(num + " ");
			}
		}

	}
	
	private static int[] ordenAsc(int[] numeros) {

		for (int i = 0; i < numeros.length; i++) {
			for (int j = i + 1; j < numeros.length; j++) {

				if (numeros[j] < numeros[i]) {
					int numMenorAnterior = numeros[i];
					int nuevoNumMenor = numeros[j];
					numeros[i] = nuevoNumMenor;
					numeros[j] = numMenorAnterior;
				}
			}
		}
		return numeros;
	}

	private static int[] ordenDesc(int[] numeros) {

		for (int i = 0; i < numeros.length; i++) {
			for (int j = i + 1; j < numeros.length; j++) {

				if (numeros[j] > numeros[i]) {
					int numMenorAnterior = numeros[i];
					int nuevoNumMenor = numeros[j];
					numeros[i] = nuevoNumMenor;
					numeros[j] = numMenorAnterior;
				}
			}
		}
		return numeros;
	}

}
