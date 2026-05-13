
import java.util.Scanner;

class oddSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ODD SUM: ");
        System.out.print("Enter your Number: ");
        int num = sc.nextInt();
        int sum = oddSum(num);
        System.out.println("OddSum till " + num + "is: " + sum);
    }

    public static int oddSum(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum += i;
            i += 2;
        }
        return sum;
    }
}
