package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
	
	private List<Pessoa> pessoaList;

	public OrdenacaoPessoa() {
		this.pessoaList = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoaList.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa> ppi = new ArrayList<>(pessoaList);
		Collections.sort(ppi);
		return ppi;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> ppa = new ArrayList<>(pessoaList);
		Collections.sort(ppa, new ComparatorPorAltura());
		return ppa;
		
	}

}
