package Aula6.ex3;

public class Cliente extends Thread {
    private Museu museu;
    private int id = 0;
    private static int lastID = 0;

    public Cliente(Museu museu) {
        this.museu = museu;
        id = lastID++;
    }

    @Override
    public void run() {
        try {
            museu.entrar();
            System.out.println("O cliente " + id + " tentou entrar.");
            museu.sair();
            System.out.println("O cliente " + id + " saiu.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
