package agenda;

public class LembreteSemana extends Lembrete {

	public String diasSemana; //o dia da semana deveria ser um int? Sim, mais facil analisar
	
	public LembreteSemana(String descricao, String diasSemana) {
		super(descricao);
		this.diasSemana = diasSemana;
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.printf(this.diasSemana);
	}

}
