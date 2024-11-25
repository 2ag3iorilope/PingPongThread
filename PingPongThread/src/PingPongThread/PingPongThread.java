package PingPongThread;

public class PingPongThread implements Runnable {
    private String frase; //Erakutsiko den esaldia
    private int veces;   //Kopurua

    /**
     * Eraikitzailea
     * @param queDecir , erakutsi behar den esaldia
     * @param cuantasVeces , erakutsiko den kopurua
     */
    public PingPongThread(String queDecir, int cuantasVeces) {
        this.frase = queDecir;
        this.veces = cuantasVeces;
    }

    /**
     *Hariaren portaera definitzen duen metodoa. Inprimatu esaldia
     * zehaztutako aldi kopurua, eta, ondoren, haria amaitu dela adierazten du.
     */
    @Override
    public void run() {
        for (int i = 1; i <= veces; i++) {
            System.out.print(frase + " ");
        }
        System.out.println("Ha finalizado la ejecución del hilo: " + Thread.currentThread().getName());
    }
}