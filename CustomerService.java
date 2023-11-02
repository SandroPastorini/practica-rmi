import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Arrays;
import java.util.List;

public class CustomerService extends UnicastRemoteObject implements RemoteCommandExecution {

    CustomerService() throws RemoteException {}
    @Override
    public List<Customer> getCustomerList() {
        Customer fulano = new Customer("Fulano", true, "fulano@gmail.com");
        Customer mengano = new Customer("Mengano", true, "mengano@gmail.com");
        return Arrays.asList(fulano, mengano);
    }
}
