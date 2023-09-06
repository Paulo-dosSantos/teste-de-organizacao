package entities;

public class Produto {
	
	private String nome;
	private Double precoDeCompra;
	private Double precoDeVenda;
	public Produto(String nome, Double precoDeCompra, Double precoDeVenda) {
		super();
		this.nome = nome;
		this.precoDeCompra = precoDeCompra;
		this.precoDeVenda = precoDeVenda;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPrecoDeCompra() {
		return precoDeCompra;
	}
	public void setPrecoDeCompra(Double precoDeCompra) {
		this.precoDeCompra = precoDeCompra;
	}
	public Double getPrecoDeVenda() {
		return precoDeVenda;
	}
	public void setPrecoDeVenda(Double precoDeVenda) {
		this.precoDeVenda = precoDeVenda;
	}
	
	public double lucro(){
		return (precoDeVenda*100/precoDeCompra)-100;
	}

}
