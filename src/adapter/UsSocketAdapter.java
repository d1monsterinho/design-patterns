package adapter;

public class UsSocketAdapter extends EuPlug {
    private final UsSocket usSocket;

    public UsSocketAdapter(UsSocket usSocket) {
        this.usSocket = usSocket;
    }

    @Override
    public void plug() {
        System.out.println("Adapting US-type socket for EU-type plug interface...");
        usSocket.connect();
    }
}
