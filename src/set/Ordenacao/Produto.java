package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Produto implements Comparable<Produto> {
	
	private long codigo;	
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto(String nome, long codigo, double preco, int quantidade) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", codigo=" + codigo + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return codigo == other.codigo;
	}

	@Override
	public int compareTo(Produto p) {
		return nome.compareToIgnoreCase(p.getNome());
	}	
	
	public Set<Produto> exPorPrEco(){
		Set<Produto> ppp = new TreeSet<>(new ComparatorPorPreco());
		return ppp;
	}	
	

}

class ComparatorPorPreco implements Comparator<Produto>{

	@Override
	public int compare(Produto p1, Produto p2) {
		// TODO Auto-generated method stub
		return Double.compare(p1.getPreco(), p2.getPreco());
	}
	
	
	
}
