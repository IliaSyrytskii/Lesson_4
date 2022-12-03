import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class HWarrays8 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isSorted = false;
        int buf;
        int [] array = new int[15];
        for (int t = 0; t < array.length; t++) {
            array[t] = (int) ((Math.random()*100)+1);
        }
        System.out.println(Arrays.toString(array));

        while(!isSorted) {
            isSorted = true;
            for (int t = 0; t < array.length-1; t++) {

                if(array[t] > array[t+1]){
                    isSorted = false;

                    buf = array[t];
                    array[t] = array[t+1];
                    array[t+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    }
