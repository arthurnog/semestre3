package cadastro.cinema;

public class Filme {
	
	public String nome;
	public int ano;
	
	public Filme(String nome, int ano) {
		this.nome = nome;
		this.ano = ano;
	}
	
	public void ImprimeFilme() {
		System.out.printf("(%s [%d])\n", this.nome, this.ano);
	}
	
}
