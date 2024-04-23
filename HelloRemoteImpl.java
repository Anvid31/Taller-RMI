import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloRemoteImpl extends UnicastRemoteObject implements HelloRemoteInterface {
    public HelloRemoteImpl() throws RemoteException {
        super();
    }

    public void sayHello() throws RemoteException {
        System.out.println("Hello world from the server");
    }
}