/*
 * Elaborar um programa que mostre quantos reais (R$), para adiquirir determinado quantia em dólar. 
 * O algoritmo deverá solicitar o valor da cotação do dólar e também
 * a quantidade de dólares para a compra: 
 */

package Exercicios;

import java.util.Scanner;

public class java_08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float real;
		float dolar;
		float cotacao;
		
		System.out.println("Digite a quantidade em dólar: US$ ");
		dolar = scan.nextFloat();
		
		System.out.println("Digite a cotação dólar: US$ ");
		cotacao = scan.nextFloat();
		
		real = dolar * cotacao;
		
		System.out.println("Para compra US$ "+dolar+ ", você deverá ter em reais R$ " +real);

	}

}
