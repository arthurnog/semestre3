package main;

import java.util.Scanner;

public class Leitor {
	
	private Scanner scanner;
	
	public Leitor() {
		this.setScanner(new Scanner(System.in));
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public String entregarDados() {
		return scanner.nextLine();
	}
}
