package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	private Map<Long, Produto> estoqueProdutosMap;
	
	public EstoqueProdutos() {
		this.estoqueProdutosMap = new HashMap<>();
	}
	
	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
	}
	
	public void exibirProdutos() {
		System.out.println(estoqueProdutosMap);
	}
	
	public double calcularValorTotalEstoque() {
		double valorTotalEstoque = 0d;
		if(!estoqueProdutosMap.isEmpty()) {
			for(Produto p : estoqueProdutosMap.values()) {
				valorTotalEstoque += p.getQuantidade()*p.getPreco();
				
			}
		}
		return valorTotalEstoque;
	}
	
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		if(!estoqueProdutosMap.isEmpty()) {
			for(Produto p : estoqueProdutosMap.values()) {
				if(p.getPreco()>maiorPreco) {
					produtoMaisCaro=p;
					maiorPreco = p.getPreco();
				}
				
			}
		}
		return produtoMaisCaro;
	}
	public Produto obterProdutoMaisBarato() {
		Produto produtoMaisBarato = null;
		double menorPreco = Double.MAX_VALUE;
		if(!estoqueProdutosMap.isEmpty()) {
			for(Produto p : estoqueProdutosMap.values()) {
				if(p.getPreco()<menorPreco) {
					produtoMaisBarato=p;
					menorPreco=p.getPreco();
				}
				
			}
		}
		return produtoMaisBarato;
	}
	
	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		Produto produtoValorTotal = null;
		double maiorValorTotal = Double.MIN_VALUE;
		
		if(!estoqueProdutosMap.isEmpty()) {
			for(Produto p : estoqueProdutosMap.values()) {
				if(p.getPreco()*p.getQuantidade()>maiorValorTotal) {
					produtoValorTotal=p;
					maiorValorTotal = p.getPreco()*p.getQuantidade();
				}
				
			}
		}
		return produtoValorTotal;
		
		
	}
	
	public static void main(String[] args) {
		EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
		
		estoqueProdutos.adicionarProduto(1L, "Produto A", 4, 4);
		estoqueProdutos.adicionarProduto(1L, "Produto B", 3, 7);
		estoqueProdutos.adicionarProduto(4L, "Produto C", 6, 10);
		estoqueProdutos.adicionarProduto(6L, "Produto A", 50, 1);
		
		estoqueProdutos.exibirProdutos();
		
		System.out.println("Valor total do estoque: R$ " + estoqueProdutos.calcularValorTotalEstoque());
		System.out.println("Produto mais barato:  " + estoqueProdutos.obterProdutoMaisBarato());
		System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
		System.out.println("Produto com maior Valor considerando a quantidade e preço: " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
		
	}
}
