package FormasGeometricas;

import FormasGeometricas.Ponto;
import java.math.*;

public class Circulo extends FormasGeometricas {
	
	public double raio;
	public double area;
	public double perimetro;

	public Circulo(Ponto pontos[], double raio) {
		super(pontos);
		double area = (Math.pow(raio, 2))*Math.PI;
		double perimetro = 2*raio*Math.PI;		
		
		this.raio = raio;
		
		this.area = area;
		this.perimetro = perimetro;
	}

}
