package Aula5.ex2;

public class Barbeiro extends Thread {
    SalaDeEspera salaDeEspera;

    public Barbeiro(SalaDeEspera salaDeEspera){
        this.salaDeEspera = salaDeEspera;
    }
    @Override
    public void run() {
        while (true){
            try {
                salaDeEspera.get();
                System.out.println("O barbeiro aceitou um cliente");
            } catch (InterruptedException e) {
            }
        }
    }
}
