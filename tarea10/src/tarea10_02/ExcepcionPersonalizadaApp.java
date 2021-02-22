/**
 * 
 */
package tarea10_02;

/**
 * @author viach
 * Programa que lanza una excepcion personalizada.
 */
public class ExcepcionPersonalizadaApp {

	public static void main(String[] args) {
		
		int prueba = 3;
		
		try {
			if (prueba != 0)
				throw new ExcepcionPersonalizada(prueba);
		} catch(Exception excep) {
			System.out.println(excep.getMessage());
		} finally {
			System.out.println("Pero no pasa nada, solo es una prueba :)");
		}
	
	}

}
