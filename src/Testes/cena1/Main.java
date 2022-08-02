package Testes.cena1;

public class Main {
    public static void main(String[] args) {

        int index = 4;
        int randomNumber = 5;

        Tarefa tarefas[] = new Tarefa[index];
        for (int i = 0; i < index; i++){
            tarefas[i] = new Tarefa(i);
        }

        for (int i = 0; i < index; i++){
            tarefas[i].start();
        }
        //throw new RuntimeException();
    }
}
