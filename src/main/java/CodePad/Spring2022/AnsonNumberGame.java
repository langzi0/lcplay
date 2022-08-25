package CodePad.Spring2022;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.DateTime;
import org.joda.time.Duration;

public class AnsonNumberGame extends InvokableBase {
    // Add this class to Common/Main.java
    @Override
    public Priority getRunPriority() {
        return new Priority(220604, 0, Category.LeetCode);
    }

    @Override
    public void run() {
        //Call your test in Common/Main.java
        //[2160,1936,3,29,27,5,2503,1593,2,0,16,0,3860,28908,6,2,15,49,6246,1946,23,105,7996,196,0,2,55,457,5,3,924,7268,16,48,4,0,12,116,2628,1468]

        DateTime dateTime = DateTime.now();

        pintAllNumberParis(1000); // expected only 5? 0 0, 2 2   , 0 2 , 0 2;  0 2  0 2 why its five?
        Duration duration = new Duration(DateTime.now(), dateTime);
        System.out.printf("Your time %s seconds", duration.toString());


    }

    void pintAllNumberParis(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (i * i + j * j == k * k && !isThreeInterPrime(i, j, k)) {
                        count = count + 1;
                        System.out.printf("Anson found %dth solution! i=%d, j=%d, k=%d  %d + %d = %d \n", count, i, j, k, i * i,
                            j * j, k * k);
                    }
                }
            }
        }
        System.out.printf("Anson found %d solutions for up to %d count!\n", count, n);
    }


    boolean isThreeInterPrime(int i, int j, int k) {
        int min = i;
        if (j < min) {
            min = j;
        }
        if (k < min) {
            min = k;
        }
        for (int counter = 2; counter <= min; counter++) {
            if (i % counter == 0 && j % counter == 0 && k % counter == 0) {
                return true;
            }
        }
        return false;

    }

    public void printAllNumberPairs1(int size) {
        for (int i = 1; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                for (int k = j + 1; k < size; k++) {
                    if (i * i + j * j == k * k && isThreeInterPrime(i, j, k)) {
                        System.out.printf("(i=%d, j=%d, k=%d)\n", i, j, k);
                    }
                }
            }
        }
    }

}
