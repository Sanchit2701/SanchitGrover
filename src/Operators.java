import java.util.Scanner;

public class Operators {
    public static void main(String[] args){

        int a = 765;
        int b = 56;

        int result = (a<b) ? a : b ;
        boolean result1 = ! ((a<b) || (b==56) || (b>a));
        System.out.println(result);
        System.out.println(result1);

        System.out.println(--a);

        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number: ");
        int a = sc.nextInt();
        System.out.print("enter second number: ");
        int b = sc.nextInt();

        System.out.println("enter the operator(+,-,*,/): ");
        char s = sc.next().charAt(0);

        if (s=='+'){
            System.out.println("executed");
            System.out.println(a+" + "+b+" = "+(a+b));
        }

        else if (s=='-') {
            System.out.println(a+" - "+b+" = "+(a-b));
        }
        else if (s=='*') {
            System.out.println(a+" x "+b+" = "+(a*b));
        }
        else if (s=='/') {
            System.out.println(a+" / "+b+" = "+(a/b));
        }
        else {
            System.out.println("wrong operator, not executed");
        }

         */




    /*    double result = a/b;
        System.out.println(a+b); //addition
        System.out.println(a-b); //subtraction
        System.out.println(a*b); //multiply
        System.out.println(a/b); //division
        System.out.println(a%b); //remainder
        System.out.println(result);

     */

    }
}
