/**
 * 
 */
/**
 * @author ra213293
 *
 */
package FormasGeometricas;

import java.lang.Math;
import FormasGeometricas.Pontos;

public class Triangulo{
	//pontos
	public int aX; public int aY;
	public int bX; public int bY;
	public int cX; public int cY;
	
	//lados
	public double ladoA; //pontos B e C
	public double ladoB; //pontos A e C
	public double ladoC; //pontos A e B
	
	/*
	 private double calcularLado(int X, int Y) {
		double L = raiz(X, Y);
		return L;	
	}
	
	ladoA = calcularLado(a.x, a.y);
	ladoB = calcularLado(b.x, b.y);
	ladoC = calcularLado(c.x, c.y);
	*/
	
	public void inserirPontos() {
		//mudar isso Getters are evil
		//verificar se e um triangulo
	}
	
	public double calcularPerimetro(double a, double b, double c) {
		double p = a + b + c;
		return p;
	}
	
	public void calcularArea(double a, double b, double c) {
		//double p = calcularPerimetro(a, b, c);
		//double area = raiz[(p/2)*((p/2)-a)*((p/2)-b)*((p/2)-c)];
		//printar valor da area
	}
	
	public void transladar() {
		
	}
	
}
