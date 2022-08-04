package TesteModelo.ex2;

public class Balanca{
    double peso = 0;
    public Balanca(){}

    public synchronized void put(double pedaco) throws InterruptedException{
        while (peso >=12.5)
            wait();
        peso += pedaco;
        notifyAll();
    }

    public synchronized double take() throws InterruptedException{
        while (peso < 12.5)
            wait();
        double copyOfPeso = peso;
        peso -= 12.5;
        notifyAll();
        return copyOfPeso;
    }

}