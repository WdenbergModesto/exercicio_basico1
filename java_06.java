/*
 *  Escreva um programa que leia dois valores para a variável A e B,
 *  e efetue a troca dos valores de forma que a variável A passe a ter
 *  o valor da variável B e a variável B passe a ter o valor da variável A.
 *  Mostrar o valor das variáveis trocadas.
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
		
		System.out.println("O Valor trocado de A é "+A);
		System.out.println("O Valor trocado de B é "+B);

	}

}
