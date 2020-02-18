package aula2FormasGeometricas;

public class Triangulo {
	private double base;
	private double altura;
	
	public void setBase(double b){
		this.base=b;
	}
	
	public void setAltura(double a){
		this.altura=a;
	}
	
	public double getBase(){
		return this.base;
	}
	
	public double getAltura(){
		return this.altura;
	}
	
	public double calculaArea(){
		double area=(this.base*this.altura)/2;
		return area;
	}
}
