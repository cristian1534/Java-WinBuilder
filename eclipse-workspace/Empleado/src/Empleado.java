import java.util.Scanner;

public class Empleado {
	private Scanner teclado;
	private String nombre;
	private int sueldo;
	
	public void inicializador() {
		
		teclado = new Scanner(System.in);
		System.out.print("Ingrese nombre del Empleado: ");
		nombre = teclado.next();
		System.out.print("Ingrese el Sueldo: ");
		sueldo = teclado.nextInt();
		
	}
	public void imprimirDatos() {
		System.out.print("Nombre del Empleado : "+ nombre);
		System.out.print("Sueldo del Empleado: "+ sueldo);
		System.out.print("");
	}
	
	public void pagaImpuestos() {
		if(sueldo > 3000) {
			System.out.print("Debe pagar impuesto.");			
		}else {
			System.out.print("No debe pagar impuesto.");
		}
	}
	
	public static void main(String[] ar) {
		Empleado empleado1 = new Empleado();
		empleado1.inicializador();
		empleado1.imprimirDatos();
		empleado1.pagaImpuestos();
	}
			
}
