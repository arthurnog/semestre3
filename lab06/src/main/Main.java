package main;

import listaAlugueis.ListaAlugueis;
import veiculos.*;

public class Main {
	public static void main(String[] args) {
		Patinete p = new Patinete("HXI-3974",3, 0.15, "n");
		Bicicleta b = new Bicicleta("HCI-3974", 5, 0.35, "s", "s");
		Carro c = new Carro("HJK-3888", 200, 20, 6, "auto");
		Moto m = new Moto("HJJ-3762", 150, 15, 1, "man", "s");
		
		double lista[] = new double[4];
		lista[0] = b.calcularAluguel(1, 25);
		lista[1] = p.calcularAluguel(2, 3);
		lista[2] = c.calcularAluguel(1, 300);
		lista[3] = m.calcularAluguel(1, 500);
		
		ListaAlugueis alugueis = new ListaAlugueis(lista, 4);
		System.out.print(alugueis.fazerSomatorio());
		
		
	}

}
