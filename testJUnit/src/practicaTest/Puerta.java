/**
 * 
 */
package practicaTest;

/**
 * @author Romano Alvarez German
 *
 * Alumno UnLam
 */
public class Puerta {
	private Cerradura cerradura1;
	private Cerradura cerradura2;
	private Cerradura cerradura3;
	private Boolean estaAbierta;
	
	public Puerta(Cerradura cerradura1, Cerradura cerradura2, Cerradura cerradura3) {
		this.cerradura1=cerradura1;
		this.cerradura2=cerradura2;
		this.cerradura3=cerradura3;
		this.estaAbierta=false;
	}

	public Boolean getEstaAbierta() {
		return estaAbierta;
	}

	public Boolean abrir(Integer contrase�aCerradura1, Integer contrase�aCerradura2, Integer contrase�aCerradura3) {
		if(cerradura1.getContrase�a().equals(contrase�aCerradura1)) {
			if(cerradura2.getContrase�a().equals(contrase�aCerradura2)) {
				if(cerradura3.getContrase�a().equals(contrase�aCerradura3)) {
					estaAbierta=true;
				}
			}	
		}	
		return this.estaAbierta;
	}

	public Boolean cerrar() {
		return (estaAbierta=false);
	}
	
}
