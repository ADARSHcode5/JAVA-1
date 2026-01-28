package conditionjava;
import java.util.Scanner;
public class check3digitno {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter no:");
        int num=sc.nextInt();
        if(99<num && num<1000){
            System.out.println("it's a 3 digit number");
        }
        else{
            System.out.println("it's not a 3 digit number");
        }
    }
}
