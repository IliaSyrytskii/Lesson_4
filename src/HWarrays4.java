import java.util.Arrays;

public class HWarrays4 {
    public static void main (String[] args) {
        int[] array1 = new int[]{11, 8, 14, 2, 19};
        System.out.println(Arrays.toString(array1));

        int[] array2 = new int[]{16, 1, 3, 8, 13};
        System.out.println(Arrays.toString(array2));

        int average1, average2;
        int sum1 = 0, sum2 = 0;

        for (int t = 0; t < 5; t++) {
            sum1 += array1[t];
        }
        average1 = sum1/5;

        for (int t = 0; t < 5; t++) {
            sum2 += array2[t];
        }
        average2 = sum2/5;

        if (average1 > average2){
            System.out.println("The average value of array 1 more than array 2");

        } else if (average1 < average2) {
            System.out.println("the average value of array 2 is greater than array 1");

        } else if (average1 == average2) {
            System.out.println("Average values is equal");
        }
    }
}
