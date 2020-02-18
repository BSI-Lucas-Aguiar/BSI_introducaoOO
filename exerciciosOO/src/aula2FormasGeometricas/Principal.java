package aula2FormasGeometricas;

public class Principal {

	public static void main(String[] args) {
		
		
		Circulo c1;
		c1=new Circulo();
		
		//Circulo c2 = new Circulo();
		
		c1.setRaio(3);
		
		System.out.println("Circulo:");
		System.out.println("Raio: "+c1.getRaio());
		System.out.println("Area do C�rculo: " + c1.calculaArea());
		
		
		Triangulo t1;
		t1=new Triangulo();
		
		t1.setBase(2);
		t1.setAltura(2);
		
		System.out.println("Triangulo:");
		System.out.println("Base: "+t1.getBase());
		System.out.println("Altura: "+t1.getAltura());
		System.out.println("Area do Triangulo: " + t1.calculaArea());
		
		Quadrado q1;
		q1=new Quadrado();
		
		q1.setLado(5);
		
		System.out.println("Quadrado:");
		System.out.println("Lado: "+q1.getLado());
		System.out.println("Area do Quadrado: " + q1.calculaArea());
		
		Trapezio z1;
		z1=new Trapezio();
		
		z1.setBaseM(5);
		z1.setBasem(2);
		z1.setAltura(3);
		
		System.out.println("Trapezio:");
		System.out.println("Base Maior: "+z1.getBaseM());
		System.out.println("Base Menor: "+z1.getBasem());
		System.out.println("Altura: "+z1.getAltura());
		System.out.println("Area do Trapezio: " + z1.calculaArea());
		

	}

}
