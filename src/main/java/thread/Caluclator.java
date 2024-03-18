package thread;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Caluclator implements Runnable{

    @Override
    public void run(){
        long current = 1L;
        long max = 20000L;
        long numPrimes = 0L;
        System.out.printf("Thread '&s': START\n",
                Thread.currentThread().getName());
        while(current <= max){
            if (isPrime(current)){
                numPrimes++;
            }
            current++;
        }
        System.out.printf("thread '%s': End. Number of Primes: %d\n,",
                Thread.currentThread().getName(), numPrimes);
    }

    private boolean isPrime(long number) {
        if (number <= 2){
            return true;
        }
        for (long i =2; i < Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.printf("Minimum Priority: %s\n",
                Thread.MIN_PRIORITY);
        System.out.printf("Minimum Priority: %s\n",
                Thread.NORM_PRIORITY);
        System.out.printf("Minimum Priority: %s\n",
                Thread.MAX_PRIORITY);

        Thread threads[];
        Thread.State status[];
        threads = new Thread[10];
        status = new Thread.State[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(new Caluclator());
            if (i % 2 == 0) {
                threads[i].setPriority(Thread.MAX_PRIORITY);
            } else {
                threads[i].setPriority(Thread.MIN_PRIORITY);
            }
            threads[i].setName("My Thread " + i);
        }
        try (FileWriter file = new FileWriter("C:/Users/abdiy/OneDrive/Desktop/log.txt");
             PrintWriter pw = new PrintWriter(file);) {
            for (int i = 0; i < 10; i++) {
                pw.println("Main : Status of Thread " + i + " : " +
                        threads[i].getState());
                status[i] = threads[i].getState();
            }
            for (int i = 0; i < 10; i++){
                threads[i].start();
            }
            boolean finish = false;
            while (!finish) {
                for (int i = 0; i < 10; i++) {
                    if (threads[i].getState() != status[i]) {
                        writeThreadInfo(pw, threads[i], status[i]);
                        status[i] = threads[i].getState();
                    }
                }
                finish = true;
                for (int i = 0; i < 10; i++) {
                    finish = finish && (threads[i].getState() ==
                            Thread.State.TERMINATED);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void writeThreadInfo(PrintWriter pw,
                                        Thread thread,
                                        Thread.State state) {
        pw.printf("Main : Id %d - %s\n", thread.getId(),
                thread.getName());
        pw.printf("Main : Priority: %d\n", thread.getPriority());
        pw.printf("Main : Old State: %s\n", state);
        pw.printf("Main : New State: %s\n", thread.getState());
        pw.printf("Main : ************************************\n");
    }
}
