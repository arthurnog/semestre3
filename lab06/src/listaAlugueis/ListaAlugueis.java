package listaAlugueis;

public class ListaAlugueis {
	
	public double lista[];
	public int n;
	
	public ListaAlugueis(double lista[], int n) {
		this.lista = lista;
		this.n = n;
	}
	
	public double fazerSomatorio() {
		double a = 0;
		int i;
		for(i = 0; i<n; i++) {
			a = a + this.lista[i];
		}
		return a;
	}

}
