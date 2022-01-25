/*
 * Ler uma temperatura em graus Celsius e apresenta-lá convertida em graus Fahrenheit.
 * A formula de converção é: F=(9*(C+160)/5, sendo F a temperatura em Fahrenheit e C a temperatura 
 * em Celsius.
 */

package Exercicios;

import java.util.Scanner;

public class java_07 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double cels, fahr;
		
		System.out.println("Digite a temperatura C° ");
		cels = ler.nextDouble();
		
		fahr = (cels * 9 + 160 ) /5;
		
		System.out.println("A temperatura Celsius para Fahreheint é: "+ fahr);
		
	}

}
