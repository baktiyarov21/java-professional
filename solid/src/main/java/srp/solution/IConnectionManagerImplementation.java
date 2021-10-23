package srp.solution;

public class IConnectionManagerImplementation implements IConnectionManager{
    @Override
    public void dial(String phone) {
        System.out.println("connection successful");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnected");
    }
}
