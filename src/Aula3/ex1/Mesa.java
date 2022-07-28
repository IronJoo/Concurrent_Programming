package Aula3.ex1;

import java.util.List;

public class Mesa {

    public synchronized pegarGarfo(List<Fork> canReachFork, List<Fork> holdingFork) throws InterruptedException {
        while (holdingFork.get(0).is || holdingFork[1] == null)
            wait();
    }
    public void pousarGarfo(List<Fork> holdingFork){

    }
}
