import javax.sound.midi.Soundbank;
import java.util.Scanner;
//armstrong number

public class loops{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter num: ");
        int number = sc.nextInt();
        int i=number;
        int rev=0;
        while (i>=1){
            int digit = i%10;
            i=i/10;
            rev = rev*10 + digit;
        }







/*
//palindrome in range

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter range: ");
        int limit = sc.nextInt();
        int n=1;
        int i;
        while (n<=limit){
            int rev=0;
            i=n;
            while (i>=1){
                int digit = i%10;
                i=i/10;
                rev = rev*10 + digit;
            }
            if (rev==n){
                System.out.println(n+" is a palindrome");
            }
            else{
                System.out.println(n+" is Not a palindrome");
            }
            n++;

        }
 */



/*
//palindrome
public class loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no: ");
        int n = sc.nextInt();
        int number=n;
        int rev=0;
        int i =1;

        while(n>=1){
            int digit = n%10;
            n=n/10;
            rev = rev*10 + digit;
        }
        if (rev==number){
            System.out.println("number is a palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
 */


/*
//factorial
public class loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number for factorial : ");
        int factorial= sc.nextInt();
        int i=1;
        int value=1;
        while (i<=factorial){
            value*=i;
            i++;
        }
        System.out.println(factorial+"! : "+value);

 */

/*
//prime or not using while loop

public class loops {
    public static void main(String[] args){
        int i =1 ;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt();
        int check = 0;
        while (i<=n ) {
            if (n%i==0){
                if (i==1){
                    check+=1;
                } else if (i==n) {
                    check+=1;
                }
                else{
                    check+=2;
                }
            }
            i++;
        }
        if (check==2){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("Not prime");
        }

 */





        /*
        Scanner sc = new Scanner(System.in);

        System.out.print("enter starting number: ");
        int initial= sc.nextInt();
        System.out.print("enter ending number: ");
        int finalnumber= sc.nextInt();

        for (int i = initial; i<=finalnumber; i+=1){
            if (i%2==0){
                System.out.println(i+"is even");

            }
            else{
                System.out.println(i+"is odd");

            }

         */

//2nd code
        /*
        System.out.print("enter number: ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i =0 ; i<=10; i+=1){
            System.out.println(a+" x "+i+" = "+(a*i));
*/
    }
}
