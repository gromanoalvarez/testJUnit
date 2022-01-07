/**
 * 
 */
package practicaTest;

/**
 * @author Romano Alvarez German
 *
 * Alumno UnLam
 */
public class Cerradura {

	private Integer contraseña;
	private Boolean estaAbierta;

	public Cerradura(int contraseña) {
		this.contraseña=contraseña;
		this.estaAbierta=false;
	}

	public Boolean getEstaAbierta() {
		return estaAbierta;
	}

	public void abrir(int contraseña) {
		if(estaAbierta==false && this.contraseña.intValue() == contraseña){
			estaAbierta= true;
		}
	}

	public void cerrar(int contraseñaActual, int contraseñaNueva) {
		if(estaAbierta==true && this.contraseña.intValue() == contraseña){
			estaAbierta= false;
			contraseña=contraseñaNueva;
		}
	}

	public void cambiarContraseña(int contraseñaActual, int contraseñaNueva) {
		if( this.contraseña.intValue() == contraseñaActual){
			contraseña=contraseñaNueva;
		}
		
	}

	public Object getContraseña() {
		return contraseña;
	}

}
