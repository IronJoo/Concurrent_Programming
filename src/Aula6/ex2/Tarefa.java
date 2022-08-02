package Aula6.ex2;

import static java.lang.Thread.sleep;

public class Tarefa implements Runnable{
    TestaServidor servidor;

    public Tarefa(TestaServidor servidor){
        this.servidor = servidor;
    }


    @Override
    public void run() {
        System.out.println("A testar o servidor " + servidor.getUrl());
        for (int i = 0; i < 5; i++){
            try {
                servidor.test();
                sleep(2000);
            } catch (InterruptedException e) {
            }
        }
    }
}
