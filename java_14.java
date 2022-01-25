/*
 * Faça um program que entre com 2 números e imprima o menor valor
 * (sendo números diferentes)
 */

package Exercicios;

import java.util.Scanner;

public class java_14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Informe o primeiro número: ");
		num1 = scan.nextInt();
		System.out.println("Informe o segundo número: ");
		num2 = scan.nextInt();
		
		if(num1 < num2) {
			System.out.println("O número "+ num1+ " é menor que o número " +num2);
		}else {
			System.out.println("O número "+ num2+ " é menor que o número " +num1);
		}
		
		

	}

}
