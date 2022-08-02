package Aula6.ex4;

public class Main { //acabar em casa
    public static void main(String[] args) {
        PaiNatal paiNatal = new PaiNatal();

        Elfo listaDeElfos[] = new Elfo[50];

        for (int i = 0; i < 50; i++){
            listaDeElfos[i] = new Elfo();
        }
        for (int i = 0; i < 50; i++){
            listaDeElfos[i].start;
        }
    }
}
