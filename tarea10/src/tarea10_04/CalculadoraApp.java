/**
 * 
 */
package tarea10_04;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author viach
 * Calculadora de operaciones simples usando las excepciones definidas en la API de Java.
 */
public class CalculadoraApp {

	public static void main(String[] args) throws ExcepcionCalculadora {
		
		//Variables
		double valor1 = 0, valor2 = 0, resultado = 0;
		Scanner input = new Scanner(System.in);
		String signoAritmetico;
		
		//Captura de datos por consola
		System.out.println("Introduce un valor:");
		valor1 = input.nextDouble();
		input.nextLine();	//Para consumir el salto de línea
		System.out.println("Introduce el signo aritmetico de la operacion:\n"
				+ "+ para sumar\n- para restar\n* para multiplicar\n/ para dividir\n"
				+ "^ para elevar el primer valor a la potencia del segundo\nr2 "
				+ "para la raiz cuadrada\nr3 para la raiz cubica\n% para el "
				+ "modulo");
		signoAritmetico = input.nextLine();
		if (!signoAritmetico.equals("r2") && !signoAritmetico.equals("r3")) {
			System.out.println("Introduce el segundo valor de la operación:");
			valor2 = input.nextDouble();
		}
		
		//Operamos con los datos
		switch (signoAritmetico) {
			case "+":
				resultado = MetodosCalculo.suma(valor1, valor2);
				break;
			case "-":
				resultado = MetodosCalculo.resta(valor1, valor2);
				break;
			case "*":
				resultado = MetodosCalculo.multiplicacion(valor1, valor2);
				break;
			case "/":
				resultado = MetodosCalculo.division(valor1, valor2);
				break;
			case "^":
				resultado = MetodosCalculo.potencia(valor1, valor2);
				break;
			case "r2":
				resultado = MetodosCalculo.raizCuadrada(valor1);
				break;
			case "r3":
				resultado = MetodosCalculo.raizCubica(valor1);
				break;
			case "%":
				resultado = MetodosCalculo.modulo(valor1, valor2);
				break;
			default:
				//Si no reconoce el signo aritmetico, arroja excepcion
				throw new ExcepcionCalculadora(3);
		}
		
		//Mostramos resultado
		if (Double.isInfinite(resultado)) throw new ExcepcionCalculadora(2);
		System.out.println("Resultado: "+ resultado);
			
	}

}
