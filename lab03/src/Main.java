import cadastro.cinema.Cinema;

public class Main {
	
	/*como nao ha interacao entao a main ira apenas gerar as salas pedidas no enunciado*/
	public static void main(String[] args) {
		
		Cinema cine1 = new Cinema("Cine Araújo", "Avenida John Boyd Dunlop, 3900, Jardim\n" + 
				"Ipaussurama", "(19) 3227-1869", "Capita Marvel", 2019, 5, 8, 2);
		
		Cinema cine2 = new Cinema("Cineflix", "Rodovia Dom Pedro I, KM 131,5," + 
				"Jardim Nilopolis", "(19) 4003-0248", "Shazan", 2019, 5, 6, 1);
					
		
		cine1.reservar(1,1);
		cine1.reservar(1,2);
		cine1.reservar();
		
		cine2.reservar();
		
		cine1.imprimeInfo();
		cine2.imprimeInfo();
		
	}
	

}
