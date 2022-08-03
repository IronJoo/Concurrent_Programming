package Aula2.TA.ex4;

public class Encomenda {
    private int id;
    private static int lastId = 0;

    public Encomenda(){
        id = lastId++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Encomenda{" +
                "id=" + id +
                '}';
    }
}
