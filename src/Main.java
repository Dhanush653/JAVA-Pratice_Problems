import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(21,45,76,34,98,67,43);

        int result = num.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(0);
        System.out.println("The second smallest Element is: "+ result);

        List<Integer> num1 = Arrays.asList(21,45,76,34,98,67,43);

        int result1 = num1.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().orElse(0);
        System.out.println("The Second Largest Element is: " + result1);
    }
}