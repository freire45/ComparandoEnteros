package br.com.erickfreire.comparandoenteros;

import java.util.Scanner;

public class ComparandoEnteros {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.println("Programa que compara dos valores enteros: ");
		System.out.print("Introduzca el primer valor:");
		numero1 = entrada.nextInt();
		
		System.out.print("Introduzca el segundo valor:");
		numero2 = entrada.nextInt();
		
		if(numero1 > numero2)
			System.out.printf("El numero %d es mas grande!", numero1);
		
		if(numero1 < numero2)
			System.out.printf("El numero %d es mas grande!", numero2);
		
		if(numero1 == numero2)
			System.out.printf("Los numeros %d y %d son iguales!", numero1, numero2);

	}

}
