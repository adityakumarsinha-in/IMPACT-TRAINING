import java.util.*;

public class sum_return {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        System.out.println("Before the execution" + num);
    }

    int printSum(int a, int b){
        int sum = a + b;

        return sum;
    }
}

