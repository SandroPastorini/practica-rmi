import java.util.List;

public class RunClient {
    public static void main(String[] arg) {
        RemoteCommandExecution command;

        Client cl = new Client();

        String remoteServer = "127.0.0.1:3000";
        String remoteObject = "CommandA";

        command = (RemoteCommandExecution) cl.getRemoteCommand("rmi://" + remoteServer + "/" + remoteObject);

        try {
            List<Customer> customers = command.getCustomerList();
            System.out.printf("Listado de Clientes:\n");
            for(Customer customer : customers) {
                System.out.printf("Cliente: %s; Activo: %b; E-Mail: %s\n", customer.getName(), customer.getIsActive(), customer.getEmail());
            }
        } catch(Exception e) {
            System.out.printf("[Client] ERROR: %s%n", e);
        }
    }
}
