package Aula1.ex5;

public class Main {
    public static void main(String[] args) { //fazer so uma thread que recebe parametro booleano que indica se é par ou impar
        Thread par = new Par();
        Thread impar = new Impar();
        par.start();
        impar.start();
    }
}
