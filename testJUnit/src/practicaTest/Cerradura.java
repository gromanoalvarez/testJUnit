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

	private Integer contrase�a;
	private Boolean estaAbierta;

	public Cerradura(int contrase�a) {
		this.contrase�a=contrase�a;
		this.estaAbierta=false;
	}

	public Boolean getEstaAbierta() {
		return estaAbierta;
	}

	public void abrir(int contrase�a) {
		if(estaAbierta==false && this.contrase�a.intValue() == contrase�a){
			estaAbierta= true;
		}
	}

	public void cerrar(int contrase�aActual, int contrase�aNueva) {
		if(estaAbierta==true && this.contrase�a.intValue() == contrase�a){
			estaAbierta= false;
			contrase�a=contrase�aNueva;
		}
	}

	public void cambiarContrase�a(int contrase�aActual, int contrase�aNueva) {
		if( this.contrase�a.intValue() == contrase�aActual){
			contrase�a=contrase�aNueva;
		}
		
	}

	public Object getContrase�a() {
		return contrase�a;
	}

}
