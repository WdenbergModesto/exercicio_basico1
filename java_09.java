/*
 * Fa�a um program que receba um valor que foi depositado e exiba o valor
 * com rendimento ap�s um m�s. 
 * Considere fixo o juro da poupan�a em 0,70% a.m.
 */

package Exercicios;

import java.util.Scanner;

public class java_09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double dep, juros, rend;
		
		System.out.println("Digite o valor do depoisto R$ ");
		dep = scan.nextDouble();
		
		juros = (dep * 0.70) / 100;
		
		rend = juros + dep;
		
		System.out.println("Valor depositado R$" +dep+ "\nJuros R$" + juros + "\nRendimento ap�s um m�s R$" +rend);
	}

}
