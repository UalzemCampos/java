
public class DandoUmTempoThread {

	public static void main(String[] args) throws InterruptedException {
		
	for (int num = 0; num < 10; num++) {
		Thread.sleep(2000); //  DA UM INTERVALO DE 2000 MILISEGUNDOS = 2 SEGUNDOS
		
		System.out.println("ESSA LINHA SERÁ EXECUTADA A CADA 2 SEGUNDOS");
	}

	}

}
