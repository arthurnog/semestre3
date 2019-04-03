package cadastro.cinema;

import cadastro.cinema.Sala;
import cadastro.cinema.Filme;

public class Cinema {
	
	public String nome;
	public String endereco;
	public String telefone;
	public Filme emCartaz; //classe Filme
	public Sala sala; //classe Sala
	
	public Cinema(String nome, String endereco, String telefone, String nomeFilme, int anoFilme, int linhasSala, int colunasSala, int lVipSalas) {
		
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.emCartaz = new Filme(nomeFilme, anoFilme);
		this.sala = new Sala(linhasSala, colunasSala, lVipSalas);
		
	}
	
	public void reservar(int i, int j) {
		this.sala.reservar(i, j);
	}
	
	public void reservar() {
		this.sala.reservar();
	}
	
	
	public void imprimeInfo() {
		System.out.printf("Unidade %s\n", this.nome);
		System.out.printf("Endereco: %s\n", this.endereco);
		System.out.printf("Telefone: %s\n", this.telefone);
		System.out.printf("Em Cartaz"); this.emCartaz.ImprimeFilme();
		this.sala.imprimirSala();
	}

}
