/*
 * Escreva um programa que leia o nome de um vendedor, o seu sal�rio fixo e o
 * total de vendas efetuadas por ele no m�s(em dinheiro). Sabendo que este 
 * vendedor ganha 15% de comiss�o sobre suas vendas efetuadas, informar o seu nome,
 * o sal�rio fixo e sal�rio no final do m�s.
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
		System.out.println("digite seu sal�rio: ");
		salario = teclado.nextDouble();
		System.out.println("Informe o valor da venda R$");
		vendas = teclado.nextInt();
		
		adic = vendas * 15 / 100;
		novoSalario = salario + adic;
		
		
		System.out.println(" Vendedor "+ nome+ "\n Sal�rio fixo R$"+salario+ "\n Comiss�o R$"+adic+ "\n Sal�rio fixo com comiss�o R$" + novoSalario);
		

	}

}
