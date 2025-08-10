import java.util.Scanner;

public class ThreadDemo  extends Thread{
    static void range(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter minimum number: ");
        int first = sc.nextInt();
        System.out.print("enter maximum number: ");
        int last = sc.nextInt();
        for (int i = first; i <= last; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
    }
    @Override
    public void run() {
        range();
    }
    public static void main(String[] args){
        ThreadDemo obj = new ThreadDemo();
        obj.start();
        System.out.println("RANGE FOR ODD-EVEN IN NUMBERS");
    }
}
// Question. Use Thread in Palindrome.