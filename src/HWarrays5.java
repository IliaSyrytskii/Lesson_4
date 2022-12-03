import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HWarrays5 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int t, j;
        int number = 0;

        System.out.println("Enter yours array length.");
        int[] array1 = new int[sc.nextInt()];

        if ((array1.length > 5) & (array1.length <= 10)) {
            for (t = 0; t < array1.length; t++) {
                array1[t] = random.nextInt(50);
            }
            System.out.println(Arrays.toString(array1));

            for (int result: array1){
                if (result % 2 == 1) {
                    number++;
                }

                int[] array2 = new int[array1.length - number];

                for (t = 0, j = 0; t < array1.length; t++) {
                    if (array1[t] % 2 == 0) {
                        array2[j] = array1[t];
                        j++;
                    }
                }
                System.out.println(Arrays.toString(array2));
            }
        } else {
            System.out.println("Choose another array length.");
        }

    }
}
