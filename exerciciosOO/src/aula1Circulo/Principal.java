package aula1Circulo;

public class Principal {

	public static void main(String[] args) {
		Circulo c1;
		c1 = new Circulo();
		
		c1.raio=c1.PreencheRaio(c1.raio);
		c1.area=c1.PreencheArea(c1.raio);
		
		System.out.println(c1.raio);
		System.out.println(c1.area);
	}

}
