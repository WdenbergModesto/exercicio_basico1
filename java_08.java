/*
 * Elaborar um programa que mostre quantos reais (R$), para adiquirir determinado quantia em d�lar. 
 * O algoritmo dever� solicitar o valor da cota��o do d�lar e tamb�m
 * a quantidade de d�lares para a compra: 
 */

package Exercicios;

import java.util.Scanner;

public class java_08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float real;
		float dolar;
		float cotacao;
		
		System.out.println("Digite a quantidade em d�lar: US$ ");
		dolar = scan.nextFloat();
		
		System.out.println("Digite a cota��o d�lar: US$ ");
		cotacao = scan.nextFloat();
		
		real = dolar * cotacao;
		
		System.out.println("Para compra US$ "+dolar+ ", voc� dever� ter em reais R$ " +real);

	}

}
