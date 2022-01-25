/*
 * A loja Mamão co Açucar está vendendo seus produtos em 5(cinco)
 * pretações sem juros. Faça um programa que receba um valor de uma compra
 * e mostre o valor da prestações.
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
		
		System.out.println("O valor das prestações do produto é R$"+compra);
		

	}

}
