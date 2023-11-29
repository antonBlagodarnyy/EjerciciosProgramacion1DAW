
public class HamburgueseriaMain {

	public static void main(String[] args) {
		
int eleccion=0, patatas = 0;//eleccion del usuario y entero para asignar un valor a cada caso del complemento seleccionado
double precio = 0;//para calcular el precio
boolean mPrincipal = true, fMPrincipal =false, fPatatas = false;//banderas para comprobar valores asignados

do {//bucle del programa
	HamburgueseriaMetodos.menu();//mostramos las opciones y pedimos un valor
 eleccion = HamburgueseriaMetodos.input(1, 4);

if(eleccion==1) {
	if (fMPrincipal == false) {
	mPrincipal=HamburgueseriaMetodos.mPrincipal();
	System.out.println("Menu seleccionado.");
	fMPrincipal =true;
	} else {
		System.out.println("Ya ha seleccionado un menu.");
	}
	
} else if (eleccion == 2) {
	if (fMPrincipal == true) {
	if(fPatatas == false) {
	patatas = HamburgueseriaMetodos.patatas(fMPrincipal, mPrincipal);
	System.out.println("Complementos seleccionados.");
	fPatatas = true;
	} else {
		System.out.println("Ya ha seleccionado un complemento.");
	}
	} else {
		System.out.println("Debe seleccionar un menu antes de escoger un complemento.");
	}
	
} else if (eleccion ==3) {
	if(fMPrincipal==false) {
		System.out.println("Debe de seleccionar un menu antes de pagar.");
	}else {
		precio = HamburgueseriaMetodos.precio(fMPrincipal, mPrincipal, patatas);
		HamburgueseriaMetodos.printPrecio(precio);
		
		fMPrincipal = false;
		fPatatas = false;
		eleccion = 0;
		patatas = 0;
	}
}
	} while(eleccion!=4);
System.out.println("Fin del programa.");
	}
}
