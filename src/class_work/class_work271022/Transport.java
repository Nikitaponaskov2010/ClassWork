package class_work271022;

public class Transport <T> {
    T transport;

    public void setTransport(T transport) {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "transport=" + transport +
                '}';
    }
}
