import java.util.Scanner;

public class HamburgueseriaMetodos {

public static void menu() {
	System.out.println("Elige una opción:\n"
			+ "1.- Elegir Menú principal\n"
			+ "2.- Elegir Complementos\n"
			+ "3.- Pagar\n"
			+ "4.- Salir");
}

public static int input(int a, int b) {
	/*Valida que un valor introducido por teclado este 
	 * comprendido en un tramo determinado.
	 * Valores limites incluidos.
	 * 
	 * @param: int a: valor inicial
	 * @param:int b: valor final
	 * @return:int input: Valor comprendido entre esos 2.
	 */
	Scanner s = new Scanner(System.in);

	int input = 0;
	do {

	input = s.nextInt();
	if (input < a || input > b) {
		System.out.println("valor no valido");

	}
	} while (input<a||input>b);
	return input;
}


public static boolean mPrincipal() {
	boolean menu = true;
	System.out.println("¿Desea Menu americano o classic?\n"
			+ "1.-Americano.\n"
			+ "2.-Classic.\n");
	int eleccion = input(1,2);
	if (eleccion ==1) {
		menu = true;
	} else {
		menu = false;
	}
	return menu;
} 


public static int patatas (boolean fMPrincipal, boolean mPrincipal) {
	int patatas= 0;
	if (fMPrincipal == false) {
		System.out.println("Debe seleccionar un menu principal.");
	} else {
		if (mPrincipal) {
			System.out.println("Desea patatas?\n"
					+ "1.-Si\n"
					+ "2.-No\n");
			int inputP = input(1,2);
			System.out.println("Desea salsa?\n"
					+ "1.-Si\n"
					+ "2.-No\n");
			int inputS = input(1,2);
				if(inputP==1 && inputS ==2) {
					patatas=3;
				} else if(inputP == 1 && inputS == 2) {
					patatas =1;
				} else if (inputP == 2 && inputS == 1) {
					patatas = 2;
				} else if (inputP ==2 && inputS ==2) {
					patatas = 4;
				}
			} else {
				System.out.println("Desea patatas?\n"
						+ "1.-Si\n"
						+ "2.-No\n");
				int inputP = input(1,2);
				if (inputP == 1) {
					patatas = 1;
				} else {
					patatas = 4;
				}
			}
		}
	return patatas;
	}

public static double precio (boolean fMPrincipal, boolean mPrincipal, int patatas) {

	double precio = 0;
	if (mPrincipal) {
		 precio += 18.5;
	} else {
		precio += 17.5;
	}
	if (patatas == 1) {
		precio += 2;
	} else if (patatas == 2) {
		precio +=2.5;
	} else if (patatas == 3) {
		precio += 4.5;
}
	return precio;
}

public static void printPrecio(double precio) {
	System.out.println("El coste de su pedido es "+precio);
}
}

