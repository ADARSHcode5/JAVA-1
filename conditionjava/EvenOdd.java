package conditionjava;
import java.util.Scanner;

public class EvenOdd {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER POSITIVE NUMBER: ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("even:"+num);
        }
        else{
            System.out.println("odd:"+num);
        }
    }

}
