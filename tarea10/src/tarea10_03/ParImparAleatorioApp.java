/**
 * 
 */
package tarea10_03;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author viach
 *
 */
public class ParImparAleatorioApp {

	//Constantes
	private static final int VALOR_MIN = 0;
	private static final int VALOR_MAX = 999;
	
	public static void main(String[] args) {

		//Variables
		int numero;
		
		//Generamos un valor aleatorio
		numero = enteroAleatorio(VALOR_MIN, VALOR_MAX);
		
		//Es par o impar? Arrojamos una excepcion que lo muestra
		try {
			System.out.println("Numero aleatorio generado: " + numero);
			if (numero % 2 == 0)
				throw new ExcepcionParImpar(1);
			else
				throw new ExcepcionParImpar(2);
		} catch(ExcepcionParImpar excep) {
			System.out.println(excep.getMessage());
		}

	}
	
	//Metodo para generar un numero aleatorio
	public static int enteroAleatorio(int rangoInferior, int rangoSuperior) {
		
		int numEnteroAleatorio = ThreadLocalRandom.current().nextInt(rangoInferior, (rangoSuperior + 1));
		
		return numEnteroAleatorio;
		
	}

}
