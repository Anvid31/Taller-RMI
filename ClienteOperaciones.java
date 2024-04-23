import java.rmi.Naming;
import java.util.Scanner;

public class ClienteOperaciones {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            OperacionesRemotasInterface obj = (OperacionesRemotasInterface) Naming.lookup("rmi://localhost/Operaciones");

            System.out.print("Ingrese el primer número: ");
            double a = scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double b = scanner.nextDouble();

            System.out.println("Suma: " + obj.sumar(a, b));
            System.out.println("Resta: " + obj.restar(a, b));
            System.out.println("Multiplicación: " + obj.multiplicar(a, b));
            System.out.println("División: " + obj.dividir(a, b));

            scanner.close();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        
    }
}