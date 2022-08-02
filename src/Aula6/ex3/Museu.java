package Aula6.ex3;

public class Museu {
    Porteiro porteiro;

    public Museu(){
        porteiro = new Porteiro();
    }
    public void entrar() throws InterruptedException {
        porteiro.trabalhar();
    }
    public void sair(){
        porteiro.deixarSair();
    }
}
