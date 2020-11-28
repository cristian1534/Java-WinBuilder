import java.util.Scanner;

public class Persona {
	
	private Scanner teclado;
	private String nombre;
	private int edad;
	
	
	public void inicio() {
		teclado = new Scanner(System.in);
		

		System.out.println("");
		System.out.println("");
		
		System.out.print("Ingrese su Nombre: ");
		nombre = teclado.next();
		System.out.print("Ingrese su Edad: ");
		edad = teclado.nextInt();
		}
	
	public void datos() {
		System.out.println("");
		System.out.println("		DATOS OBTENIDOS: ");
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
	}
	

}
