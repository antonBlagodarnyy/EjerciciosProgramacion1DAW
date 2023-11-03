import java.util.Scanner;
import java.lang.Math;

public class Boletin6 {

	public static void main(String[] args) {
		/*Ejercicio 0: Implementa en Java el método escribir, el cual muestra por pantalla “Hola”.
		*/
		//escribir();
		
		/*Ejercicio 1: Implementar en Java un método, que reciba 3 números enteros como entrada,
		 *y a continuación devuelva cuál es el mayor de los 3 números con return.*/ 
			//43 min
		//test por casos:
		/*System.out.println(numeroMayorDe3(1,0,0));//El primer num es mayor
		System.out.println(numeroMayorDe3(0,1,0));//El segundo num es mayor
		System.out.println(numeroMayorDe3(0,0,1));//El tercer num es mayor
		System.out.println(numeroMayorDe3(1,1,1));//Los 3 nums son iguales*/
		
		/*Ejercicio 2: Crear un programa, para el cual, dado el radio de una circunferencia,
		 * calcule según lo que elija el usuario, la longitud de la misma, el área y el volumen de la esfera que determina.*/
		 //System.out.println(circunferencia(4));
		
		
		/*Ejercicio 3: Diseñar un programa que nos permita calcular áreas y volúmenes de distintas figuras geométricas,
		 *  como conos, pirámides y cilindros, según elija el usuario.
		 */
		//parametros:
			Scanner s = new Scanner (System.in);
			int figura;
			int calculo;
			
		//main:
			System.out.println("¿Qué figura desea calcular?"
					+ "1.-Cono."
					+ "2.-Piramide."
					+ "3.-Cilindro.");
			figura = s.nextInt();
			
			System.out.println("¿Qué calculo desea hacer?"
					+ "1.-Area."
					+ "2.-Volumen.");
			calculo = s.nextInt();
			
				
			}
	}
	
	public static void escribir(){
		System.out.println("Hola");
	}
	
	public static int numeroMayorDe3(int a, int b, int c) {
		//param:
		int resultado;
		
		if (a== b && b == c && a==c) {//en caso de que los 3 num sean iguales
			System.out.println("Los numeros son iguales");
			resultado = 0;
		
		} else {
				if ( a > b && a > c) {
					resultado = a; 
					} else if ( b > c && b > a) {
						resultado = b;
					}else {
						resultado = c;
					}
		}
		
	return resultado;
	}

	public static double circunferencia(int r) {
		
		Scanner sString = new Scanner (System.in);
		double resultado = 0;
		int eleccion = 0;
		
		do {
			System.out.println("El radio introducido vale " + r 
					+ "\nQué desea calcular?\n"+
					"1.-Longitud de la circunferencia.\n" +
					"2.-Área de la circunferencia.\n" +
					"3.-Volumen de la esfera.\n");
				eleccion = sString.nextInt();
		switch (eleccion) {
		case 1:
			resultado = (r*2)*Math.PI;
			break;
		case 2:
			resultado = Math.pow(r, 2)*Math.PI;
			break;
		case 3:
			resultado = (4.0/3.0) * Math.PI * Math.pow(r, 3);
			break;
			default:
				System.out.println("Valor no valido."
						+ "Introduzca un numero del 1 al 3 para escoger una operacion.");
				break;
		}
	} while ( !(eleccion>=1 && eleccion <= 3));
		return resultado;
	}

	
}


