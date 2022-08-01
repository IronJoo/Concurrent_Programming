package Aula5.ex2;

import java.util.LinkedList;

public class SalaDeEspera { //recurso partilhado

    private LinkedList<Cliente> cadeiras = new LinkedList<Cliente>();

    public synchronized void put(Cliente cliente) throws InterruptedException {
        while(cadeiras.size() == 3){
            wait();
            System.out.println("A sala de espera esta cheia");
        }
        cadeiras.add(cliente);
        notifyAll();
    }

    public synchronized Cliente get() throws InterruptedException {
        while(cadeiras.size() == 0){
            wait(3000);
            System.out.println("A sala de espera esta vazia");
        }
        Cliente copyOfCliente = cadeiras.removeFirst();
        notifyAll();
        return copyOfCliente;
    }
}
