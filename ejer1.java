import java.io.IOException;
import java.net.Socket;

public class ejer1 {
	public static void main(String[] args) {
		for (int puerto = 0; puerto < 65535; puerto++) {
			if (puertoOcupado(puerto)) {
				System.out.println("Hay un servidor en el puerto " + puerto);
			}
		}
	}
	
	private static boolean puertoOcupado(int puerto) {
	    try {
	        new Socket("localhost", puerto).close();
	        return true;
	    } catch (IOException e) {
	        return false;
	    }
	}
}

// verificar puertos
// netstat -an | grep 'tcp' | grep 'LISTEN'
