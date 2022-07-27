package Aula2.ex1;

public class Incrementador extends Thread {
    private Contador contador;

    Incrementador(Contador contador){
        this.contador = contador;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            contador.incrementar();
        }
    }
}
