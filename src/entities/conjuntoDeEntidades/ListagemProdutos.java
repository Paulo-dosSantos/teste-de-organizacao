package entities.conjuntoDeEntidades;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Produto;

public class ListagemProdutos {
	
	private List<Produto>produtos;
	
	public ListagemProdutos() {
		this.produtos= new ArrayList<>();
	}
	
	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}
	
	
	
	
	
	
	public int lucroAbaixoDeDezPorcento() {
		
		int quantidade= produtos.stream().filter(x->x.lucro()<10).collect(Collectors.toList()).size();
		
		return quantidade;
		
		
	}
public int lucroEntreDezEVintePorcento() {
		
		int quantidade= produtos.stream().filter(x->x.lucro()>=10 && x.lucro()<=20).collect(Collectors.toList()).size();
		
		return quantidade;
		
		
	}
public int lucroAcimaDeVintePorcento() {
	
	int quantidade= produtos.stream().filter(x->x.lucro()>20).collect(Collectors.toList()).size();
	
	return quantidade;
	
	
}
public double totalDeCompra() {
	double total= produtos.stream().map(x->x.getPrecoDeCompra()).reduce(0.0,(x,y)->x+y );
	return total;

}
public double totalDeVenda() {
	double total= produtos.stream().map(x->x.getPrecoDeVenda()).reduce(0.0,(x,y)->x+y );
	return total;

}
public double lucroTotal() {
	return totalDeVenda()-totalDeCompra();
}

@Override
public String toString() {
	StringBuilder sb= new StringBuilder();
	
	sb.append("Lucro abaixo de 10%: "+lucroAbaixoDeDezPorcento());
	sb.append("\nLucro entre 10% e 20%: "+lucroEntreDezEVintePorcento());
	sb.append("\nLucro acima de 20%: "+lucroAcimaDeVintePorcento());
	sb.append("\nTotal de compra: "+String.format("%.2f", totalDeCompra()));
	sb.append("\nTotal de venda: "+String.format("%.2f", totalDeVenda()));
	sb.append("\nLucro total: "+String.format("%.2f", lucroTotal()));
	
	return sb.toString();
	
	
}
	
}
