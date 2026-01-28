package conditionjava;
import java.util.Scanner;


public class areaORpara {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length:");
        int l =sc.nextInt();
        System.out.print("enter breadth:");
        int b =sc.nextInt();
        int area=l*b;
        int para=2*(l+b);
        if (area > para) {
            System.out.println(area);
            System.out.println(para);
            System.out.println("area is bigger than parameter");
        }
        else if (area < para) {
            System.out.println(area);
            System.out.println(para);
            System.out.println("parameter is bigger than area");
        }
    }

}
