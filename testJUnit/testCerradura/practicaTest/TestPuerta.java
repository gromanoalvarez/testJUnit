/**
 * 
 */
package practicaTest;

import org.junit.Assert;
import org.junit.Test;

import practicaTest.Cerradura;
import practicaTest.Puerta;

/**
 * @author Romano Alvarez German
 *
 * Alumno UnLam
 */
public class TestPuerta {
	
	@Test
	public void queSePuedaCrearUnaPuerta() {
		Cerradura cerradura1 = new Cerradura(0001);
		Cerradura cerradura2 = new Cerradura(0002);
		Cerradura cerradura3 = new Cerradura(0003);
		Puerta pentagono = new Puerta(cerradura1,cerradura2,cerradura3);
		Assert.assertNotNull(pentagono);
	}
	
	@Test
	public void queAlCrearseEsteCerrada() {
		Cerradura cerradura1 = new Cerradura(0001);
		Cerradura cerradura2 = new Cerradura(0002);
		Cerradura cerradura3 = new Cerradura(0003);
		Puerta pentagono = new Puerta(cerradura1,cerradura2,cerradura3);
		Assert.assertFalse(pentagono.getEstaAbierta());
	}
	
	@Test
	public void queAlIngresarLasClavesCorrectamenteSeAbra() {
		Cerradura cerradura1 = new Cerradura(0001);
		Cerradura cerradura2 = new Cerradura(0002);
		Cerradura cerradura3 = new Cerradura(0003);
		Puerta pentagono = new Puerta(cerradura1,cerradura2,cerradura3);
		Assert.assertTrue(pentagono.abrir(0001,0002,0003));
	}
	
	@Test
	public void queAlIngresarLasClavesIncorrectamenteNoSeAbra() {
		Cerradura cerradura1 = new Cerradura(0001);
		Cerradura cerradura2 = new Cerradura(0002);
		Cerradura cerradura3 = new Cerradura(0003);
		Puerta pentagono = new Puerta(cerradura1,cerradura2,cerradura3);
		Assert.assertFalse(pentagono.abrir(2171,1785,0503));
	}
	
	@Test
	public void queSePuedaCerrarLaPuerta() {
		Cerradura cerradura1 = new Cerradura(0001);
		Cerradura cerradura2 = new Cerradura(0002);
		Cerradura cerradura3 = new Cerradura(0003);
		Puerta pentagono = new Puerta(cerradura1,cerradura2,cerradura3);
		pentagono.abrir(0001,0002,0003);
		pentagono.cerrar();
		Assert.assertFalse(pentagono.getEstaAbierta());
	}
}
