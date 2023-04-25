package b2ContadorTDDJunit;

public class Contador {

	// variables
	Integer valor = 0;
	
	
	// metodos
	public Integer valor() {
		return valor;
	}

	
	public void presionoElContador() {
		this.valor = this.valor + 1;		
	}


	public void disminuyoUnaUnidad() {
		this.valor = this.valor - 1;
		
	}
	
	

}
