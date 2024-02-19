import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the target element: ");
        int target = scanner.nextInt();;
        System.out.println("Enter the number of Elements: ");
        int num = scanner.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the elements one by one: ");
        for(int i=0;i<num;i++){
            int input = scanner.nextInt();
            arr[i] = input;
        }
        boolean found = false;
        for(int i=0; i<num;i++){
            for(int j = 0; j<num;j++){
                if(arr[i] + arr[j] == target){
                    System.out.print("["+i+",");
                    System.out.println(j + "]");
                    found = true;
                }
            }
        }
        if(!found){
            System.out.println("error");
        }
    }
}
