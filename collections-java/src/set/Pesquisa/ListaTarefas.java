package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;


public class ListaTarefas {

	private Set<Tarefa> tarefaSet;
	
	public ListaTarefas() {
		this.tarefaSet = new HashSet<>();	
	}
	
	public void adicionarTarefa(String descricao, boolean tarefaConcluida) {
		tarefaSet.add(new Tarefa(descricao,tarefaConcluida));
	}
	
	public void removerTarefa(String descricao) {
		Tarefa tarefaParaRemover = null;
		for(Tarefa t : tarefaSet) {
			if(t.getDescricao()== descricao) {
				tarefaParaRemover = t;
				break;
			}
		}
		
		tarefaSet.remove(tarefaParaRemover);
	}
	
	public void exibirTarefas() {
		System.out.println(tarefaSet);
		
	}
	
	public void contarTarefas() {
		System.out.println("a lista contem " + tarefaSet.size() + " tarefas");
		
	}
	public Set<Tarefa> obterTarefasConcluidas(){
		Set<Tarefa> tarefasConcluidas = new HashSet<>();
		
		for(Tarefa t : tarefaSet) {
			if(t.isTarefaConcluida() == true) {
				tarefasConcluidas.add(t);
			}
		}
		return tarefasConcluidas;
	}
	
	public Set<Tarefa> obterTarefasPendentes(){
		Set<Tarefa> tarefasPendentes = new HashSet<>();
		
		for(Tarefa t : tarefaSet) {
			if(t.isTarefaConcluida() == false) {
				tarefasPendentes.add(t);
			}
		}
		return tarefasPendentes;
	}
	
	public Tarefa marcarTarefaConcluida(String descricao) {
		Tarefa tarefaAtualizada = null;
		for (Tarefa t : tarefaSet) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setTarefaConcluida(true);
				tarefaAtualizada = t;
				break;
			}
		}
		return tarefaAtualizada;
	}
	
	public Tarefa marcarTarefaPendente(String descricao) {
		Tarefa tarefaAtualizada = null;
		for (Tarefa t : tarefaSet) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setTarefaConcluida(false);
				tarefaAtualizada = t;
				break;
			}
		}
		return tarefaAtualizada;
	}
	
	public Set<Tarefa> limparListaTarefas(){
		this.tarefaSet = new HashSet<>();
		return tarefaSet;
	}
	
	public static void main(String[] args) {
		ListaTarefas listaTarefas = new ListaTarefas();
		
		listaTarefas.adicionarTarefa("lavar a louça", false);
		listaTarefas.adicionarTarefa("fazer a janta", false);
		listaTarefas.adicionarTarefa("estender as roupas", false);
		listaTarefas.adicionarTarefa("varrer o chão", false);
		listaTarefas.adicionarTarefa("varrer o chão", true);
		
		listaTarefas.exibirTarefas();
		listaTarefas.contarTarefas();
		System.out.println("as tarefas concluidas sao: " + listaTarefas.obterTarefasConcluidas());
		System.out.println("as tarefas pendentes sao: " + listaTarefas.obterTarefasPendentes());
		
		listaTarefas.removerTarefa("lavar a louça");
		listaTarefas.marcarTarefaConcluida("fazer a janta");
		
		listaTarefas.exibirTarefas();
		listaTarefas.contarTarefas();
		System.out.println("as tarefas concluidas sao: " + listaTarefas.obterTarefasConcluidas());
		System.out.println("as tarefas pendentes sao: " + listaTarefas.obterTarefasPendentes());
		
		
		
		
		
	}
	
}
