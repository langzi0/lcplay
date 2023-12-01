import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.List;

public class TestAppMain {


    public static void main(String[] args){

        int[] ints = new int[10];
        for(int i: ints){
            i = 1;
        }


        ints[0] += 1;

        Integer[] is = new Integer[10];
        is[0] += 1;

        List<Integer> list = new ArrayList<>();


        Integer counter = 20;
        List<Integer[] > block = new ArrayList<>();
        while(counter < 35){
            Integer[] x = new Integer[2 << counter];
            if (x.length > 1000){
                // System.out.println("total1  " + Runtime.getRuntime().totalMemory());
                System.out.println("free1  " + Runtime.getRuntime().freeMemory());
                // System.out.println("max1  " + Runtime.getRuntime().maxMemory());
                var y = new Integer[250000];
                System.out.println("y=k  " + y.length * 4/1000);
                Runtime.getRuntime().gc();


            }
            Runtime.getRuntime().gc();
            block.add(x);
            System.out.println("x=k  " + x.length * 4/1000 );

            System.out.println("so far, we get " + (x.length * 2) * 4 /1000000 + "m");
            // System.out.println("total " + Runtime.getRuntime().totalMemory());
            System.out.println("free " + Runtime.getRuntime().freeMemory());
            // System.out.println("max " + Runtime.getRuntime().maxMemory());

            counter ++;

        }
    }
}
