package Aula2.TA.ex4;

import java.util.LinkedList;

import static java.lang.Thread.sleep;

public class Armazem { //recurso partilhado
    LinkedList<Encomenda> listaDeEncomendas = new LinkedList();
    public Armazem(){
        for (int i = 0; i < 50; i++){
            listaDeEncomendas.add(new Encomenda());
        }
    }

    public synchronized LinkedList carregar() throws InterruptedException {
        while(listaDeEncomendas.size() == 0){
            System.out.println("Uma carrinha esta em espera");
            wait();
        }
        LinkedList<Encomenda> tempList = new LinkedList();
        for (int i = 0; i < 5; i++){
            sleep(1000);
            tempList.add(listaDeEncomendas.removeFirst());
        }
        return tempList;
    }
}
