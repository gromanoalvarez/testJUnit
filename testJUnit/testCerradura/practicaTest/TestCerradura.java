/**
 * 
 */
package practicaTest;

import org.junit.Assert;
import org.junit.Test;

import practicaTest.Cerradura;

/**
 * @author Romano Alvarez German
 *
 * Alumno UnLam
 */
public class TestCerradura {
	
	@Test
	public void queSePuedaCrearLaCerradura(){
		Cerradura numero1 = new Cerradura(1234);
		Assert.assertNotNull(numero1);
	}

	@Test
	public void queAlCrearseEsteCerrada() {
		Cerradura numero1 = new Cerradura(1234);
		Assert.assertFalse(numero1.getEstaAbierta());
	}
	
	@Test
	public void queAlPonerLaContrase�aSeAbra() {
		Cerradura numero1 = new Cerradura(1234);
		numero1.abrir(1234);
		Assert.assertTrue(numero1.getEstaAbierta());
	}
	
	@Test
	public void queAlPonerMalLaContrase�aNoSeAbra() {
		Cerradura numero1 = new Cerradura(1234);
		numero1.abrir(9977);
		Assert.assertFalse(numero1.getEstaAbierta());
	}
	
	@Test
	public void queAlPonerLaContrase�aSeCierre() {
		Cerradura numero1 = new Cerradura(1234);
		numero1.cerrar(1234, 6666);
		Assert.assertFalse(numero1.getEstaAbierta());
	}
	
	@Test
	public void queAlPonerMalLaContrase�aNoSeCierre() {
		Cerradura numero1 = new Cerradura(1234);
		numero1.cerrar(4039, 6666);
		Assert.assertFalse(numero1.getEstaAbierta());
	}
	
	@Test
	public void queSePuedaCambiarLaContrase�a() {
		Cerradura numero1 = new Cerradura(1234);
		numero1.cambiarContrase�a(1234, 0023);
		Integer claveEsperada=0023;
		Assert.assertEquals(claveEsperada, numero1.getContrase�a());
	}
}
