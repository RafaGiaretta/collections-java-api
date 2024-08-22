package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

	private List<Livro> livroList;

	public CatalogoLivros() {
		this.livroList = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor){
		
		List<Livro> livrosPorAutor = new ArrayList<>();
		if (!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if (l.getAutor().equalsIgnoreCase(autor))
					livrosPorAutor.add(l);
			}
		}
		return livrosPorAutor;
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
		List<Livro> livrosPorIntervaloAno = new ArrayList<>();
		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervaloAno.add(l);
				}
			}
			
		}
		return livrosPorIntervaloAno;		
	}
	
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroTitulo = null;
		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if (l.getTitulo().equalsIgnoreCase(titulo)) {
					livroTitulo =  l;
					break;
				}
			}			
		}
		return livroTitulo;
	}


}
