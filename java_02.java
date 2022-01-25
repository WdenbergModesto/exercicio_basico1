/*
 * Escreva um programa que receba dois números inteiros e no final mostre a soma,
 * subtração, multiplicação e divisão dos números lidos.
 */

package Exercicios;

import java.util.Scanner;

public class java_02 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		int num1, num2,soma, sub, mult, div;
		
		System.out.println("Digite o primeiro número: ");
		num1 = scan.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = scan.nextInt();
		
		soma = num1 + num2;
		System.out.println("A soma de "+num1+ " e "+ num2+ " é = " +soma);
		System.out.println("");
		sub = num1 - num2;
		System.out.println("A subtração de "+num1+ " e "+ num2+ " é = " +sub);
		System.out.println("");
		mult = num1 * num2;
		System.out.println("A multipicação de "+num1+ " e "+ num2+ " é = " +mult);
		System.out.println("");
		div = num1 / num2;
		System.out.println("A divição de "+num1+ " e "+ num2+ " é = " +div);
		

	}

}
