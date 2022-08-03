package Aula2.TA.ex4;

public class Main {
    public static void main(String[] args) { //errado, carrinhas nao apanham encomenda certa
        Armazem armazem = new Armazem();

        Carrinha listaDeCarrinhas[] = new Carrinha[50];
        Encomenda listaDeEncomendas[] = new Encomenda[50];
        for (int i = 0; i < 50; i++){
            listaDeCarrinhas[i] = new Carrinha(armazem);
        }
        for (int i = 0; i < 50; i++){
            listaDeCarrinhas[i].start();
        }
    }
}
