package Aula2.TA.ex3;

public class ContaDigitos extends Thread {

    String sentence;
    int[] counter = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    ContaDigitos(String frase){
        this.sentence = frase;
    }

    @Override
    public void run() {
        for (int i = 0; i < sentence.length(); i++){
            if (sentence.charAt(i) != ' ') {
                counter[sentence.charAt(i) - 48]++;
            }
        }
        int highestCount = 0;
        int mostFrequentDigit = 0;
        for (int i = 0; i < counter.length; i++){
            if (counter[i] > highestCount){
                highestCount = counter[i];
                mostFrequentDigit = i;
            }
        }
        System.out.println("The most frequent digit is " + mostFrequentDigit);
    }

    public static void main(String[] args) {
        String frase1 = "11111112116171";
        String frase2 = "35633384373393333";
        String frase3 = "5958575456515253";

        Thread thread1 = new ContaDigitos(frase1);
        Thread thread2 = new ContaDigitos(frase2);
        Thread thread3 = new ContaDigitos(frase3);

        thread1.start();
        thread2.start();
        thread3.start();


    }
}
