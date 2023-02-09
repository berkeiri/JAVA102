package Thr;

import java.util.ArrayList;

public class Main {
    static ArrayList<Integer> numbers = new ArrayList<>();// birden 10bine kadar sayıları tutan arraylist
    static ArrayList<Integer> evenNumbers = new ArrayList<>();//çift sayılar
    static ArrayList<Integer> oddNumbers = new ArrayList<>();//tek sayılar


    public static void main(String[] args) {
        //10bine kadar olan threadleri numbersa atma işlemi
        for (int i = 1; i <= 10000; i++) {
            numbers.add(i);
        }
        //burada 4 ayrı arraylist oluşturduk
        ArrayList<Integer> part1 = new ArrayList<>(numbers.subList(0, 2500));
        ArrayList<Integer> part2 = new ArrayList<>(numbers.subList(2500, 5000));
        ArrayList<Integer> part3 = new ArrayList<>(numbers.subList(5000, 7500));
        ArrayList<Integer> part4 = new ArrayList<>(numbers.subList(7500, 10000));
        //burada tek sayıları thread nesnelerine atadık
        FindEvenNumbers evenNumbersThread1 = new FindEvenNumbers(part1);
        FindEvenNumbers evenNumbersThread2 = new FindEvenNumbers(part2);
        FindOddNumbers oddNumbersThread1 = new FindOddNumbers(part3);
        FindOddNumbers oddNumbersThread2 = new FindOddNumbers(part4);
        //thread nesnesini çalıştırdık.
        evenNumbersThread1.start();
        evenNumbersThread2.start();
        oddNumbersThread1.start();
        oddNumbersThread2.start();
        //işlemin bitmesini bekliyoruz
        try {
            evenNumbersThread1.join();
            evenNumbersThread2.join();
            oddNumbersThread1.join();
            oddNumbersThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //en son 2 listede tek ve çift sayıları bastırdık.
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
}