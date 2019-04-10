package Main;

import java.util.Scanner;
import Leitor.Leitor;

public class main {
//infelizmente eu não consegui concluir o programa a tempo
	public static void main(String[] args) {
		Leitor leitor = new Leitor();
		int cmd;		
		do {
			System.out.print("Escolha uma forma geometrica\n1-triangulo 2-retangulo 3-circulo");
			cmd = leitor.getClass().nextInt();
		}
	}
}
