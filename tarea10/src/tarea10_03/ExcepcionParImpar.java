/**
 * 
 */
package tarea10_03;

/**
 * @author viach
 *
 */
public class ExcepcionParImpar extends Exception{
	
	//Variables
	private int codigoExcepcion;
	
	//Constructores
	public ExcepcionParImpar() {
		super();
	}
		
	public ExcepcionParImpar(int error) {
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
				mensaje = "Es un numero par";
				break;
			//Error 2
			case 2:
				mensaje = "Es un numero impar";
				break;
		}
		
		return mensaje;
		
	}
	
}
