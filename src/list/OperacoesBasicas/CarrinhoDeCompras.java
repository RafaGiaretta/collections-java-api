package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	private List<Item> itens;

	public CarrinhoDeCompras() {
		this.itens = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		itens.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		for (Item i : itens) {
			if (i.getNome().equalsIgnoreCase(nome)) {
				itens.remove(i);
			}
		}
	}
	
	public double calcularValorTotal() {
		double precoTotal = 0;
		
		for (Item i : itens) {
			precoTotal += i.getQuantidade() * i.getPreco();
 		}
		
		return precoTotal;
	}
	
	public void exibirItens() {
		for (Item i : itens) {
			System.out.println(i);
		}
	}
	
}
