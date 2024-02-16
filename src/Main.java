import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<phone> phoneSort = new ArrayList<>();
        //phone ob =new phone("a",799,4);

        phoneSort.add(new phone ("Samsung",75000,8));
        phoneSort.add(new phone("oppo",90000,16));
        phoneSort.add(new phone("Vivo",80000,8));
        phoneSort.add(new phone("Apple",65000,4));

        List<phone> result = phoneSort.stream()
                .sorted(Comparator.comparing(phone::getPrice))
                .toList();
        result.forEach(n-> System.out.println(n));
    }
}