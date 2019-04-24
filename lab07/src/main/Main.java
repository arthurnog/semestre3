package main;

import java.io.IOException;
import java.lang.String;
import pessoa.Pessoa;
import main.Leitor;

public class Main {
	public static void main(String[] args) {
		System.out.printf("Digite nome, sobrenome e CPF\n");
		Leitor leitor = new Leitor();
		String s = leitor.entregarDados();
		String[] dados = s.split(",");
		Pessoa pessoa = new Pessoa(dados[0], dados[1], dados[2]);
		try {
			pessoa.save(dados[0]+".txt");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
