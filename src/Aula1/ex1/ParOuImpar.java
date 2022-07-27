package Aula1.ex1;

import java.util.Scanner;

public class ParOuImpar extends Thread {
    public void run(){
        System.out.print("Insira um numero: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num % 2 == 0){
            System.out.println("O numero inserido e par.");
        } else {
            System.out.println("O numero inserido e impar.");
        }
    }

    public static void main(String[] args) {
        Thread thread = new ParOuImpar();
        thread.start();
    }
}
