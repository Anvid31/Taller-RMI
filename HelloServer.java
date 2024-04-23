import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class HelloServer {
    public static void main(String[] args) {
        try {
            HelloRemoteImpl remoteObject = new HelloRemoteImpl();

            LocateRegistry.createRegistry(1099);

            Naming.rebind("rmi://localhost/HelloRemote", remoteObject);

            System.out.println("Servidor Listo");
            
        } catch (Exception e) {
            System.out.println("Server exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}