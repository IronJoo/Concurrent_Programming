package Aula5.ex1;

public class Telefonista extends Thread { //produtor
    private Reservatorio reservatorio;


    public Telefonista(Reservatorio reservatorio){
        this.reservatorio = reservatorio;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 15; i++){
            Tarefa tarefa = new Tarefa(i);
            try {
                reservatorio.put(tarefa);
                System.out.println("A telefonista produziu a tarefa " + i);
                sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("A producao de tarefa foi interrompida");
            }
        }
    }
}
