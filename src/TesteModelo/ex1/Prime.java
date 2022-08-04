package TesteModelo.ex1;

import java.util.ArrayList;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Prime extends Thread{
    private int firstNumber;
    private int lastNumber;
    private CyclicBarrier barrier;
    private ArrayList<Integer> primeList = new ArrayList<>();

    Prime(int firstNumber, int lastNumber, CyclicBarrier barrier){
        this.firstNumber = firstNumber;
        this.lastNumber = lastNumber;
        this.barrier = barrier;
    }

    public void run(){
        for (int i = firstNumber; i <= lastNumber; i++){
            if (isPrime(i)){
                System.out.println(i + " is prime");
                primeList.add(i);
            }
        }
        try {
            barrier.await();
        } catch (InterruptedException e) {

        } catch (BrokenBarrierException e) {

        }
        System.out.println(primeList);
    }

    private boolean isPrime(int num){
        if (num == 2)
            return true;
        if (num % 2 == 0)
            return false;
        for (int i = 3; i * i <= num; i+= 2){
            if (num % i == 0)
                return false;
        }
        return true;
    }
}