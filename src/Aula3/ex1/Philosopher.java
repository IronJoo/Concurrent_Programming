package Aula3.ex1;

import java.util.ArrayList;
import java.util.List;

public class Philosopher extends Thread {
    private String name;
    private List<Fork> canReachFork = new ArrayList<>();
    private List<Fork> holdingFork = new ArrayList<>();
    private Mesa mesa;

    Philosopher(String name, List<Fork> canReachFork, List<Fork> holdingFork, Mesa mesa){
        this.name = name;
        this.canReachFork = canReachFork;
        this.holdingFork = holdingFork;
        this.mesa = mesa;
    }

    @Override
    public void run() {
        pensar();
//        mesa.pegarGarfo(canReachFork, holdingFork);
        comer();
        mesa.pousarGarfo(holdingFork);
    }

    public void pensar(){
        System.out.println("O " + name + " está a pensar.");
    }


    public void comer(){
        System.out.println("O " + name + " está a comer.");
    }


}
