import java.util.Scanner;

public class MethodDemo {

    //method overloading is getting used here
    //under polymorphism
    int add(int a, int b){
        return (a+b);
    }

    int add(int a, int b, int c){
        return (a+b+c);
    }

    double add(double a, int b){
        return (a+b);
    }

    int factorial(int a){
        int fact=1;
        for (int i=1; i<=a;i++){
            fact*=i;
        }
        return fact;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MethodDemo obj = new MethodDemo();

        System.out.println(obj.add(sc.nextInt(),sc.nextInt()));
        System.out.println(obj.add(23,67,89));
        System.out.println(obj.add(8.89,78));
    }

    /*
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MethodDemo obj = new MethodDemo();
        System.out.print("enter number: ");
        System.out.println(obj.factorial(sc.nextInt()));
    }


    public static void main(String[] args){
        MethodDemo obj = new MethodDemo();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter values of a & b: ");
        System.out.println("Sum of a & b: "+(obj.add(sc.nextInt(), sc.nextInt())));
    }

     */
}
