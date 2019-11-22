package adapter_pattern;

public class Main {
    public static void main(String[] args) {
        AmericanSocket socket = new SimpleAmericanSocket();
        EuroSocket euroSocket = new SocketAdapter(socket);
        Radio radio = new Radio();
        radio.listenToMusic(euroSocket);
    }
}

interface EuroSocket{
    void getPower();
}

class SocketAdapter implements EuroSocket{
    AmericanSocket americanSocket;

    public SocketAdapter(AmericanSocket americanSocket) {
        this.americanSocket = americanSocket;
    }

    @Override
    public void getPower() {
        americanSocket.getPower();
    }
}

interface AmericanSocket{
    void getPower();
}

class SimpleAmericanSocket implements AmericanSocket{
    @Override
    public void getPower() {
        System.out.println("get 110V");
    }
}

class Radio{
    public void listenToMusic(EuroSocket euroSocket){
        euroSocket.getPower();
    }
}
