import java.util.Scanner;

public class Socio {
	
	private Scanner teclado;
	private String [] nombre;
	private int [] antiguedad;
	
	
	public void datos() {
		teclado = new Scanner(System.in);
		nombre = new String [3];
		antiguedad = new int [3];
		
		for(int i=0;i<nombre.length;i++) {
			
			System.out.print("Ingrese su Nombre: ");
			nombre[i] = teclado.next();
			System.out.print("Ingrese su Antiguedad: ");
			antiguedad[i] = teclado.nextInt();
			
		}
	}
	
	int mayor(int antiguedad []) {
		int m = antiguedad[0];
		int p = 0;
		
		for(int i=0;i<antiguedad.length;i++) {
			if(antiguedad[i] > m ) {
				m = antiguedad[i];
				p = i;
			}
		}
		return p;
	}
	
	void imprimirMayor() {
		int p = mayor(antiguedad);
		System.out.println("");
		System.out.println("El socio de mayor antiguedad es: " + nombre[p] + " porque tiene " + antiguedad[p] + " años"
				+ " de antiguedad.");
	}
	
	public void imprimir() {
		
	}
	

}

