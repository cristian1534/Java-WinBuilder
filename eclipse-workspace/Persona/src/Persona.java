
import java.util.Scanner;

public class Persona {
	private Scanner teclado;
	private String nombre;
	private int edad;
	
	
	public void inicializar() {
		teclado = new Scanner(System.in);
		System.out.print("Ingrese nombre: ");
		nombre = teclado.next();
		System.out.print("Ingrese edad: ");
		edad = teclado.nextInt();
	}
	
	public void imprimir() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
	}
	
	public void esMayor() {
		if(edad >= 18) {
			System.out.println(nombre + " es mayor de edad.");
		}else {
			System.out.println(nombre + " no es mayor de edad.");
		}
	}
	
	public static void main(String[] ar) {
		Persona persona1;
		persona1 = new Persona();
		persona1.inicializar();
		persona1.imprimir();
		persona1.esMayor();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
