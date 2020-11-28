
public class Club {
	
	private Socio socios;
	
	public Club() {
		socios = new Socio();
		
		
	}
	
	public void inscripcion() {
		socios.datos();
		
	}
	public void mayorAntiguedad() {
		socios.imprimirMayor();
	}
	
	public static void main(String[] ar) {
		Club test = new Club();
		test.inscripcion();
		test.mayorAntiguedad();
		
	}

}
