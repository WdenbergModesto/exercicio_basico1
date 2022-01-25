/*
 * Escreva um programa que leia o nome de um vendedor, o seu salário fixo e o
 * total de vendas efetuadas por ele no mês(em dinheiro). Sabendo que este 
 * vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome,
 * o salário fixo e salário no final do mês.
 */

package Exercicios;

import java.util.Scanner;

public class java_04 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nome;
		double salario, vendas, adic, novoSalario;
				
		
		System.out.println("Digite seu nome:");
		nome = teclado.next();
		System.out.println("digite seu salário: ");
		salario = teclado.nextDouble();
		System.out.println("Informe o valor da venda R$");
		vendas = teclado.nextInt();
		
		adic = vendas * 15 / 100;
		novoSalario = salario + adic;
		
		
		System.out.println(" Vendedor "+ nome+ "\n Salário fixo R$"+salario+ "\n Comissão R$"+adic+ "\n Salário fixo com comissão R$" + novoSalario);
		

	}

}
