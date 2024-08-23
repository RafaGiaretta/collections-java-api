package application;

import set.Pesquisa.AgendaContatos;

public class Program {

	public static void main(String[] args) {
		
		/* ListaTarefa listaTarefa = new ListaTarefa();
		listaTarefa.addTarefa("Tarefa 1");
		System.out.println("Numero total de tarefas: " + listaTarefa.qtTarefas());
		
		listaTarefa.obterDescricoesTarefas();

		listaTarefa.removerTarefa("Tarefa 1");
		System.out.println("Numero total de tarefas: " + listaTarefa.qtTarefas());
		
		
		
		CarrinhoDeCompras cc = new CarrinhoDeCompras();
		cc.adicionarItem("Pera", 3.99, 7);
		cc.adicionarItem("Uva", 15.50, 2);
		cc.adicionarItem("Bala FINI", 11.40, 1);
		
		cc.exibirItens();
		
		System.out.println("Valor total: R$" + cc.calcularValorTotal());
		
		cc.removerItem("Uva");
		
		cc.exibirItens();
		
		System.out.println("Valor total: R$" + cc.calcularValorTotal()); 
		
		/* CatalogoLivros cl = new CatalogoLivros();
		cl.adicionarLivro("Livro 1", "Autor 1", 2020);
		cl.adicionarLivro("Livro 1", "Autor 1", 2024);
		cl.adicionarLivro("Livro 2", "Autor 2", 2021);
		cl.adicionarLivro("Livro 3", "Autor 2", 2022);
		cl.adicionarLivro("Livro 4", "Autor 4", 2023);
		
		System.out.println(cl.pesquisarPorAutor("Autor 2"));
		
		System.out.println(cl.pesquisarPorIntervaloAnos(2022, 2024));
		
		System.out.println(cl.pesquisarPorTitulo("Livro 1")); 
		
		OrdenacaoPessoa op = new OrdenacaoPessoa();
		op.adicionarPessoa("Nome 1", 20, 1.56);
		op.adicionarPessoa("Nome 2", 30, 1.80);
		op.adicionarPessoa("Nome 3", 25, 1.70);
		op.adicionarPessoa("Nome 4", 17, 1.56);
		
		
		System.out.println(op.ordenarPorIdade());
		System.out.println(op.ordenarPorAltura()); 
		
		
		ConjuntoConvidados cc = new ConjuntoConvidados();
		
		
		cc.adicionarConvidado("Convidado 1", 1234);
		cc.adicionarConvidado("Convidado 2", 5678);
		cc.adicionarConvidado("Convidado 3", 9012);
		cc.adicionarConvidado("Convidado 4", 1234);
		
		System.out.println("Existem " + cc.contarConvidados() + " convidados dentro do Set de Convidados");
		
		cc.exibirConvidados();
		
		cc.removerConvidadoPorCodigoConvite(1234);
		
		cc.exibirConvidados();*/
		
		
		AgendaContatos ag = new AgendaContatos();
		
		ag.addContato("Contato 1", 1);
		ag.addContato("Contato 1", 1);
		ag.addContato("Contato 3", 3);
		ag.addContato("Contato 4", 4);
		
		ag.eContatos();
		
		ag.atualizaNumeroContato("Contato 1", 2);
		
		ag.eContatos();
		
	}

}
