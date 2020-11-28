
import java.util.Scanner;

public class Binarios {

	private Scanner teclado;
	private int [] binario;
	private int num,x=0;
	
	public 	void inicializador() {
		teclado = new Scanner(System.in);
		binario = new int[10];
		
		System.out.print("Ingrese un Numero Entero: ");
		num = teclado.nextInt();
					
	}
	public void Binario() {
		
		
		
	}
	
	
	public static void main(String[] ar) {
		Binarios valor = new Binarios();
		valor.inicializador();
		valor.Binario();
	}
	
		
	
		
	
	
}

