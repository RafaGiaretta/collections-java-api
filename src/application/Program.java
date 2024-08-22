package application;

import list.tOperacoesBasicas.CarrinhoDeCompras;

public class Program {

	public static void main(String[] args) {
		/* ListaTarefa listaTarefa = new ListaTarefa();
		listaTarefa.addTarefa("Tarefa 1");
		System.out.println("Numero total de tarefas: " + listaTarefa.qtTarefas());
		
		listaTarefa.obterDescricoesTarefas();

		listaTarefa.removerTarefa("Tarefa 1");
		System.out.println("Numero total de tarefas: " + listaTarefa.qtTarefas()); */
		
		
		
		CarrinhoDeCompras cc = new CarrinhoDeCompras();
		cc.adicionarItem("Pera", 3.99, 7);
		cc.adicionarItem("Uva", 15.50, 2);
		cc.adicionarItem("Bala FINI", 11.40, 1);
		
		cc.exibirItens();
		
		System.out.println("Valor total: R$" + cc.calcularValorTotal());
		
		cc.removerItem("Uva");
		
		cc.exibirItens();
		
		System.out.println("Valor total: R$" + cc.calcularValorTotal());
		
	}

}
