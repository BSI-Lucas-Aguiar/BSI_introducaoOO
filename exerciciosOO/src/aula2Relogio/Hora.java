package aula2Relogio;

public class Hora {
	private int hora;
	private int minuto;
	private int segundo;
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	public String mostrarHora() {
		String horaCompleta;
		horaCompleta=this.hora+":"+this.minuto+":"+this.minuto;
				
		return horaCompleta;
	}
}
