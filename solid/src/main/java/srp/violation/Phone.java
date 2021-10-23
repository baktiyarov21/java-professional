package srp.violation;

public class Phone implements IPhone{

    @Override
    public void dial(String phone) {
        System.out.println("connected established");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnected");
    }

    @Override
    public void send(String message) {
        System.out.println("data sent successful");
    }

    @Override
    public int  receive() {
        System.out.println("data received successfully");
        return 0;
    }
}
