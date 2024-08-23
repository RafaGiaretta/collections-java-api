package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

	private Set<Produto> ps;

	public CadastroProdutos() {
		
		this.ps = new HashSet<>();
		
	}
	
	public void addProduto(long cod, String nome, double preco, int quantidade) {
		ps.add(new Produto(nome, cod, preco, quantidade));		
	}
	
	public Set<Produto> exProdNome(){
		Set<Produto> ppn = new TreeSet<>(ps);
		return ppn;
	}

	public Set<Produto> exPorPreco(){
		Set<Produto> ppp = new TreeSet<>(new ComparatorPorPreco());
		ppp.addAll(ps);
		return ppp;
	}
}
