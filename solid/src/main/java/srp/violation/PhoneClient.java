package srp.violation;

public class PhoneClient {
    public static void main(String[] args) {
        IPhone phone = new Phone();
        phone.dial("05551212");
        phone.send("Hello");
        phone.disconnect();
    }
}
