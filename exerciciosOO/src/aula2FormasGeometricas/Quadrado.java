package aula2FormasGeometricas;

public class Quadrado {
	private double lado;
	
	public void setLado(double l){
		this.lado=l;
	}
	
	public double getLado(){
		return this.lado;
	}
	
	public double calculaArea(){
		double area=(this.lado*2);
		return area;
	}
}
