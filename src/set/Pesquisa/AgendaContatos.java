package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

	private Set<Contato> contatoSet;

	public AgendaContatos() {
		this.contatoSet = new HashSet<>();
	}
	
	public void addContato(String nome, int numero) {
		contatoSet.add(new Contato(nome, numero));
	}
	
	public void eContatos() {
		System.out.println(contatoSet);
	}
	
	public Set<Contato> pesquisarPorNome(String nome){
		Set<Contato> cpn = new HashSet<>();
		for (Contato c : contatoSet) {
			if (c.getNome().equalsIgnoreCase(nome)) {
				cpn.add(c);
			}
		}
		return cpn;		
	}
	
	public Contato atualizaNumeroContato(String nome, int numero) {
		Contato ca = null;
		for (Contato c : contatoSet) {
			if (c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(numero);
				break;
			}
		}
		return ca;
	}
}

