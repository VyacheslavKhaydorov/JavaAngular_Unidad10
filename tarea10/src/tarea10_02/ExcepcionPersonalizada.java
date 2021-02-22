/**
 * 
 */
package tarea10_02;

/**
 * @author viach
 * Clase plantilla ExcepcionPersonalizada
 */
public class ExcepcionPersonalizada extends Exception {
	
	//Variables
	private int codigoExcepcion;
	
	//Constructores
	public ExcepcionPersonalizada() {
		super();
	}
		
	public ExcepcionPersonalizada(int error) {
		super();
		this.codigoExcepcion = error;
	}
	
	
	//Metodo mostrar mensaje de error
	@Override
	public String getMessage() {
		
		String mensaje = "";
		
		switch (codigoExcepcion) {
			//Error 1
			case 1:
				mensaje = "Error 1: al parecer algo no ha salido bien!";
				break;
			//Error 2
			case 2:
				mensaje = "Error 2: al parecer algo no ha salido bien!";
				break;
			//Error 3
			case 3:
				mensaje = "Error 3: al parecer algo no ha salido bien!";
				break;
		}
		
		return mensaje;
		
	}

}
