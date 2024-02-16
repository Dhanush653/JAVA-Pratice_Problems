import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(233,569,442,760,226,478,197);
        Comparator<Integer> coms = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if(i %100 < j%100){
                    return -1;
                }
                else
                    return 1;
            }
        };
        num.sort(coms);
        for(int n : num){
            System.out.println(n);
        }
    }
}
