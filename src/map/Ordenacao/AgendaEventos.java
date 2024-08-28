package map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

	private Map<LocalDate, Evento> eventosMap;

	public AgendaEventos() {
		this.eventosMap = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		Evento evento = new Evento(nome, atracao);
		eventosMap.put(data, evento);
	}
	
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		System.out.println(eventosTreeMap);
	}
	
	public void obterProximoEvento() {
		/* Set<LocalDate> dateSet = eventosMap.keySet();
		Collection<Evento> values = eventosMap.values();*/
		//eventosMap.get();
		
		LocalDate dataAtual = LocalDate.now(); // data atual
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		for(Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
			if(entry.getKey().isEqual(dataAtual)|| entry.getKey().isAfter(dataAtual)) {
				System.out.println("O proximo evento: " + entry.getValue() + " acontecera na data: " + entry.getKey());
				break;
			}
		}

		
	}
}
