package agenda;

public class Reuniao extends Evento {

	public String listaDeNomes;
	
	public Reuniao(String descricao, int ano, int mes, int dia, String lista) {
		super(descricao, ano, mes, dia);
		this.listaDeNomes = lista;
	}

}
