package Aula5.ex3;

public class Main {
    public static void main(String[] args) {
        //produtor cozinheiro
        //consumidor glutao
        //recurso partilhado mesa
        Mesa mesa = new Mesa();

        for (int i = 0; i < 35; i++) {
            Cozinheiro cozinheiro = new Cozinheiro(mesa);
            cozinheiro.start();
        }

        for (int i = 0; i < 45; i++){
            Glutao glutao = new Glutao(mesa);
            glutao.start();
        }
    }
}
