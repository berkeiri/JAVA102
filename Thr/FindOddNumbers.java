package Thr;

import java.util.ArrayList;

import static Thr.Main.oddNumbers;

class FindOddNumbers extends Thread {
    ArrayList<Integer> part;

    public FindOddNumbers(ArrayList<Integer> part) {
        this.part = part;
    }

    @Override
    public void run() {
        for (int number : part) {
            if (number % 2 != 0) {
                synchronized (oddNumbers) {
                    oddNumbers.add(number);
                }
            }
        }
    }
}