import java.util.Scanner;

public class Empleado extends Persona{
			
		private Scanner teclado;
		private int sueldo;
			
		public void sueldo() {
			teclado = new Scanner(System.in);	
			
			System.out.print("Ingrese su sueldo: ");
			sueldo = teclado.nextInt();
		}
		
		public void infoSueldo() {
			System.out.print("El sueldo es: $ " + sueldo);
		}
		
		
		public static void main(String [] ar) {
			
			Persona persona1 = new Persona();
			persona1.inicio();
			persona1.datos();
			
			
			Empleado empleado1 = new Empleado();
			empleado1.inicio();
			empleado1.sueldo();
			empleado1.datos();
			empleado1.infoSueldo();
		}
		
		
		
}
