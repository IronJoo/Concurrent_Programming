package Aula3.ex1;

public class Main {
    public static void main(String[] args) {
        Mesa mesa = new Mesa();

        Fork fork0 = new Fork("fork0");
        Fork fork1 = new Fork("fork1");
        Fork fork2 = new Fork("fork2");
        Fork fork3 = new Fork("fork3");
        Fork fork4 = new Fork("fork4");

        Philosopher philosopher0 = new Philosopher("philosopher0", new Fork[]{fork0, fork1}, mesa);
        Philosopher philosopher1 = new Philosopher("philosopher1", new Fork[]{fork1, fork2}, mesa);
        Philosopher philosopher2 = new Philosopher("philosopher2", new Fork[]{fork2, fork3}, mesa);
        Philosopher philosopher3 = new Philosopher("philosopher3", new Fork[]{fork3, fork4}, mesa);
        Philosopher philosopher4 = new Philosopher("philosopher4", new Fork[]{fork4, fork0}, mesa);

        philosopher0.start();
        philosopher1.start();
        philosopher2.start();
        philosopher3.start();
        philosopher4.start();
    }
}
