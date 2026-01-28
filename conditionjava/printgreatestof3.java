package conditionjava;
import java.util.Scanner;

public class printgreatestof3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enetr 1st no:");
        int a=sc.nextInt();
        System.out.print("enetr 2nd no:");
        int b=sc.nextInt();
        System.out.print("enetr 3rd no:");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("1st no is greatest:"+a);
        }
        else if(b>a && b>c){
            System.out.println("2nd no is greatest:"+b);
        }
        else{
            System.out.println("3rd no is greatest:"+c);
        }
    }
}
