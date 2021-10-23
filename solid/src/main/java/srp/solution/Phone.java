package srp.solution;

public class Phone implements IConnectionManager, IDataManager{

    private IConnectionManager connectionManager;
    private IDataManager dataManager;

    public Phone(IConnectionManager connectionManager, IDataManager dataManager) {
        this.connectionManager = connectionManager;
        this.dataManager = dataManager;
    }

    @Override
    public void dial(String phone) {
        connectionManager.dial("phone");
    }

    @Override
    public void disconnect() {
        connectionManager.disconnect();
    }

    @Override
    public void send(String message) {
        dataManager.send(message);
    }

    @Override
    public int receive() {
        return dataManager.receive();
    }
}
