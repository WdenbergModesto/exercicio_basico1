/*
 *  Escreva um programa que leia dois valores para a vari�vel A e B,
 *  e efetue a troca dos valores de forma que a vari�vel A passe a ter
 *  o valor da vari�vel B e a vari�vel B passe a ter o valor da vari�vel A.
 *  Mostrar o valor das vari�veis trocadas.
 */

package Exercicios;

import java.util.Scanner;

public class java_06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A, B, C;
		
		System.out.println("Digite o valor de A: ");
		A = scan.nextInt();
		System.out.println("Digite o valore de B: ");
		B = scan.nextInt();
		
		C = A;
		A = B;
		B = C;
		
		System.out.println("O Valor trocado de A � "+A);
		System.out.println("O Valor trocado de B � "+B);

	}

}
