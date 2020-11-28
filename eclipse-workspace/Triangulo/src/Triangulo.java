import java.util.Scanner;

public class Triangulo {
	private Scanner teclado;
	private int lado1, lado2, lado3;
	
	public void inicializador() {
		teclado = new Scanner(System.in);
		System.out.print("Medida del lado 1: ");
		lado1 = teclado.nextInt();
		System.out.print("Medida del lado 2: ");
		lado2 = teclado.nextInt();
		System.out.print("Medida del lado 3: ");
		lado3 = teclado.nextInt();
	}
	public void ladoMayor() {
		System.out.println("Lado Mayor: ");
		if(lado1 > lado2 && lado1 > lado3) {
			System.out.println("Lado1 1");
		}else {
			if(lado2 > lado3) {
				System.out.println("Lado 2");
			}else{
				System.out.println("Lado 3");
			}		
		}
		
	}
	public void esEquilatero() {
			
		if(lado1 == lado2 && lado1 == lado3) {
			System.out.println("Es un tringulo equilatero");
		}else {
			System.out.println("No es un tringulo equilatero");
		}
	}
	public static void main(String[] ar) {
		Triangulo triangulo1 = new Triangulo();
		triangulo1.inicializador();
		triangulo1.ladoMayor();
		triangulo1.esEquilatero(); 
	}
	
	
	
	
}
