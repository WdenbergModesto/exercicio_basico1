/*
 * A loja Mam�o co A�ucar est� vendendo seus produtos em 5(cinco)
 * preta��es sem juros. Fa�a um programa que receba um valor de uma compra
 * e mostre o valor da presta��es.
 */

package Exercicios;

import java.util.Scanner;

public class java_10 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double preco, compra;
		int prest = 5;
		
		
		System.out.println("Qual o valor do produto R$ ");
		preco = teclado.nextDouble();
		
		compra = preco / prest;
		
		System.out.println("O valor das presta��es do produto � R$"+compra);
		

	}

}
