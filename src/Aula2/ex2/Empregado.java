package Aula2.ex2;

public class Empregado extends Thread { //Consumer
    private Refeicao refeicao;

    Empregado(Refeicao refeicao){
        this.refeicao = refeicao;

    }

    @Override
    public void run() {
        refeicao.get();
    }
}
