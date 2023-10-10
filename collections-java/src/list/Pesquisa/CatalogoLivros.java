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
			
		if(! livroList.isEmpty()) {
			
			for(Livro l : livroList) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
					
				}	
			}
		}
		return livrosPorAutor;
	}
	
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
		
		if(! livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getAnoPublicacao()>= anoInicial && l.getAnoPublicacao()<=anoFinal) {
					livrosPorIntervaloAnos.add(l);
					
				}
			}
		}
		return livrosPorIntervaloAnos;
	}
	
	
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
		}
		return livroPorTitulo;
	}
	
	public static void main(String[] args) {
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		
		catalogoLivros.adicionarLivro("livro1", "Autor1", 1995);
		catalogoLivros.adicionarLivro("livro1", "Autor1", 1995);
		catalogoLivros.adicionarLivro("livro2", "Autor2", 2003);
		catalogoLivros.adicionarLivro("livro3", "Autor2", 2004);
		catalogoLivros.adicionarLivro("livro4", "Autor3", 2002);
		catalogoLivros.adicionarLivro("livro5", "Autor1", 2006);
		
		System.out.println(catalogoLivros.pesquisarPorAutor("Autor2"));
		
		System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1995, 2002));
		
		System.out.println(catalogoLivros.pesquisarPorTitulo("livro1"));
		
	}
	
}
