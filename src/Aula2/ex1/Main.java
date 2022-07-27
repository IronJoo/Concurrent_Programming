package Aula2.ex1;

public class Main {
    public static void main(String[] args) throws InterruptedException { //resolucao no pdf nao esta 100% correta

        Contador contador = new Contador();

        for (int i = 0; i < 1000; i++){
            Thread incrementador1 = new Incrementador(contador);
            incrementador1.start();
            incrementador1.join(500);
            System.out.println("T" + i + " = " + contador.consulta());
        }
        System.out.println(contador.consulta());
    }
}
