package TesteModelo.ex2;

public class Ourives extends Thread{
    Balanca balanca;

    public Ourives(Balanca balanca){
        this.balanca = balanca;
    }

    public void run(){
        while(true){
            try {
                double ouro = balanca.take();
                System.out.println("O ourives tirou " + ouro + " da balanca");
                Thread.sleep(3000);
                System.out.println("O ourives transformou o ouro em lingote");
            } catch (InterruptedException e) {
            }
        }
    }
}