package conditionjava;
import java.util.Scanner;

public class divisibleby5and3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 5 == 0 && num % 3 == 0) {
            System.out.println("It is divisible by both 5 and 3");
        } else if (num % 5 == 0) {
            System.out.println("Only divisible by 5");
        } else if (num % 3 == 0) {
            System.out.println("Only divisible by 3");
        } else {
            System.out.println("Divisible by none");
        }
    }
}