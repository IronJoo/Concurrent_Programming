package Aula3.ex1;

public class Fork {
    String name;

    public Fork(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fork{" +
                "name='" + name + '\'' +
                '}';
    }
}
