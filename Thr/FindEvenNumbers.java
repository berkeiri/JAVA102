package Thr;
import java.util.ArrayList;

import static Thr.Main.evenNumbers;

class FindEvenNumbers extends Thread {
    ArrayList<Integer> part;

    public FindEvenNumbers(ArrayList<Integer> part) {
        this.part = part;
    }

    @Override
    public void run() {
        for (int number : part) {
            if (number % 2 == 0) {
                synchronized (evenNumbers) {
                    evenNumbers.add(number);
                }
            }
        }
    }
}