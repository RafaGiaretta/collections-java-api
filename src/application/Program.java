package application;

import list.Pesquisa.CatalogoLivros;

public class Program {

	public static void main(String[] args) {
		/* ListaTarefa listaTarefa = new ListaTarefa();
		listaTarefa.addTarefa("Tarefa 1");
		System.out.println("Numero total de tarefas: " + listaTarefa.qtTarefas());
		
		listaTarefa.obterDescricoesTarefas();

		listaTarefa.removerTarefa("Tarefa 1");
		System.out.println("Numero total de tarefas: " + listaTarefa.qtTarefas()); */
		
		
		
		/* CarrinhoDeCompras cc = new CarrinhoDeCompras();
		cc.adicionarItem("Pera", 3.99, 7);
		cc.adicionarItem("Uva", 15.50, 2);
		cc.adicionarItem("Bala FINI", 11.40, 1);
		
		cc.exibirItens();
		
		System.out.println("Valor total: R$" + cc.calcularValorTotal());
		
		cc.removerItem("Uva");
		
		cc.exibirItens();
		
		System.out.println("Valor total: R$" + cc.calcularValorTotal()); */
		
		CatalogoLivros cl = new CatalogoLivros();
		cl.adicionarLivro("Livro 1", "Autor 1", 2020);
		cl.adicionarLivro("Livro 1", "Autor 1", 2024);
		cl.adicionarLivro("Livro 2", "Autor 2", 2021);
		cl.adicionarLivro("Livro 3", "Autor 2", 2022);
		cl.adicionarLivro("Livro 4", "Autor 4", 2023);
		
		System.out.println(cl.pesquisarPorAutor("Autor 2"));
		
		System.out.println(cl.pesquisarPorIntervaloAnos(2022, 2024));
		
		System.out.println(cl.pesquisarPorTitulo("Livro 1"));
		
	}

}
