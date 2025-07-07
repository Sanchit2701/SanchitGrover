import java.util.Scanner;

public class Varaible {
    public static void main(String[] args) {

        System.out.print("enter first number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //char a = sc.next().charAt(0);

        System.out.print("enter Second number : ");
        int b = sc.nextInt();

        System.out.println(a+"+"+b+"="+(a+b));


        /*
        int a = 50;

        double b = 56.67877799112839;
        float c = 7.1234567890f;
        boolean T = true;
        System.out.println("value of a = "+a+ " done");
        System.out.println(b);
        System.out.println(c);
        System.out.println(T);
        */

    }
}
