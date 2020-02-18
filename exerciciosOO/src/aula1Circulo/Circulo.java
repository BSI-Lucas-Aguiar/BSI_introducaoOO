package aula1Circulo;

public class Circulo {
	double raio;
	double area;
	
	public double PreencheRaio(double raio){
		raio=5;
		return raio;
	}
	
	public double PreencheArea(double raio){
		double area_total;
		area_total=((2*raio)*3.14);
		return area_total;
	}
}
