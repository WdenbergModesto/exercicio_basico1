/*
 * Faça um program que receba um valor que foi depositado e exiba o valor
 * com rendimento após um mês. 
 * Considere fixo o juro da poupança em 0,70% a.m.
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
		
		System.out.println("Valor depositado R$" +dep+ "\nJuros R$" + juros + "\nRendimento após um mês R$" +rend);
	}

}
