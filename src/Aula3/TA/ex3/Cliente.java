package Aula3.TA.ex3;

import java.util.Random;

public class Cliente extends Thread {
    private int id;
    private static int lastId = 0;
    ContaBancaria contaBancaria;
    private int valorTotalDepositado = 0;

    public Cliente(ContaBancaria conta){
        id = lastId++;
        contaBancaria = conta;
    }

    @Override
    public void run() {
        try{
            while(true){
                Random random = new Random();
                int valor = random.nextInt(101);
                contaBancaria.deposit(valor);
                valorTotalDepositado += valor;
                System.out.println("O cliente " + id + " depositou " + valor);
                sleep(1000);
            }
        } catch (InterruptedException e) {
        }
    }

    public int getValorTotalDepositado() {
        return valorTotalDepositado;
    }

    public int getClienteId() {
        return id;
    }
}
