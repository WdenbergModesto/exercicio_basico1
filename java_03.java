/*
 * Escreva um programa para determinar o consumo m�dio de um autom�vel sendo fornecido a dist�ncia total
 * percorrida pelo autom�vel e o total de combust�vel gasto.
 */

package Exercicios;


import java.util.Scanner;

public class java_03 {


	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double km1;
		double km2;
		double distTotal;
		double litro;
		double consMedio;
		
		System.out.println("Informe o Km inicial: ");
		km1 = ler.nextDouble();
		System.out.println("Informe o Km final: ");
		km2 = ler.nextDouble();
		System.out.println("Informe a quantidade de combust�vel gasto: ");
		litro = ler.nextDouble();
		
		distTotal = km2 - km1;
		System.out.println("A dist�ncia percorrida foi de " +distTotal+ "Km");
		
		consMedio = distTotal / litro;
		System.out.println("O consumo m�dio do veiculo � de "+consMedio+"Km por litro");


	}

}
