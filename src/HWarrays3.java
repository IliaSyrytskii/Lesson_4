import javax.naming.directory.SearchResult;
import java.util.Arrays;
import java.util.Scanner;

public class HWarrays3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, max, min, average;
        System.out.println("Enter yours array length");
        a = sc.nextInt();

        int [] array1 = new int[a];

        for (int t = 0; t < array1.length; t++) {
            array1[t] =(int) ((Math.random()*100) + 1);
        }
        System.out.println(Arrays.toString(array1));

        max = array1[0];

        for (int j: array1) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println(max);


        min = array1[0];
        for (int j: array1) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println(min);

        int sum = 0;
        for (int t = 0; t < array1.length; t++ ) {
            sum += array1[t];
        }
        average = sum/array1.length;
        System.out.println(average);
    }
}
