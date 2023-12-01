package CodePad.Spring2022;

import Common.Category;
import Common.InvokableBase;
import Common.Priority;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import java.util.ArrayList;

public class AnsonNumberGame1 extends InvokableBase {
    // Add this class to Common/Main.java
    @Override
    public Priority getRunPriority() {
        return new Priority(220911, 0, Category.LeetCode);
    }

    @Override
    public void run() {
        //Call your test in Common/Main.java
        //[2160,1936,3,29,27,5,2503,1593,2,0,16,0,3860,28908,6,2,15,49,6246,1946,23,105,7996,196,0,2,55,457,5,3,924,7268,16,48,4,0,12,116,2628,1468]

        DateTime dateTime = DateTime.now();
        find_29_fourtimes();
        find_5digit_reverse_to_be_fourtimes();
        int [] x = new int[]{1,2,3};
        change(x);

        Duration duration = new Duration(DateTime.now(), dateTime);
        System.out.printf("Your time %s seconds", duration.toString());
        isPalindrome("A man, a plan, a canal: Panama");

    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i= 0 ;
        int j = s.length() -1;
        while (i<j){
            while(!isChar(s.charAt(i)) && i<j) i++;
            while(!isChar(s.charAt(j)) && i<j) j--;
            if (s.charAt(i) == s.charAt(j)){
                i++;j--;
            } else {
                return false;
            }
        }
        return true;

    }

    Boolean isChar(char s){
        return s>= 'a' &&  s<='z';
    }

    private void change(int[] x) {
        x[2] =  x.length;
    }

    //Anson found 725  == 25 * 29 which is 725
    Integer find_29_fourtimes() {
        for(int i = 1; i< 1000000; i++)
            if ( i == get_removeHead(i) * 29){
                System.out.printf("Anson found %d  == %d * 29 which is %d \n", i, get_removeHead(i), get_removeHead(i) * 29);
                return i;
            }
        return -1;
    }

    //Anson found 21978 * 4 = 87912 is 87912
    Integer find_5digit_reverse_to_be_fourtimes() {
        for (int i = 10000; i < 25000; i++)  {
            if (4*i == getReverse(i)){
                System.out.printf("Anson found %d * 4 = %d is %d \n", i, 4*i, getReverse(i));
                return i;
            }
        }
        return -1;

    }

    int get_removeHead(int i){
        ArrayList<Integer> list = new ArrayList<>();
        while( i != 0){
            list.add(i - i/10 *10);
            i = i/10;
        }
        int x = 0;
        for(i = list.size() -2; i>=0; i-- ){
            x = x * 10 + list.get(i);
        }
        return x;

    }

    int getReverse(int i){
        ArrayList<Integer> list = new ArrayList<>();
        while( i != 0){
            list.add(i - i/10 *10);
            i = i/10;
        }
        int x = 0;
        for(i = 0; i< list.size(); i++ ){
            x = x * 10 + list.get(i);
        }
        return x;

    }




}
