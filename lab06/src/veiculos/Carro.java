package veiculos;

public class Carro extends VeiculosComplexos {

	public Carro(String placa, double baseDia, double baseKm, int maxPassageiros, String cambio) {
		super(placa, baseDia, baseKm, maxPassageiros, cambio);
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
			if (this.getCambio() == "auto") {
				aluguel = aluguel + a*(0.1);
			}
			if (this.getMax() > 4) {
				aluguel = aluguel + b*(0.1*(this.getMax()-4));
			}
		}
		else if (tipo == 2) {
			aluguel =  this.getBaseDia()*n;
			a = aluguel;
			b = aluguel;
			if (this.getCambio() == "auto") {
				aluguel = aluguel + a*(0.1);
			}
			if (this.getMax() > 4) {
				aluguel = aluguel + b*(0.1*(this.getMax()-4));
			}
		}
		return aluguel;
	}
}
