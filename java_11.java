/* Fa�a um programa que receba o pre�o de custo de um produto e mostre o valor 
 * de venda. Sqabe-se que o pre�o de custo receber� um acr�scimo de acordo com
 * um percentual informado pelo usu�rio.
 */

package Exercicios;

import java.util.Scanner;

public class java_11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double preco, juros, soma;
			
		
		System.out.println("Qual o valor do produto R$ ");
		preco = scan.nextDouble();
		
		System.out.println("Qual a taxa de juros: ");
		juros = scan.nextDouble();
		
		soma = (preco * juros) / 100 + preco;
		
		System.out.println("O valor do Produto R$"+preco);
		System.out.println("O valor do juros "+juros+ "%");
		System.out.println("Valor final do Produto R$"+soma);

	}

}
