package Aula2.ex1;

public class Contador {
    int valor = 0;

    public synchronized void incrementar(){
        valor++;
    }

    public synchronized void decrementar(){
        valor--;
    }
    synchronized int consulta(){
        return valor;
    }
}
