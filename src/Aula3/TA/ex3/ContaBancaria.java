package Aula3.TA.ex3;

public class ContaBancaria {
    private int saldo = 0;
    public synchronized void deposit(int amount){
        saldo += amount;
    }
    public int getBalance(){
        return saldo;
    }
}
