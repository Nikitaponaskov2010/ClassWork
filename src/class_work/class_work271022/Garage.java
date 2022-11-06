package class_work.class_work271022;

import java.util.ArrayList;
import java.util.List;

public class Garage <T> {

    List<T> transports;

    public Garage() {
        this.transports = new ArrayList<>();
    }

    public List<T> getTransports() {
        return transports;
    }

    public void setTransports(List<T> transports) {
        this.transports = transports;
    }

    public void setTransports(T transport) {
        transports.add(transport);
    }
}