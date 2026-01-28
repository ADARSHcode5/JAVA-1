package conditionjava;
import java.sql.SQLOutput;
import java.util.Scanner;

public class divby5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no: ");
        int num = sc.nextInt();
        if(num%5==0){
            System.out.println("It is divisible by 5");

        }
        else{
            System.out.println("It is not divisible by 5");
        }
    }

}
