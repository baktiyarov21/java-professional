package srp.violation;

public interface IPhone {
    void dial(String phone);
    void disconnect();

    void send(String message);
    int receive();
}
