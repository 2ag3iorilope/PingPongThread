package PingPongThread;

public class GestionaPingPongThread {
	public static void main(String[] args) {

		PingPongThread r1 = new PingPongThread("PING", 33); // Ping Esaldia 33 aldiz
		PingPongThread r2 = new PingPongThread("PONG", 10); // Pong Esaldia 10 aldiz

		r1.start();
		r2.start();
	}
}
//Programa honek bi hari sortzen ditu, eta hainbat esaldi inprimatzen dituzte ("PING" eta "PONG"), hainbat aldiz. 
//Bi hariak modu konkurrentean exekutatzen dira, eta mezu bat erakusten dute amaitzen dutenean.