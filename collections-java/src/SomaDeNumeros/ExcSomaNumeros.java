package SomaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class ExcSomaNumeros {

	private List<Integer> numerosList;
	
	public ExcSomaNumeros() {
		this.numerosList = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		numerosList.add(numero);
	}
	
	public int calcularSoma() {
		int soma = 0;
		
		if(!numerosList.isEmpty()) {
			for(Integer numero : numerosList) {
				soma += numero;
			}
			
		}
		
		return soma;
	}
	
	
	public int encontrarMaiorNumero() {
		
		int maiorNumero = Integer.MIN_VALUE;
	
		if(!numerosList.isEmpty()) {
			for(Integer numero : numerosList) {
				if(numero>=maiorNumero) {
					maiorNumero=numero;
				}
			}
			
		}
		return maiorNumero;
	}
	
	public int encontrarMenorNumero() {
		
		int menorNumero = Integer.MAX_VALUE;
	
		if(!numerosList.isEmpty()) {
			for(Integer numero : numerosList) {
				if(numero<=menorNumero) {
					menorNumero=numero;
				}
			}
			
		}
		return menorNumero;
	}
	
	public void exibirNumeros() {
		
		System.out.print(numerosList);
	}
	
	public static void main(String[] args) {
		ExcSomaNumeros excSomaNumeros = new ExcSomaNumeros();
		
		excSomaNumeros.adicionarNumero(1);
		excSomaNumeros.adicionarNumero(453);
		excSomaNumeros.adicionarNumero(1245);
		excSomaNumeros.adicionarNumero(321);
		excSomaNumeros.adicionarNumero(12);
		excSomaNumeros.adicionarNumero(149);
		
		System.out.println("os numeros inseridos foram: ");
		excSomaNumeros.exibirNumeros();
		System.out.println("a soma deu: "+excSomaNumeros.calcularSoma());
		System.out.println("o maior numero é: "+excSomaNumeros.encontrarMaiorNumero());
		System.out.println("o menor numero é: "+excSomaNumeros.encontrarMenorNumero());
	}
}
