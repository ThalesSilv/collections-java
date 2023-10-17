package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	private Set<String> palavras;
	
	public ConjuntoPalavrasUnicas() {
		this.palavras = new HashSet<>();
		
	}
	
	public void adicionarPalavra(String palavra){
		palavras.add(palavra);
		
	}
	public void removerPalavra(String palavra) {
		String palavraParaRemover = null;
		for (String s : palavras) {
			if(s == palavra) {
				palavraParaRemover = s;
				break;
			}
		}
		palavras.remove(palavraParaRemover);	
	}
	
	public void verificarPalavra(String palavra) {
		String palavraParaVerificar = null;
		for (String s : palavras) {
			if(s == palavra) {
				palavraParaVerificar = s;
				break;
			}
		}
		System.out.println("a palavra " + palavraParaVerificar + " esta no conjunto");
	}
		
	public void exibirPalavrasUnicas() {
		System.out.println(palavras);
	}
	
	public static void main(String[] args) {
		ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
		
		conjuntoPalavrasUnicas.adicionarPalavra("palavra 1");
		conjuntoPalavrasUnicas.adicionarPalavra("palavra 2");
		conjuntoPalavrasUnicas.adicionarPalavra("palavra 3");
		conjuntoPalavrasUnicas.adicionarPalavra("palavra 3");
		
		conjuntoPalavrasUnicas.removerPalavra("palavra 2");
		conjuntoPalavrasUnicas.verificarPalavra("palavra 1");
		
		conjuntoPalavrasUnicas.exibirPalavrasUnicas();
		
	 
	
	
}
	
	
}
