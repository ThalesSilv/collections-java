package list.OrdenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExcOrdenacaoNumeros {

	private List<Integer> numeroList;
	
	public ExcOrdenacaoNumeros(){
		this.numeroList = new ArrayList<>();
		
	}
	
	public void adicionarNumero(int numero) {
		numeroList.add(numero);
		
	}
	
	public List<Integer> ordenarAscendente(){
		Collections.sort(numeroList);
		return numeroList;
	}
	
	public List<Integer> ordenarDescendente(){
		Collections.sort(numeroList);
		Collections.reverse(numeroList);
		return numeroList;
	}
	
	public static void main(String[] args) {
		ExcOrdenacaoNumeros ordenador = new ExcOrdenacaoNumeros();
		
		ordenador.adicionarNumero(4);
		ordenador.adicionarNumero(423);
		ordenador.adicionarNumero(123);
		ordenador.adicionarNumero(1);
		ordenador.adicionarNumero(2);
		
		System.out.println(ordenador.ordenarAscendente());
		System.out.println(ordenador.ordenarDescendente());
		
	}
	
}
