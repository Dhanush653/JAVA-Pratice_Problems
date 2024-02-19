import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String sym = "*";
        Scanner scanner = new Scanner(System.in);
        int row;
        System.out.println("Enter the number of Rows: ");
        row = scanner.nextInt();
        for(int i =1; i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+ sym + " ");
            }
            System.out.println();
        }
    }
}
