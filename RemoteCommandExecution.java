import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface RemoteCommandExecution extends Remote {
    List<Customer> getCustomerList() throws RemoteException;
}
