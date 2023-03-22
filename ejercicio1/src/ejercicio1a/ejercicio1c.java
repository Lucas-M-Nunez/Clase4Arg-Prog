package ejercicio1a;

import java.util.Scanner;

public class ejercicio1c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeros[] = new int[] { 15, 9, 16 };
		System.out.println("A: " + true);
		int ascendente = ordenar(numeros);
		ascendente = ascendente / numeros.length;
		boolean A = false;

		Scanner scn = new Scanner(System.in);
		int tamaño;
		System.out.println("Ingrese el tamaño del vector");
		tamaño = scn.nextInt();
		System.out.println("Ingrese los:  " + tamaño + " numeros");

		for (int i = 0; i < tamaño; i++) {
			numeros[i] = scn.nextInt();
		}
		int orden = 0;
		for (int j = 0; j < tamaño; j++) {
			for (int i = 0; i < tamaño - 1; i++) {
				if (numeros[i] > numeros[i + 1]) {
					orden = numeros[i];
					numeros[i] = numeros[i + 1];
					numeros[i + 1] = orden;
				}
			}
		}
		int k = 0;
		System.out.println("Numeros Ordenados: ");
		while (k < tamaño) {
			System.out.println(numeros[k]);
			k++;
		}
	}

	private static int ordenar(int numerosOrdenar[]) {
		int orden = 0;
		for (int i = 0; i < numerosOrdenar.length; i++) {
			for (int j = i; j < numerosOrdenar.length; j++) {
				if (numerosOrdenar[j] < numerosOrdenar[i]) {
					orden = numerosOrdenar[j];
					numerosOrdenar[j] = numerosOrdenar[i];
					numerosOrdenar[i] = orden;
				}
			}
		}
		for (int i = 0; i < numerosOrdenar.length; i++) {
			System.out.println(numerosOrdenar[i]);
		}
		return orden;
	}
}
