package aula2FormasGeometricas;

public class Circulo {

	private double raio;
	
	public void setRaio(double r){
		this.raio=r;
	}
	
	public double getRaio(){
		return this.raio;
	}
	
	public double calculaArea(){
		double area=Math.PI*(this.raio*this.raio);
		return area;
	}
}
