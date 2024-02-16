import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("Cherry", "Apple", "Banana", "Watermelon","Pumpkin");

        Comparator<String> com = new Comparator<String>() {
            @Override
            public int compare(String i, String j) {
                if(i.length() > j.length())
                    return -1;
                else
                    return 1;
            }
        };
        str.sort(com);
        for(String n : str){
            System.out.println(n);
        }
    }
}
