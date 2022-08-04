package Aula3.TA.ex2;

public class Main {
    public static void main(String[] args) { //await dentro do run ta errado??
        Tarefa t1 = new Tarefa();
        Tarefa t2 = new Tarefa();
        Tarefa t3 = new Tarefa();
        Tarefa t4 = new Tarefa();
        Tarefa t5 = new Tarefa();

        Thread tt1 = new Thread(t1);
        Thread tt2 = new Thread(t2);
        Thread tt3 = new Thread(t3);
        Thread tt4 = new Thread(t4);
        Thread tt5 = new Thread(t5);

        tt1.start();
        tt2.start();
        tt3.start();
        tt4.start();
        tt5.start();

    }
}
