package Testes.cena1;

public class Tarefa extends Thread {
    int numero;

    public Tarefa(int numero){
        this.numero=numero;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println("Tarefa " + numero + " = " + i);
            if (numero == 3){
                throw new RuntimeException();
            }
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Tarefa " + numero + "interrompida.");
            }
        }
    }
}
