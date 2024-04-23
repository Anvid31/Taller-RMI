import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServidorOperaciones {
    public static void main(String[] args) {
        try {
            OperacionesRemotasImpl obj = new OperacionesRemotasImpl();
            LocateRegistry.createRegistry(1098);
            Naming.rebind("rmi://localhost/Operaciones", obj);
            System.out.println("Servidor de operaciones matemáticas listo!");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}