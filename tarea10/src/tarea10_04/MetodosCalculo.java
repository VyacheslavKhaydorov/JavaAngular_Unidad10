/**
 * 
 */
package tarea10_04;

/**
 * @author viach
 * Metodos aritmeticos.
 */
public class MetodosCalculo {

	//Métodos para las operaciones aritméticas
	//Suma
	public static double suma (double a, double b) {
		return (a + b);
	}

	//Resta
	public static double resta (double a, double b) {
		return (a - b);
	}

	//Multiplicacion
	public static double multiplicacion (double a, double b) {
		return (a * b);
	}

	//Division
	//La division por 0 en Java solo produce una excepcion si es un int 0, en caso de
	//un double 0.0 da como resultado infinity, así que forzamos la Exception
	public static double division (double a, double b) {
		if (b == 0) throw new ArithmeticException("No se puede dividir entre 0");
		return (a / b);
	}

	//Potencia
	public static double potencia (double a, double b) {
		return (Math.pow(a, b));
	}

	//Raiz cuadrada
	//Es necesario que definamos una nueva excepcion porque el metodo Math.sqrt nos
	//devuelve NaN (numero imaginario)
	public static double raizCuadrada (double a) throws ExcepcionCalculadora {
		double resultado = Math.sqrt(a);
		if (Double.isNaN(resultado)) throw new ExcepcionCalculadora(1);	
		return resultado;
	}

	//Raiz cubica
	public static double raizCubica (double a) {
		return Math.cbrt(a);
	}

	//Modulo
	public static double modulo (double a, double b) {
		return (a % b);
	}

}
