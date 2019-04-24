package veiculos;

public class VeiculosSimples extends Veiculos {
	
	private String Eletrico;//s ou n
	
	protected VeiculosSimples(String placa, double baseDia, double baseKm, String eletrico) {
		super(placa, baseDia, baseKm);
		this.Eletrico = eletrico;
	}
	
	public String getEletrico() {
		return this.Eletrico;
	}

}
