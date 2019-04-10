package FormasGeometricas;

import java.math.*;

public class Ponto {

	public int x;
	public int y;
	
	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Ponto ponto) {
		if(ponto instanceof Ponto ) {
			Ponto p = (Ponto) ponto;
			return this.x == p.x && this.y == p.y;
		} else {
			return false;
		}
	}
	
	public void transladar(int x, int y) {
		this.x = this.x + x;
		this.y = this.y + y;
	}
	
	public double calcularDistancia(Ponto p) {
		
		double D = Math.sqrt(Math.pow(this.x-p.x, 2)+Math.pow(this.y-p.y, 2)); 
		
		return D;
	}

}
