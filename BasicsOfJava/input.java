package BasicsOfJava;
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking a string input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Taking an integer input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Taking a double input
        System.out.print("Enter your marks: ");
        double marks = sc.nextDouble();

        // Output the values
        System.out.println("\n--- Output ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);

        sc.close(); // Always close the scanner
    }
}

