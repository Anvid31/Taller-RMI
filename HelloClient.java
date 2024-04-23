import java.rmi.Naming;

public class HelloClient {
    public static void main(String[] args) {
        try {
            HelloRemoteInterface remoteObject = (HelloRemoteInterface) Naming.lookup("rmi://localhost/HelloRemote");

            remoteObject.sayHello();
        } catch (Exception e) {
            System.out.println("Client exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}