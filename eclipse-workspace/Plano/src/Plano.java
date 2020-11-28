import java.util.Scanner;

public class Plano {
	private Scanner teclado;
	int x,y;
	
	public void inicializador() {
		teclado = new Scanner(System.in);
		System.out.print("Ingrese coordenada X: ");
		x = teclado.nextInt();
		System.out.print("Ingrese coordenada Y: ");
		y = teclado.nextInt();
		
	}
	void imprimirCuadrante() {
		if(x > 0 && y > 0) {
			System.out.print("Se encuentra en el primer cuadrante.");
		}else  {
			System.out.print("Se encuentra en el segundo cuadrante.");
		}
	}
	public static void main(String[] ar) {
		Plano punto1 = new Plano();
		punto1.inicializador();
		punto1.imprimirCuadrante();
	}
	
	
	
}
