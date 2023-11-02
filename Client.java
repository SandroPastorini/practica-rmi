import java.rmi.Naming;
import java.rmi.RemoteException;

public class Client {

    Object getRemoteCommand(String url_rmi) {
        Object command = null;
        try {
            command = Naming.lookup(url_rmi);
            System.out.println("[Client] Command fetch succeeded");
        } catch (RemoteException e) {
            System.out.printf("[Client] ERROR - Failed remote command execution: %s%n", e);
        } catch(Exception e) {
            System.out.printf("[Client] ERROR: %s%n", e);
        }

        return command;
    }
}
