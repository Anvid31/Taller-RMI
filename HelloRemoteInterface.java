import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloRemoteInterface extends Remote {
    void sayHello() throws RemoteException;
}