package TesteModelo.ex2;

public class Main{
    public static void main(String[] args) {
        Balanca balanca = new Balanca(); //recurso partilhado
        Escavadora escavadora = new Escavadora(balanca); //produtor
        Ourives ourives = new Ourives(balanca); //consumidor

        escavadora.start();
        ourives.start();
    }

}