//package TesteModelo.ex3;
//
//import java.util.HashMap;
//import java.util.concurrent.Semaphore;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Semaphore semaphore = new Semaphore(10);
//        DNA dna = new DNA();
//
//        DNACounter threadList[] = new DNACounter[20];
//        for (int i = 0; i < 20; i++) {
//            threadList[i] = new DNACounter(dna, semaphore);
//        }
//        for (int i = 0; i < 20; i++) {
//            threadList[i].start();
//        }
//    }
//}
//
//    public class DNA {
//        private String strings[];
//        private HashMap<Character, Integer> counter = new HashMap<>();
//
//        public DNA(){
//            setUpMap();
//        }
//
//        private void setUpMap(){
//            counter.put('A', 0);
//            counter.put('T', 0);
//            counter.put('C', 0);
//            counter.put('G', 0);
//        }
//
//        public String getSequenceData(){}
//    }
//
//    public class DNACounter extends Thread {
//        private char c;
//        private Semaphore semaphore;
//        private HashMap<Character, Integer> counter = new HashMap<>();
//        DNA dna;
//
//
//        public DNACounter(DNA dna, Semaphore semaphore){
//            this.dna = dna;
//            this.semaphore = semaphore;
//            setUpMap();
//        }
//        private void setUpMap(){
//            counter.put('A', 0);
//            counter.put('T', 0);
//            counter.put('C', 0);
//            counter.put('G', 0);
//        }
//
//        public void run(){
//            try {
//                semaphore.acquire();
//            } catch (InterruptedException e){
//            }
//            String dnaString = getSequenceData();
//            for (int i = 0; i < dnaString.length(); i++){
//                char c = dnaString.charAt(i);
//                int count;
//                switch (c){
//                    case 'A':
//                        count = counter.get('A');
//                        count++;
//                        counter.put('A', count);
//                    case 'T':
//                        count = counter.get('T');
//                        count++;
//                        counter.put('T', count);
//                    case 'G':
//                        count = counter.get('G');
//                        count++;
//                        counter.put('G', count);
//                    case 'C':
//                        count = counter.get('C');
//                        count++;
//                        counter.put('C', count);
//                    default:
//                        continue;
//                }
//            }
//            dna.passCount(counter);
//        }
//    }