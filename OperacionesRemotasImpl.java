import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class OperacionesRemotasImpl extends UnicastRemoteObject implements OperacionesRemotasInterface {
    public OperacionesRemotasImpl() throws RemoteException {
        super();
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        return a / b;
    }
}