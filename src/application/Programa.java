package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.conjuntoDeEntidades.ListagemProdutos;

public class Programa {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner= new Scanner(System.in);
		
		ListagemProdutos produtos= new ListagemProdutos();
		
		System.out.print("Serão digitados dados de quantos Produtos? ");
		int quantidade=scanner.nextInt();
		
		for(int i=1;i<=quantidade;i++) {
			System.out.printf("Produto %d: %n", i);
			System.out.print("Nome: ");
			scanner.nextLine();
			String nome=scanner.nextLine();
			System.out.print("Preço de compra: ");
			double precoDeCompra=scanner.nextDouble();
			System.out.print("Preço de venda: ");
			double precoDeVenda=scanner.nextDouble();
			produtos.adicionarProduto(new Produto(nome,precoDeCompra,precoDeVenda));
			
			
		}
		
		System.out.println("RELATÓRIO: ");
		System.out.println(produtos);
		
		scanner.close();
	}

}
