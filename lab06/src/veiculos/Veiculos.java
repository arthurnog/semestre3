package veiculos;

public abstract class Veiculos {
	
	private String placa;
	
	private double baseDia;
	private double baseKm;
	
	protected Veiculos(String placa, double baseDia, double baseKm) {
		this.placa = placa;
		this.baseDia = baseDia;
		this.baseKm = baseKm;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	public double getBaseDia() {
		return this.baseDia;
	}
	
	public double getBaseKm() {
		return this.baseKm;
	}
	
	public double calcularAluguel(int tipo, int n) {
		double aluguel = 0;
		if (tipo == 1) {
			//por km
			aluguel = this.baseKm*n;
		}
		else if (tipo == 2) {
			//por dia
			aluguel = this.baseDia*n;
		}
		return aluguel;
		//o tipo nao interfere na conta mas facilita ao fazer o overriding
	}

}
