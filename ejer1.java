import java.io.IOException;
import java.net.ServerSocket;

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
	        new ServerSocket(puerto).close();
	        return false;
	    } catch (IOException e) {
	        return true;
	    }
	}
}
