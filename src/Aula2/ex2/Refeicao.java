package Aula2.ex2;

public class Refeicao { //recurso partilhado

    public String name;
    private boolean available = false;

    public Refeicao(){
    }

    public synchronized void put(String name){
        this.name = name;
    }

    public synchronized String get(){
        return name;
    }

    public String getName() {
        return name;
    }
}
