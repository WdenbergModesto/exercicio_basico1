/*
 * Escreva um programa para determinar o consumo médio de um automóvel sendo fornecido a distância total
 * percorrida pelo automóvel e o total de combustível gasto.
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
		System.out.println("Informe a quantidade de combustível gasto: ");
		litro = ler.nextDouble();
		
		distTotal = km2 - km1;
		System.out.println("A distância percorrida foi de " +distTotal+ "Km");
		
		consMedio = distTotal / litro;
		System.out.println("O consumo médio do veiculo é de "+consMedio+"Km por litro");


	}

}
