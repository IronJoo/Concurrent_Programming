package Aula4.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner textFile = new Scanner(new File("texto.txt"));
        List<String> listaPalavras = new LinkedList<>();
        textFile.useDelimiter(" ");
        while(textFile.hasNext()){
            String word = textFile.next();
            listaPalavras.add(word);
        }

        List<String> teste = new ArrayList<>();
        String string1 = "ola";
        String string2 = "eu";
        String string3 = "sou";
        String string4 = "a";
        String string5 = "margarida";

        teste.add(string1);
        teste.add(string2);
        teste.add(string3);
        teste.add(string4);
        teste.add(string5);

        Runnable capitalizador = new Capitalizador(teste);
        Thread t = new Thread(capitalizador);
        t.start();
    }
}
