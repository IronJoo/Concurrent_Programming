package Aula2.ex2.deNovo;

public class Chefe extends Thread {
    Restaurante restaurante;
    Refeicao refeicao;

    public Chefe(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            try {
                System.out.println("O chefe esta a preparar uma refeicao");
                sleep(1000);
                refeicao = restaurante.putRefeicao();
                System.out.println("O chefe preparou a refeicao " + refeicao.getRefeicaoId());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
