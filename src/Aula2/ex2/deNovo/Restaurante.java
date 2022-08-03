package Aula2.ex2.deNovo;

public class Restaurante {
    Refeicao refeicao;

    public synchronized Refeicao putRefeicao() throws InterruptedException {
        while(refeicao!=null){
            wait();
        }
        refeicao = new Refeicao();
        notifyAll();
        return refeicao;
    }
    public synchronized Refeicao getRefeicao() throws InterruptedException {
        while(refeicao == null){
            wait();
        }
        Refeicao copyOfRefeicao = refeicao;
        refeicao = null;
        notifyAll();
        return copyOfRefeicao;
    }
}
