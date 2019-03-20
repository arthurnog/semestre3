package Interacao;

import java.util.Scanner;
import FormasGeometricas.Circulo;
import FormasGeometricas.Retangulo;
import FormasGeometricas.Triangulo;
import FormasGeometricas.Pontos;


public class Usuario {

	public static void main(String[] args) {
		System.out.print("Escola a forma a ser analizada\n"
				+ "1 - triangulo\n"
				+ "2 - retangulo\n"
				+ "3 - circulo\n"
				+ "Outro numero - encerrar o programa\n");
		Scanner input = new Scanner (System.in);
		int comando;
		comando = input.nextInt();
		
		while(comando<4 && comando>0) {
			if(comando == 1) {
				System.out.print("digite os pontos do triangulo 1");
			}
		}
	}

}
