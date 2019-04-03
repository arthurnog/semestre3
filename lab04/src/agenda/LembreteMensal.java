package agenda;

public class LembreteMensal extends Lembrete {

	public int mes;
	
	public LembreteMensal(String descricao, int mes) {
		super(descricao);
		this.mes = mes;
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.printf("Mes %d", this.mes);
	}

}
