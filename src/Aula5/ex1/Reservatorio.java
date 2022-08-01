package Aula5.ex1;

import java.util.LinkedList;

public class Reservatorio { //recurso partilhado
    LinkedList<Tarefa> listaDeTarefas = new LinkedList<>();

    public synchronized void put(Tarefa tarefa) throws InterruptedException {
        while (listaDeTarefas.size() >= 5){
            wait();
            System.out.println("A telefonista esta em espera.");
        }
            listaDeTarefas.add(tarefa);
            notifyAll();
    }
    public synchronized Tarefa get() throws InterruptedException {
        while (listaDeTarefas.size() == 0){
            wait();
            System.out.println("Um funcionario esta em espera");
        }
        Tarefa copyOfTarefa = listaDeTarefas.removeFirst();
        notifyAll();
        return copyOfTarefa;
    }

}
