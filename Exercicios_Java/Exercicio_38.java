package Exercicios_java;

import java.util.Scanner;

class Exercicio_38 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int valor = 0;
		boolean numeroPrimo;

		System.out.println("Digite um valor: ");
		valor = teclado.nextInt();
		
		teclado.close();

		if (valor == 2) {
			numeroPrimo = true;
		} else if (valor % 2 == 0) {
			numeroPrimo = false;
		} else {
			numeroPrimo = true;
			for (int i = 3; i < valor; i += 2) {
				if (valor % i == 0) {
					numeroPrimo = false;
					break;
				}
			}
		}

		if (numeroPrimo) {
			System.out.println("� PRIMO");
		} else {
			System.out.println("N�O � PRIMO");
		}
	}
}
