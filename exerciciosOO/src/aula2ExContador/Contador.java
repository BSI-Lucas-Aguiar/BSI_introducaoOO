package aula2ExContador;

public class Contador {
	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void incrementa() {
		this.numero+=1;
	}
	
	public void desfaz() {
		this.numero-=1;
	}

}
