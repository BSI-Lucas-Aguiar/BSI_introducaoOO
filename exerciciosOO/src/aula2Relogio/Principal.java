package aula2Relogio;

public class Principal {

	public static void main(String[] args) {
		
		Data d1;
		d1=new Data();
		
		Hora h1;
		h1=new Hora();
		
		Contato c1;
		c1=new Contato();
		
		d1.setDia(6);
		d1.setMes(5);
		d1.setAno(1994);
		
		h1.setHora(6);
		h1.setMinuto(6);
		h1.setSegundo(6);
		
		c1.setNome("Lucas de Figueiredo Aguiar");
		c1.setTelefone("(22)997 209 258");
		
		System.out.println(d1.mostrarData());
		System.out.println(h1.mostrarHora());
		System.out.println(c1.mostrarContato());
		
	}

}
