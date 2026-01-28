package conditionjava;
import java.util.Scanner;

public class findtheyoungest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter age of a: ");
        int a=sc.nextInt();
        System.out.print("enter age of b: ");
        int b=sc.nextInt();
        System.out.print("enter age of c: ");
        int c=sc.nextInt();
        if(a<b && a<c){
            System.out.println("a is youngest: "+a);
        }
        else if(b<a && b<c){
            System.out.println("b is youngest: "+b);
        }
        else{
            System.out.println("c is youngest: "+c);
        }
    }
}
