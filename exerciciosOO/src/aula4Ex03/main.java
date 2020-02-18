package aula4Ex03;

public class main {

	public static void main(String[] args) {
		Energia e1;
		e1=new Energia();
	
		e1.setQuantQuilowatts(200);
		
		System.out.println("Sal�rio: "+e1.getValorSalarioMinimo());
		System.out.println("Quilowatts: "+e1.getQuantQuilowatts());
		
		System.out.println("Valor Quilowatt: "+e1.calcularValorQuilowatts());
		System.out.println("Valor conta: "+e1.calcularContaResidencia());
		System.out.println("Conta com desconto: "+e1.descontarContaResidencia());
		
	}

}
