package conditionjava;


import java.util.Scanner;

public class absolutevalue{
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter number: ");
        int num = sc.nextInt();
        int  absolutevalue;
        if(num<0){
            absolutevalue=num*(-1);
            System.out.println("absolute value is:"+absolutevalue);

        }
        else{
            System.out.println("absolute value is "+num);
        }


    }
}
