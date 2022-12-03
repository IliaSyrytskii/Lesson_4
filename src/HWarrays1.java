
import java.util.Arrays;
import java.util.Scanner;

public class HWarrays1 {

    public static void main (String[] args) {
        int[] array1 = new int[50];
        int b;
        Scanner sc = new Scanner(System.in);

        for (int t = 0; t < array1.length; t++ ) {
            array1[t] =(int) ((Math.random()*50) + 1);
        }
        System.out.println(Arrays.toString(array1));
        System.out.println("What number u wanna search?");

        b = sc.nextInt();
        for (int i = 0; i < array1.length ; i++){
            if (b == array1[i]) {
                System.out.print("Array has " + b + " at index " + i);
            } else {
                System.out.print("");
            }
        }

    }

}
