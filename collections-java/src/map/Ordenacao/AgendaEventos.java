package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {
	private Map<LocalDate,Evento> eventosMap;
	
	public AgendaEventos() {
		this.eventosMap = new HashMap<>();
		
	}
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		eventosMap.put(data,new Evento(nome,atracao));
	}
	
	
	public void exibirAgenda() {
		Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		System.out.println(eventosTreeMap);
	}
	
	public void obterProximoEvento() {
		/*Set<LocalDate> dateSet = eventosMap.keySet();
		Collection<Evento> values = eventosMap.values();*/
		LocalDate dataAtual = LocalDate.now();
		Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
			if(entry.getKey().isEqual(dataAtual)||entry.getKey().isAfter(dataAtual)) {
				System.out.println("o proximo evento: "+ entry.getValue() + "acontecera na data " + entry.getKey());
				break;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		AgendaEventos agendaEventos = new AgendaEventos();
		
		agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15),"Evento 1", "Atracao 1");
		agendaEventos.adicionarEvento(LocalDate.of(2022, 4, 19),"Evento 2", "Atracao 2");
		agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 9),"Evento 3", "Atracao 3");
		agendaEventos.adicionarEvento(LocalDate.of(2023, 10, 17),"Evento 4", "Atracao 4");
		agendaEventos.exibirAgenda();
		agendaEventos.obterProximoEvento();
		
	}
}
