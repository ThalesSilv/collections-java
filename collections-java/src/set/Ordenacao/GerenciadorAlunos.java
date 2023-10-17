package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class GerenciadorAlunos {
	private Set<Aluno> alunoSet;
	
	public GerenciadorAlunos() {
		this.alunoSet = new HashSet<>();
	}
	
	public void adicionarAluno(String nome, long matricula, double nota) {
		alunoSet.add(new Aluno(nome, matricula, nota));
	}
	public void removerAluno(long matricula) {
		Aluno alunoParaRemover = null;
		for(Aluno a : alunoSet) {
			if(a.getMatricula()== matricula) {
				alunoParaRemover = a;
				break;
			}
		}
		
		alunoSet.remove(alunoParaRemover);
	}
	public Set<Aluno> exibirPorNome(){
		Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
		return alunosPorNome;
	}
	public Set<Aluno> exibirPorNota(){
		Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
		alunosPorNota.addAll(alunoSet);
		return alunosPorNota;
	}
	public void exibirAlunos() {
		System.out.println(alunoSet);
	}
	
	public static void main(String[] args) {
		GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
		
		gerenciadorAlunos.adicionarAluno("thales", 1L, 2d);
		gerenciadorAlunos.adicionarAluno("thales silva", 4L, 7d);
		gerenciadorAlunos.adicionarAluno("jose", 6L, 5d);
		gerenciadorAlunos.adicionarAluno("roberto", 4L, 4d);
		gerenciadorAlunos.adicionarAluno("maria", 3L, 9d);
		
		gerenciadorAlunos.exibirAlunos();
		
		System.out.println("lista por nome: " + gerenciadorAlunos.exibirPorNome());
		System.out.println("lista por nota: " + gerenciadorAlunos.exibirPorNota());
		
		gerenciadorAlunos.removerAluno(6L);
		
		gerenciadorAlunos.exibirAlunos();
		
		System.out.println("lista por nome: " + gerenciadorAlunos.exibirPorNome());
		System.out.println("lista por nota: " + gerenciadorAlunos.exibirPorNota());
	}
	
	
}
