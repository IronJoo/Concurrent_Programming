package Aula6.ex2;

import java.util.Random;

public class TestaServidor {
    private String url;
    private boolean test;

    public TestaServidor(String url){
        this.url = url;
        test = new Random().nextBoolean();
    }
    public void test(){
        if (test == false)
            System.out.println(url + " falhou.");
    }

    public String getUrl() {
        return url;
    }
}
