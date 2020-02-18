package aula2FormasGeometricas;

public class Trapezio {
	private double baseM;
	private double basem;
	private double altura;
	
	public double getBaseM() {
		return baseM;
	}
	public void setBaseM(double bM) {
		this.baseM = bM;
	}
	public double getBasem() {
		return basem;
	}
	public void setBasem(double bm) {
		this.basem = bm;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double a) {
		this.altura = a;
	}
	
	public double calculaArea(){
		double area=((this.baseM+this.basem)*this.altura)/2;
		return area;
	}
	
}
