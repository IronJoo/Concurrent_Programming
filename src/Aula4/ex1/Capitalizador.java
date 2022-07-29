package Aula4.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Capitalizador implements Runnable{
    private List<String> palavras = new ArrayList<>();

    public Capitalizador(List<String> palavras) {
        this.palavras = palavras;
    }

    @Override
    public void run() {
        for (int i = 0; i < palavras.size(); i++){
            String newWord = palavras.get(i).substring(0,1).toUpperCase() + palavras.get(i).substring(1);
            System.out.print(newWord + ' ');
        }
    }
}
