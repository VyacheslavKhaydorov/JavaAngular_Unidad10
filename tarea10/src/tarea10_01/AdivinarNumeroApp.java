/**
 * 
 */
package tarea10_01;

import java.util.concurrent.ThreadLocalRandom;	//Para generar numeros aleatorios
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author viach
 * Juego para ver cuanto tarda en adivinar un número el usuario.
 */
public class AdivinarNumeroApp {

	//Constantes
	private static final int VALOR_MIN = 1;
	private static final int VALOR_MAX = 500;
	
	
	public static void main(String[] args) {
		
		buscarValor();

	}
	
	//Metodo buscarValor
	public static void buscarValor() {
		
		//Variables
		int numeroSecreto, numeroUsuario = 0, intentos = 0;
		boolean numeroValido = true;
		
		//Captura de datos
		System.out.println("Vamos a buscar un numero secreto!\n"
				+ "Esta entre el "+ VALOR_MIN + " y el " + VALOR_MAX);
		//Llamada al metodo de generacion de numeros aleatorios
		numeroSecreto = enteroAleatorio(VALOR_MIN, VALOR_MAX);	
		Scanner input = new Scanner(System.in);
		do {
			try {
			numeroUsuario = input.nextInt();
			numeroValido = true;
			} catch (InputMismatchException Excepcion) {
				System.out.println("Debe ingresar un numero entero!");
				numeroValido = false;
			}
			input.nextLine();	//Limpiamos el buffer
			if (numeroValido) {
				if (numeroUsuario < numeroSecreto)
					System.out.println("Es un numero mayor!");
				else  if (numeroUsuario > numeroSecreto)
					System.out.println("Es un numero menor!");
			}
			intentos++;
		} while (numeroUsuario != numeroSecreto);
			
		System.out.println("Lo lograste! El numero secreto era el " + numeroSecreto);
		System.out.println("Necesitaste " + intentos + " intentos para ello... Seguro que "
				+ "Akinator lo hace mas rapido! :S");
		
	}
	
	
	//Metodo para generar un numero aleatorio
	public static int enteroAleatorio(int rangoInferior, int rangoSuperior) {
		
		int numEnteroAleatorio = ThreadLocalRandom.current().nextInt(rangoInferior, (rangoSuperior + 1));
		
		return numEnteroAleatorio;
		
	}

}
