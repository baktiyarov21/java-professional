package srp.solution;

public class IDataManagerImplementation implements IDataManager {

    @Override
    public void send(String message) {
        System.out.println("Message sent successfully");
    }

    @Override
    public int receive() {
        System.out.println("Message received ");
        return 0;
    }
}
