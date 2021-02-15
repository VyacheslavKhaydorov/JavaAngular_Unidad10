/**
 * 
 */
package tarea10_04;

/**
 * @author viach
 * Excepciones de la CalculadoraApp
 */
public class ExcepcionCalculadora extends Exception {

	//Variables
	private int codigoExcepcion;
	
	
	//Constructor
	public ExcepcionCalculadora() {
		super();
	}
		
	public ExcepcionCalculadora(int error) {
		super();
		this.codigoExcepcion = error;
	}
	
	
	//Metodo mostrar mensaje de error
	@Override
	public String getMessage() {
		
		String mensaje = "";
		
		switch (codigoExcepcion) {
			//Raiz de un numero negativo
			case 01:
				mensaje = "La raiz cuadrada de un numero negativo es un numero imaginario";
				break;
			//Si nos salimos del rango de Double
			case 02:
				mensaje = "Este numero es demasiado grande... :O";
				break;
			//Error al introducir signo aritmetico
			case 03:
				mensaje = "El signo aritmético introducido para realizar la operación no se reconoce :-(";
				break;
		}
		
		return mensaje;
		
	} 
	
}
