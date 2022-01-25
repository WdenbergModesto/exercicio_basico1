/*
 * Escreva um programa que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. No final 
 * informar o nome do aluno e a sua média.
 */

package Exercicios;

import java.util.Scanner;

public class java_05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nome;
		double nota1,nota2, nota3;
		double media;
		
		System.out.println("Digite o nome do aluno: ");
		nome = scan.next();
		System.out.println("Digite a primeira nota: ");
		nota1 = scan.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = scan.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = scan.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		
		System.out.println("O Aluno: "+nome+" teve a média " + media); 
		
	}

}
