package Aula2.ex2.deNovo;

public class Empregado extends Thread {
    Restaurante restaurante;

    public Empregado(Restaurante restaurante){
        this.restaurante = restaurante;
    }

    @Override
    public void run() {
        Refeicao refeicao;
        for (int i = 0; i < 10; i++){
            try {
                sleep(500);
                refeicao = restaurante.getRefeicao();
                System.out.println("O empregado levou a refeicao " + refeicao.getRefeicaoId());

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
