package conditionjava;
import java.util.Scanner;
public class CpSp {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter cp: ");
        int cp = sc.nextInt();
        System.out.print("enter sp: ");
        int sp = sc.nextInt();
        int diff;
        if(sp>cp){
            diff=sp-cp;
            System.out.println("profit by:"+diff);
        }
        else if(cp>sp){
            diff=cp-sp;
            System.out.println("loss by:"+diff);
        }

    }

}
