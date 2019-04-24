package veiculos;

public class Bicicleta extends VeiculosSimples {
	
	private String assentoExtra; //s ou n
	
	public Bicicleta(String placa, double baseDia, double baseKm, String eletrico, String assentoExtra) {
		super(placa, baseDia, baseKm, eletrico);
		this.assentoExtra = assentoExtra;
	}
	
	public String getAssento() {
		return this.assentoExtra;
	}
	
	@Override
	public double calcularAluguel(int tipo, int n) {
		double aluguel = 0;
		double a = 0;
		double b = 0;
		if (tipo == 1) {
			aluguel =  this.getBaseKm()*n;
			a = aluguel;
			b = aluguel;
			if (this.getEletrico() == "s") {
				aluguel = aluguel + a*(0.1);
			}
			if (this.assentoExtra == "s") {
				aluguel = aluguel + b*(0.05);
			}
		}
		else if (tipo == 2) {
			aluguel =  this.getBaseDia()*n;
			a = aluguel;
			b = aluguel;
			if (this.getEletrico() == "s") {
				aluguel = aluguel + a*(0.1);
			}
			if (this.assentoExtra == "s") {
				aluguel = aluguel + b*(0.05);
			}
		}
		return aluguel;
	}

}
