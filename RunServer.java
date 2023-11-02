public class RunServer {
    public static void main(String[] args) {
        System.setProperty("java.rmi.server.hostname","127.0.0.1");
        Server server = new Server();
        server.init();
    }
}