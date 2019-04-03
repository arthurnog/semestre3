package agenda;

import java.time.ZonedDateTime;
import java.util.GregorianCalendar;

public class Evento {
	public String descricao;
	public ZonedDateTime dataDoEvento;
	public GregorianCalendar calendario;
	
	public Evento(String descricao, int ano, int mes, int dia) {
		this.descricao = descricao;
		this.calendario = new GregorianCalendar();
		this.calendario.set(ano, mes, dia);
		this.dataDoEvento = this.calendario.toZonedDateTime();
	}

}
