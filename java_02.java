/*
 * Escreva um programa que receba dois n�meros inteiros e no final mostre a soma,
 * subtra��o, multiplica��o e divis�o dos n�meros lidos.
 */

package Exercicios;

import java.util.Scanner;

public class java_02 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		int num1, num2,soma, sub, mult, div;
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = scan.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		num2 = scan.nextInt();
		
		soma = num1 + num2;
		System.out.println("A soma de "+num1+ " e "+ num2+ " � = " +soma);
		System.out.println("");
		sub = num1 - num2;
		System.out.println("A subtra��o de "+num1+ " e "+ num2+ " � = " +sub);
		System.out.println("");
		mult = num1 * num2;
		System.out.println("A multipica��o de "+num1+ " e "+ num2+ " � = " +mult);
		System.out.println("");
		div = num1 / num2;
		System.out.println("A divi��o de "+num1+ " e "+ num2+ " � = " +div);
		

	}

}
