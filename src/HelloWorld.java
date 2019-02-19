import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int num = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = keyboard.nextInt();
        System.out.println(num);
        //new comment
    }
}
