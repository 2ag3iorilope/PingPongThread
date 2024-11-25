package PingPongThread;

public class PingPongThread extends Thread {
	private String frase;
	private int veces;

	public PingPongThread(String queDecir, int cuantasVeces) {
		frase = queDecir; // Erakutsiko den esaldia
		veces = cuantasVeces; // Kopurua
	}

	/**
	 * Hariaren portaera definitzen duen metodoa. Inprimatu esaldia zehaztutako aldi
	 * kopurua, eta, ondoren, haria amaitu dela adierazten du.
	 */
	public void run() {
		for (int i = 1; i <= veces; i++)
			System.out.print(frase + " ");
		System.out.println("Ha finalizado la ejecución del hilo: " + getName());
	}
}