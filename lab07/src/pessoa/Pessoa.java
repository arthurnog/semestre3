package pessoa;

import java.io.*;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private String cpf;
	
	public Pessoa(String nome, String sobrenome, String cpf) {
		this.cpf = cpf;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getSobreNome() {
		return this.sobrenome;
	}
	
	public String getCPF() {
		return this.cpf;
	}
	
	public void save(String file) throws IOException {
		File arq = new File(file);
		FileWriter writer = new FileWriter(arq);
		BufferedWriter buff = new BufferedWriter(writer);
		buff.write("Nome=" + this.nome + ", " + "sobrenome=" + this.sobrenome + ", " +"CPF="+ this.cpf +"\n");
		buff.close();
		writer.close();
	}

}
