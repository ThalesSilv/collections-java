package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	
	private Set<Contato> contatoSet;
	
	public AgendaContatos() {
		this.contatoSet = new HashSet<>();
		
	}
	
	public void adicionarContato(String nome, int numero) {
		contatoSet.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		System.out.println(contatoSet);
	}
	
	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> contatosPorNome = new HashSet<>();
		
		for(Contato c : contatoSet) {
			if(c.getNome().startsWith(nome)) {
				contatosPorNome.add(c);
			}
		}
		return contatosPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		for (Contato c : contatoSet) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		return contatoAtualizado;
	}
	
	public static void main(String[] args) {
		
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.exibirContatos();
		
		agendaContatos.adicionarContato("Thales", 12354);
		agendaContatos.adicionarContato("Thales Silva", 123424);
		agendaContatos.adicionarContato("Thales Silva", 524627);
		agendaContatos.adicionarContato("roberto", 123414);
		agendaContatos.adicionarContato("camila", 123314154);
		agendaContatos.adicionarContato("pedro", 12354);
		
		agendaContatos.exibirContatos();
		
		System.out.println(agendaContatos.pesquisarPorNome("Thales"));
		
		System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("pedro", 67345));
		
		
	}
	
}
