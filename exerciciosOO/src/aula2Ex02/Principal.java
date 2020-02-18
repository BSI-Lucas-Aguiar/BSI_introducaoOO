
public class Principal {

	public static void main(String[] args) {
		
		Balanco b1;
		b1=new Balanco();
		
		b1.setMes1(1000);
		b1.setMes2(2000);
		b1.setMes3(3000);
		
		System.out.println(b1.calculaTrimestre());

	}

}
