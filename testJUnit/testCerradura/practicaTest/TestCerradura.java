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
	public void queAlPonerLaContraseñaSeAbra() {
		Cerradura numero1 = new Cerradura(1234);
		numero1.abrir(1234);
		Assert.assertTrue(numero1.getEstaAbierta());
	}
	
	@Test
	public void queAlPonerMalLaContraseñaNoSeAbra() {
		Cerradura numero1 = new Cerradura(1234);
		numero1.abrir(9977);
		Assert.assertFalse(numero1.getEstaAbierta());
	}
	
	@Test
	public void queAlPonerLaContraseñaSeCierre() {
		Cerradura numero1 = new Cerradura(1234);
		numero1.cerrar(1234, 6666);
		Assert.assertFalse(numero1.getEstaAbierta());
	}
	
	@Test
	public void queAlPonerMalLaContraseñaNoSeCierre() {
		Cerradura numero1 = new Cerradura(1234);
		numero1.cerrar(4039, 6666);
		Assert.assertFalse(numero1.getEstaAbierta());
	}
	
	@Test
	public void queSePuedaCambiarLaContraseña() {
		Cerradura numero1 = new Cerradura(1234);
		numero1.cambiarContraseña(1234, 0023);
		Integer claveEsperada=0023;
		Assert.assertEquals(claveEsperada, numero1.getContraseña());
	}
}
