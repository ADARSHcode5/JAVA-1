package conditionjava;


import java.util.Scanner;

public class checkiftriangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter side(a): ");
        int a=sc.nextInt();
        System.out.print("enter side(b): ");
        int b=sc.nextInt();
        System.out.print("enter side(c): ");
        int c=sc.nextInt();
        if((a+b)>c && (a+c)>b && (b+c)>a){
            System.out.println(" this makes a triangle");
        }
        else{
            System.out.println("this cannot make a triangle");
        }
    }
}
