package Aula5.ex1;

public class Funcionario extends Thread{
    private int id;
    Reservatorio reservatorio;

    public Funcionario(int id, Reservatorio reservatorio){
        this.id = id;
        this.reservatorio = reservatorio;
    }
    @Override
    public void run() {
        while (true){
            try {
                Tarefa tarefa = reservatorio.get();
                System.out.println("O funcionario " + id + " obteve a tarefa " + tarefa.getId());
                sleep(5000);
            } catch (InterruptedException e) {
            }
        }
    }
}
