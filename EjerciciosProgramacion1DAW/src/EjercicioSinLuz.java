import java.util.Scanner;

public class EjercicioSinLuz {

	public static void main(String[] args) {
		/* Solicita notas musicales.
		 * "Do Re Mi Fa Sol La Si Do"
		 * Cuando ponga fin se acaba
		 * Cuando termina te dice cuantos "Fa" "Re" han sido introducidos.
		 * Si el input es erroneo te lo dice y no cuenta
		 * Lo que cuenta es un Fa y una Re.
		 * 
		 */

		//PARAMETROS:
		Scanner s = new Scanner (System.in);
		String input = "";
		int counter = 0, counterNotas= 0;
		boolean fa = false;
		
		do {
			System.out.println("Introduce una nota:");
			input = s.nextLine().toLowerCase();
			if(input.equals("fa")) {
				System.out.println(input+"+");
				fa=true;
			} else if (input.equals("do") || input.equals("mi")|| input.equals("fa") || input.equals("sol") || input.equals("la") || input.equals("sol") || input.equals("la") || input.equals("si")) {
				System.out.println(input);
				fa = false;
		} else if (input.equals("re") && !fa) {
			System.out.println(input);
		}else if (input.equals("re") && fa) {
			System.out.println(input+"+");
				counter++;
				fa = false;
			} else if(input.equals("fin")){
				
			} else {
				System.out.println("Nota errónea, por favor introduce una nota correcta.");
			}
			counterNotas++;
		} while ( !input.equals("fin"));
		System.out.println("La secuencia fa, re se ha repetido "+counter+ " veces de un total de "+counterNotas+ " notas.");
	}

}
