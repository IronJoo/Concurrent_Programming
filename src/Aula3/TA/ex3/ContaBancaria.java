package Aula3.TA.ex3;

public class ContaBancaria {
    private int valorTotal = 0;
    public synchronized void deposit(int amount){
        valorTotal += amount;
    }
    public int getBalance(){
        return valorTotal;
    }
}
