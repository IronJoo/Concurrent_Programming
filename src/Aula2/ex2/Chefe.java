package Aula2.ex2;

public class Chefe extends Thread { //Producer
    private Refeicao refeicao;

    public Chefe(Refeicao refeicao){
        this.refeicao = refeicao;

    }

    @Override
    public void run() {
        refeicao.put(refeicao.getName());
    }
}
