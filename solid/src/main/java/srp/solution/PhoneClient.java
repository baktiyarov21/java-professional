package srp.solution;

public class PhoneClient {
    public static void main(String[] args) {
        Phone phone = new Phone(new IConnectionManagerImplementation(), new IDataManagerImplementation());
        phone.dial("1515");
        phone.send("fsdf");
        phone.receive();
        phone.disconnect();
    }
}
