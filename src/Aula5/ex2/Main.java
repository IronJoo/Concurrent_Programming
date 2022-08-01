package Aula5.ex2;

public class Main {
    public static void main(String[] args) {
        //produtor cliente
        //recurso partilhado sala de espera
        //consumidor cadeira barbeiro
        System.out.println("Inicio");

        SalaDeEspera salaDeEspera = new SalaDeEspera();

        for (int i = 0; i > 50; i++){
            Cliente cliente = new Cliente(salaDeEspera);
            cliente.start();
        }
        Barbeiro barbeiro = new Barbeiro(salaDeEspera);
        barbeiro.start();
    }
}
