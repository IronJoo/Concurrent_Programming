package Aula2.ex2.deNovo;

public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        Chefe chefe = new Chefe(restaurante);
        Empregado empregado = new Empregado(restaurante);

        chefe.start();
        empregado.start();
    }
}
