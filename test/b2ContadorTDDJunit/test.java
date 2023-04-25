package b2ContadorTDDJunit;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	public void cuandoSeCrearElContadorSuValorEsCero() {
		Contador myContador = new Contador();
		Integer valor = myContador.valor();
		
		assertEquals(valor, 0);
	}
	
	@Test
	public void cuandoPresionoElContadorSumaUnaUnidad() {
		Contador myContador = new Contador();
		myContador.presionoElContador();
		Integer valor = myContador.valor();
		
		assertEquals(valor, 1);
		
	}
	
	@Test
	public void cuandoSumoPorErrorEntoncesDisminuyoUnaUnidad() {
		Contador myContador = new Contador();
		myContador.presionoElContador();
		myContador.presionoElContador();
		
		myContador.disminuyoUnaUnidad();
		Integer valor = myContador.valor();
		
		assertEquals(valor, 1);
	}
	
	@Test
	public void cuandoTerminoDeContarVisualizoElTotal() {
		Contador myContador = new Contador();
		myContador.presionoElContador();
		Integer valor = myContador.valor();
		
		
		assertEquals(valor, 1);
	}
	

}
