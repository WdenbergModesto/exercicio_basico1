/*
 * Fa�a um program que entre com 2 n�meros e imprima o menor valor
 * (sendo n�meros diferentes)
 */

package Exercicios;

import java.util.Scanner;

public class java_14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Informe o primeiro n�mero: ");
		num1 = scan.nextInt();
		System.out.println("Informe o segundo n�mero: ");
		num2 = scan.nextInt();
		
		if(num1 < num2) {
			System.out.println("O n�mero "+ num1+ " � menor que o n�mero " +num2);
		}else {
			System.out.println("O n�mero "+ num2+ " � menor que o n�mero " +num1);
		}
		
		

	}

}
