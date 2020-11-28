import java.util.Scanner;

public class Operaciones {
	static Scanner teclado;
	private int a,b;
	static int opcion;
	static String respuesta;
	
	public void inicializador() {
		teclado = new Scanner(System.in);
		System.out.print("Ingresar valor 'a': ");
		a = teclado.nextInt();
		System.out.print("Ingresar valor 'b': ");
		b = teclado.nextInt();
		
	}
	public void suma() {
		System.out.print("El resultado de su operacion es: " + (a + b));
	}
	public void resta() {
		System.out.print("El resultado de su operacion es: " + (a - b));
	}
	public void multiplicacion() {
		System.out.print("El resultado de su operacion es: " + (a * b));
	}
	public void division() {
		System.out.print( "El resultado de su operacion es: " + (a / b));
	}
	
	public static void main(String[] ar) {
	
		Operaciones valor = new Operaciones();
		valor.inicializador();
		
		
		do {
						
			System.out.println("");
			System.out.println("Menu de Operaciones -Elija una Opcion Valida-");
			System.out.println("1- Suma.");
			System.out.println("2- Resta.");
			System.out.println("3- Division.");
			System.out.println("4- Multiplicacion.");
			System.out.println("5- Salir.");
			opcion = teclado.nextInt();
			switch(opcion)
			{
			
			case 1:valor.suma();
			break;
			case 2: valor.resta();
			break;
			case 3: valor.division();
			break;
			case 4: valor.multiplicacion();
			break;
			case 0: System.exit(0);
			break;
			default: System.out.print("Debe elegir una Opcion Valida.");
			break;
			}
						
			System.out.println("");
			System.out.print("Desea otra operacion?: 'Si/No':   ");
			respuesta = teclado.next(); 
			if(respuesta == "No" || respuesta == "no") {
				System.exit(0);
			}			
			
		}while(opcion != 0);	
	}
}
