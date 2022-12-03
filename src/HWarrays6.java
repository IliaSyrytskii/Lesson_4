import java.util.Arrays;

public class HWarrays6 {
    public static void main(String[] args) {
        int t;
        int[] array1 = new int[10];

        for (t = 0; t < array1.length; t++) {
            array1[t] = (int) ((Math.random() * 25) + 1);
        }
        System.out.println(Arrays.toString(array1));
        for (t = 0; t < array1.length; t++) {
            if (t % 2 == 1) {
                array1[t] = 0;
            }
                System.out.println(Arrays.toString(array1));
            }
        }
    }
