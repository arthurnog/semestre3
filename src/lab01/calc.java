package lab01;

import java.util.Scanner;

public class calc {
	public static void main (String args[])
	{
		System.out.print("1.Digite 1 para somar\n");
		System.out.print("2.Digite 2 para subtrair\n");
		System.out.print("3.Digite 3 para multiplicar\n");
		System.out.print("4.Digite 4 para dividir\n");
		System.out.print("5.Digite 5 para calcular fatorial\n");
		System.out.print("6.Digite 6 para verificar se um numero e primo\n");
		System.out.print("7.Digite outro valor para sair do programa");
		Scanner input = new Scanner (System.in);
		
		int cmd;//numero que representa a funcao que sera feita
		int n1;//n1 e n2 sao os numeros que irao ser usados na funcao escolhida
		int n2;
		int i;//int usado no for
		float resp;
		cmd = input.nextInt();
		
		while(cmd<7 && cmd>0) {
			if(cmd == 1) {
				System.out.println("Digite dois numeros");
				n1 = input.nextInt();
				n2 = input.nextInt();
				resp = n1 + n2;
				System.out.printf("Resposta: %f\n", resp);
				System.out.println("Fazer outra operacao?");
				cmd = input.nextInt();
				
			}
			else if(cmd == 2) {
				System.out.println("Digite dois numeros");
				n1 = input.nextInt();
				n2 = input.nextInt();
				resp = n1 - n2;
				System.out.printf("Resposta: %f\n", resp);
				System.out.println("Fazer outra operacao?");
				cmd = input.nextInt();
			}
			else if(cmd == 3) {
				System.out.println("Digite dois numeros");
				n1 = input.nextInt();
				n2 = input.nextInt();
				resp = n1 * n2;
				System.out.printf("Resposta: %f\n", resp);
				System.out.println("Fazer outra operacao?");
				cmd = input.nextInt();
			}
			else if(cmd == 4) {
				System.out.println("Digite dois numeros");
				n1 = input.nextInt();
				n2 = input.nextInt();
				resp = n1 / n2;
				System.out.printf("Resposta: %f\n", resp);
				System.out.println("Fazer outra operacao?");
				cmd = input.nextInt();
			}
			else if(cmd == 5) {
				System.out.println("Digite um numero");
				n1 = input.nextInt();
				//fatorial
				resp = 1;
				for(i = n1; i>1; i--) {
					resp = resp*i; 
				}
				System.out.printf("Resposta: %f\n", resp);
				System.out.println("Fazer outra operacao?");
				cmd = input.nextInt();
			}
			else if(cmd == 6) {
				System.out.println("Digite um numero");
				n1 = input.nextInt();
				//verificar se o numero e primo
				int flag = 0;
				for(i = 2; i<n1 && flag == 0; i++) {
					if (i%1 == 0) {
						System.out.println("primo");
						flag = 1;
					}
				}
				if(flag == 0)
					System.out.println("não é primo");				
				System.out.println("Fazer outra operacao?");
				cmd = input.nextInt();
			}
			else {
				break;
			}
		}
	}
}
