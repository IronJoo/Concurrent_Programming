package Aula5.ex2;

public class Cliente extends Thread {
    private static int idUltimo = 0;
    private int id;
    SalaDeEspera salaDeEspera;

    public Cliente(SalaDeEspera salaDeEspera){
        id = idUltimo++;
        this.salaDeEspera = salaDeEspera;
    }

    public int getIdCliente() {
        return id;
    }

    @Override
    public void run() {
        while(true){
            try {
                salaDeEspera.put(this);
                System.out.println("Um cliente entrou na sala de espera");
            } catch (InterruptedException e) {

            }
        }
    }
}
