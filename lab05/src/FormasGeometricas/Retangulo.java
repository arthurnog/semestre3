package FormasGeometricas;

import FormasGeometricas.Ponto;
import java.math.*;

public class Retangulo extends FormasGeometricas {
	
	public double area;
	public double perimetro;
	
	public Retangulo(Ponto pontos[]) {
		super(pontos);
		//primeiro verificar se esse pontos formam um retangulo. isso é feito no leitor pois quando o programa entrar ele VAI criar um retangulo
		//eu não consegui pensar a tempo em como calcular a area sem tornar as informacoes da classe FigurasGeometricas publicas, decidi usar protect
		this.area = this.pontos[0].calcularDistancia(this.pontos[1])*this.pontos[0].calcularDistancia(this.pontos[3]);
		this.perimetro = 2*(this.pontos[0].calcularDistancia(this.pontos[1])+this.pontos[0].calcularDistancia(this.pontos[3]));		
	}
}
