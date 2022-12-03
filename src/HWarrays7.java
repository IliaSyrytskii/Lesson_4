import java.util.Arrays;
import java.util.Comparator;

public class HWarrays7 {
    public static void main (String[] args) {
        String[] array1 = new String[]{"Andrey", "Yuri", "Dima", "Vasya", "Zhenya", "Irina", "Katya", "Filipp"};

        Arrays.sort(array1, Comparator.naturalOrder());
        System.out.println(Arrays.toString(array1));
    }
}
