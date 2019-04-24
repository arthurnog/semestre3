package veiculos;

public class Patinete extends VeiculosSimples {

	public Patinete(String placa, double baseDia, double baseKm, String eletrico) {
		super(placa, baseDia, baseKm, eletrico);
	}
	
	@Override
	public double calcularAluguel(int tipo, int n) {
		double aluguel = 0;
		double a = 0;
		if (tipo == 1) {
			aluguel =  this.getBaseKm()*n;
			a = aluguel;
			if (this.getEletrico() == "s") {
				aluguel = aluguel + a*(0.1);
			}
		}
		else if (tipo == 2) {
			aluguel =  this.getBaseDia()*(1+2*(n-1));
			a = aluguel;
			if (this.getEletrico() == "s") {
				aluguel = aluguel + a*(0.1);
			}
		}
		return aluguel;
	}

}
