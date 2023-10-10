package list.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
	double valorTotal;
	
	private List<Item> itemList;
	
	public CarrinhoCompras() {
		this.itemList = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		itemList.add(new Item(nome,preco,quantidade));
		
	}
	
	public void removerItem(String nome) {
		List<Item> itensRemover = new ArrayList<>();
		for(Item i : itemList) {
			if(i.getNome().equalsIgnoreCase(nome)) {
				itensRemover.add(i);
			}
			
			itemList.removeAll(itensRemover);	
		}
	}
	
	public double calcularValorTotal() {
		for (Item i : itemList) {
			valorTotal = valorTotal + (i.getPreco()*i.getQuantidade());
		}
		return valorTotal;
		
	}
	
	public void exibirItens() {
		System.out.println(itemList);
	}
	
	
	public static void main(String[] args) {
		CarrinhoCompras carrinho = new CarrinhoCompras();
		
		carrinho.adicionarItem("banana", 3, 3);
		carrinho.adicionarItem("suco de uva", 8, 2);
		
		System.out.println("seu carrinho contem: ");
		carrinho.exibirItens();
		
		System.out.println("e o valor total da sua compra é: R$" + carrinho.calcularValorTotal());
		
		
	}
}
