package agenda;

public class Lembrete {
	
	public String descricao;
	
	public Lembrete(String descricao) {
		this.descricao = descricao;
	}
	
	public void imprimir() {
		System.out.printf(this.descricao);
	}

}
