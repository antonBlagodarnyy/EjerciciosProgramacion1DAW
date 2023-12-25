package boletin8;
import java.util.Scanner;
public class introduccion {

	public static void main(String[] args) {
		/*1.-Crear un programa, que solicite por teclado dos frases, e indique cuál es la más corta
2.-Desarrollar una aplicación que pida al usuario una frase, e indique a continuación cuántas veces contiene la letra ‘t’
3.-Desarrollar un método que se le pase una cadena de carácteres, y la devuelva invertida.*/
		fraseMasLarga();
		numeroDeLetrasT();
		String cadena = "holamundoo s";
		String cadenaInvertida = cadenaInvertida(cadena);
		System.out.println(cadenaInvertida);

		System.out.println(cadena);

		System.out.println(cadena);
	}
	public static void fraseMasLarga () {
		Scanner s = new Scanner (System.in);
		System.out.println("Introduzca una frase.");
		String f1 = s.nextLine();
		
		System.out.println("Introduzca otra frase.");
		String f2 = s.nextLine();
				
		if(f1.length()==f2.length()) {
			System.out.println("las 2 frases son igual de largas.");
		}else if(f1.length()>f2.length()) {
			System.out.println("las primera frase es mas larga.");
	} else {
		System.out.println("La segunda frase es mas larga.");
	}
	}

public static void numeroDeLetrasT() {
	Scanner s = new Scanner (System.in);
	char caracterIntroducido = ' ';
	final char CARACTERDESEADO = 't'
;	int counter=0;
	System.out.println("Introduzca una frase:");
	String frase= s.nextLine();
	for (int i = 0; i < frase.length();i++) {
		 caracterIntroducido = frase.charAt(i);
		 if (caracterIntroducido==CARACTERDESEADO) {
			 counter ++;
		 }
	}
	System.out.println("Numero de \"t\"s "+counter);
}

public static String cadenaInvertida (String cadena) {
	String invertido = "";
	for (int i=cadena.length();i>0;i--) {
		invertido +=cadena.charAt(i-1);
	}
	return invertido;
}

public static String encriptar(String codigo, int parametro ) {
	String encriptado="";
	
	for (int i = 0; i < codigo.length();i++) {
		char caracter = codigo.charAt(i);
		caracter+=parametro;
		encriptado += caracter;
		 }
	return encriptado;
	
}

}
