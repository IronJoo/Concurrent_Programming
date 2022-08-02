package Testes.cena3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RunTillReturn t1 = new RunTillReturn();
        t1.start();

        System.out.println("Press return to stop the thread!");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        t1.shutdown();
    }
}
