/*
 * Escreva um programa que entre com um número e o imprima caso seja maior que 20.
 */

package Exercicios;

import java.util.Scanner;

public class java_13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num;

		System.out.println("Digite um número: ");
		num = scan.nextInt();

		if(num >= 20) {
			System.out.println(+num+" é maior que 20!!!");
		}else {
			System.out.println(+num+" é menor que 20!!!");
		}
	}

}
