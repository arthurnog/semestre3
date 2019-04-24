package veiculos;

public class Moto extends VeiculosComplexos {
	
	public String carretinha; //s ou n
	
	public Moto(String placa, double baseDia, double baseKm, int maxPassageiros, String cambio, String carretinha) {
		super(placa, baseDia, baseKm, maxPassageiros, cambio);
		this.carretinha = carretinha;
	}
	
	@Override
	public double calcularAluguel(int tipo, int n) {
		double aluguel = 0;
		double a = 0;
		if (tipo == 1) {
			aluguel =  this.getBaseKm()*n;
			a = aluguel;
			if (this.getCambio() == "auto") {
				aluguel = aluguel + a*(0.1);
			}
		}
		else if (tipo == 2) {
			if (this.carretinha == "s") {
				aluguel =  this.getBaseDia()*(n+1);
				a = aluguel;
				if (this.getCambio() == "auto") {
					aluguel = aluguel + a*(0.1);
				}
			}
			else if(this.carretinha == "n") {
				aluguel =  this.getBaseDia()*n;
				a = aluguel;
				if (this.getCambio() == "auto") {
					aluguel = aluguel + a*(0.1);
				}
			}
		}
		return aluguel;
	}
	
}
