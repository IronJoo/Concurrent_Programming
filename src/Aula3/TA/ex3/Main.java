package Aula3.TA.ex3;

import static java.lang.Thread.sleep;

public class Main { //valor total na conta da 0 porque?
    public static void main(String[] args) throws InterruptedException {
        ContaBancaria contaBancaria = new ContaBancaria();

        Cliente listaClientes[] = new Cliente[10];
        for (int i = 0; i < 10; i++){
            listaClientes[i] = new Cliente(contaBancaria);
            System.out.println("Cliente " + listaClientes[i].getClienteId() + " criado.");
        }
        for (int i = 0; i < 10; i++){
            listaClientes[i].start();
        }
        System.out.println("Threads de cliente inicializadas");
        System.out.println("Main vais dormir 10 segundos");
        sleep(10000);
        for (int i = 0; i < 10; i++){
            listaClientes[i].interrupt();
        }
        System.out.println("Threads de cliente interrompidas");
        for (int i = 0; i < 10; i++){
            listaClientes[i].join();
        }
        System.out.println("Main fez join com threads de cliente");
        sleep(1000);
        System.out.println("Valor total na conta = " + contaBancaria.getBalance()); //da 0?

        int valorTotalClientes = 0;
        for (int i = 0; i < 10; i++){
            valorTotalClientes += listaClientes[i].getValorTotalDepositado();
        }
        System.out.println("Valor total depositado por todos os clientes = " + valorTotalClientes);

    }
}
