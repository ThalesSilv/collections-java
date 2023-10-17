package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
	private String nome;
	private long matricula;
	private double nota;
	public Aluno(String nome, long matricula, double nota) {
		this.nome = nome;
		this.matricula = matricula;
		this.nota = nota;
	}
	public String getNome() {
		return nome;
	}
	public long getMatricula() {
		return matricula;
	}
	public double getNota() {
		return nota;
	}
	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return matricula == other.matricula;
	}
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", nota=" + nota + "]";
	}
	public int compareTo(Aluno a) {
		return nome.compareToIgnoreCase(a.getNome());
	}

	
	
}

	class ComparatorPorNota implements Comparator<Aluno>{

		@Override
		public int compare(Aluno o1, Aluno o2) {
			// TODO Auto-generated method stub
			return Double.compare(o1.getNota(), o2.getNota());
		}
		
	}
