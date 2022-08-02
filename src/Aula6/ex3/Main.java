package Aula6.ex3;

public class Main { //corrigir em casa
    public static void main(String[] args) {
        Museu museu = new Museu();

        for (int i = 0; i < 100; i++){
            Cliente cliente = new Cliente(museu);
            cliente.start();
        }
    }
}
