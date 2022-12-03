import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HWarrays2 {
    public static int[] removeElement(int[] arr, int item) {
        return Arrays.stream(arr)
                .filter(i -> i != item)
                .toArray();
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int item;

        System.out.println("Enter yours array length");
        int[] array2 = new int[sc.nextInt()];

        for (int t = 0; t < array2.length; t++){
            array2[t] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array2));

        System.out.println("What number u wanna remove from array?");
        item = sc.nextInt();

        array2 = removeElement(array2, item);
        System.out.println(Arrays.toString(array2));

    }
}
