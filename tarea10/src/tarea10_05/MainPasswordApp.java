/**
 * 
 */
package tarea10_05;

/**
 * @author Cesar Torrelles, Ingrid Dominguez, Vyacheslav Khaydorov
 *
 */
import java.util.Scanner;

public class MainPasswordApp {
	public static void main(String[] args) {
		Password contraseñas []; //Array para guardar las contraseñas
		boolean contraseñaFuerte []; //Array para guardar si son fuertes o no
		int tamaño; //Tamaño de los arrays introducido por teclado
		int longitud; //Longitud de la contraseña
		Scanner input = new Scanner (System.in);
		
		//Preguntamos cuantas contraseñas vamos a generar
		System.out.println("Cuantas contraseñas quieres generar?");
		tamaño = input.nextInt();
		
		//Dimensionamos los arrays
		contraseñas = new Password [tamaño];
		contraseñaFuerte = new boolean [tamaño];
		
		//Preguntamos la longitud de las contraseñas
		System.out.println("Introduce la longitud de las contraseñas");
		longitud = input.nextInt();
		
		//Método para crear las contraseñas
		Metodos.crearContraseñas(longitud, tamaño, contraseñas);
		
		//Método para saber si una contraseña és fuerte y guardar el resultado en el array
		Metodos.contraseñasFuertes(contraseñas, contraseñaFuerte);
		
		//Método para mostrar el array
		Metodos.mostrarArray(contraseñas, contraseñaFuerte);
		
		//Cerramos el teclado
		input.close();
	}

}
