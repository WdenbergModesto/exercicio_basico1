/*
 * Escreva um programa que receba dois números inteiros e no final mostre a soma.
 */
package Exercicios;

import java.util.Scanner;

public class java_01 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int num1, num2, soma;
		
		
		System.out.println("Digite o primeiro número: ");
		num1 = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = scan.nextInt();
		
		soma = num1 + num2;
		System.out.println("A soma de "+num1+ " e "+ num2+ " é = " +soma);
		
		
	}

}
