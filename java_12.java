/*
 * Escreva um programa para ler o raio de um circulo, calcular e escrever a sua área.(pr²)
 * Calculo: area = Pi(raio²) 
 */

package Exercicios;

import java.util.Scanner;

public class java_12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float raio;
		float area;
		float PI = 3.14f;
		
		System.out.println("Digite o raio do circulo: ");
		raio = scan.nextFloat();
		
		area = PI * (raio * raio);
		
		System.out.println("A área de um circulo é: "+area);
		

	}

}
