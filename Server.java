import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    Server() {
    }

    public void init() {
        try {
            Registry registry = LocateRegistry.createRegistry(3000);
            CustomerService command = new CustomerService();
            registry.rebind("CommandA", command);
            System.out.println("[Server]: CommandA initialized.");
        } catch(Exception e) {
            System.out.printf("[Server] ERROR: %s%n", e);
        }
    }
}
