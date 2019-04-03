package agenda;

public class LembreteSemana extends Lembrete {

	public String diasSemana; //o dia da semana deveria ser um int?
	
	public LembreteSemana(String descricao, String diasSemana) {
		super(descricao);
		this.diasSemana = diasSemana;
	}

}
