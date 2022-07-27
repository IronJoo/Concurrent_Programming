package Aula1.ex3;

import java.util.Scanner;

public class ParOuImparQuatro extends Thread {
    public void run(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++){
            System.out.print("Insira um numero: ");
            int num = scanner.nextInt();
            if (num % 2 == 0){
                System.out.println("O numero inserido e par.");
            } else {
                System.out.println("O numero inserido e impar.");
            }
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread parOuImparQuatro = new ParOuImparQuatro();
        parOuImparQuatro.start();
    }
}
