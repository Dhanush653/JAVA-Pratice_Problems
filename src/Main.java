import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = scanner.nextInt();
        int temp = num;
        int temp1 = num;
        int count = 0;
        int sum = 0;
        int power;
        while(temp > 0){
            temp = temp / 10;
            count = count + 1;
        }
        for(int i = 0; i< count;i++){
            int val = num % 10;
            num = num / 10;
            power = (int) Math.pow(val, count);
            sum = sum + power;
        }
        if(temp1 == sum){
            System.out.println("The given number is Armstrong Number");
        }
        else
            System.out.println("The Armstrong Number is not Amstrong Number");
    }
}
