package veiculos;

public class VeiculosComplexos extends Veiculos {
	
	private int maxPassageiros;
	private String cambio; //auto ou man
	
	protected VeiculosComplexos(String placa, double baseDia, double baseKm, int maxPassageiros, String cambio) {
		super(placa, baseDia, baseKm);
		this.cambio = cambio;
		this.maxPassageiros = maxPassageiros;
	}
	
	public int getMax() {
		return this.maxPassageiros;
	}
	
	public String getCambio() {
		return this.cambio;
	}

}
