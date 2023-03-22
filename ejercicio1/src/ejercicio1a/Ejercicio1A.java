package ejercicio1a;



import java.io.IOException;

public class Ejercicio1A {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Ejercicio 1 a)

		int numeros[] = new int[] {3,5,20,4};
		char letra = 'D';

		System.out.println("Ingrese los numeros: ");

		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		System.out.println("Orden elegido: " +letra);

		if (letra == 'A') {
			System.out.println("Ascendente " +letra);
			int Resultado[] = ordenAsc(numeros);

			for (int num : Resultado) {
				System.out.print(num + " ");
			}
		} else if (letra == 'D') {
			System.out.println("Descendente " +letra);
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
