package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	private Map<String, Integer> agendaContatoMap;

	public AgendaContatos() {
		this.agendaContatoMap = new HashMap<>();
	}
	
	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone);
		
	}
	
	public void removerContato(String nome) {
		if(!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}
	}
	
	public void exibirContatos() {
		System.out.println(agendaContatoMap);
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if(!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
			
		}
		return numeroPorNome;
	}
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.adicionarContato("Thales", 12354);
		agendaContatos.adicionarContato("Thales Silva", 123424);
		agendaContatos.adicionarContato("Thales Silva", 524627);
		agendaContatos.adicionarContato("roberto", 123414);
		agendaContatos.adicionarContato("camila", 123314154);
		agendaContatos.adicionarContato("pedro", 12354);
		
		agendaContatos.exibirContatos();
		
		agendaContatos.removerContato("roberto");
		
		agendaContatos.exibirContatos();
		
		System.out.println("O numero é: " + agendaContatos.pesquisarPorNome("camila"));
	}
}
