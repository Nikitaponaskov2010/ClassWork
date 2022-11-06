package class_work.class_work271022;

public class Bas <T> {
    private T name;

    Bas(T name){
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bas{" +
                "name=" + name +
                '}';
    }
}
