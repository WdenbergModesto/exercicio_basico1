/*
 * Fa�a um programa que entre com 2 n�meros e imprima em ordem descrescrente.
 * (sendo numeros diferentes).
 */

package Exercicios;

import java.util.Scanner;

public class java_15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int num1, num2;
		
		System.out.println("Informe o primeiro n�mero: ");
		num1 = scan.nextInt();
		System.out.println("Informe o segundo n�mero: ");
		num2 = scan.nextInt();
		
		if(num1 > num2) {
			System.out.println(+num1+ " - "+num2);
		}else {
			System.out.println(+num2+ " - "+num1);
		}

	}

}
