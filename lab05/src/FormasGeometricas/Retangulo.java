package FormasGeometricas;

import FormasGeometricas.Ponto;
import java.math.*;

public class Retangulo extends FormasGeometricas {
	
	public double area;
	public double perimetro;
	
	public Retangulo(Ponto pontos[]) {
		super(pontos);
		
		//primeiro verificar se esse pontos formam um retangulo
		
		//eu não consegui pensar a tempo em como calcular a area sem tornar as informacoes da classe FigurasGeometricas publicas
		
		if(this.pontos[0].calcularDistancia(this.pontos[1]) == this.pontos[2].calcularDistancia(this.pontos[3]) && this.pontos[0].calcularDistancia(this.pontos[3]) == this.pontos[1].calcularDistancia(this.pontos[2])) {
			this.area = this.pontos[0].calcularDistancia(this.pontos[1])*this.pontos[0].calcularDistancia(this.pontos[3]);
			this.perimetro = 2*(this.pontos[0].calcularDistancia(this.pontos[1])+this.pontos[0].calcularDistancia(this.pontos[3]));
			
		} else {
			System.out.printf("NAO E RETANGULO");
		}
		
	}
	
	

}
