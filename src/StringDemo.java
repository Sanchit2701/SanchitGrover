import java.util.ArrayList;
import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args){
        //char[] arr ={};
        //String obj = new String(arr);

        char[] arr1 = {'S','a','n','c','h','i','t'};
        System.out.println(arr1);

        char[] arr2 = {' ','G','r','o','v','e','r'};
        System.out.println(arr2);

        String Fname = "Sanchit";
        String Lname = " Grover";

        String name = Fname+Lname ;
        System.out.println(name);

        // StringBuilder - fast but not thread safe (use this when u hv less tasks)
        // Stringbuffer - slow and thread safe( use this when when you have multiple tasks)

        StringBuffer obj = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter to check palindrome: ");
        String in = sc.next();
        obj.append(in);


        System.out.println(obj);
        StringBuffer x = new StringBuffer(obj);
        x=x.reverse();
        System.out.println(x);
        if (x.toString().equals(obj.toString())){
            System.out.println("Palindrome confirmed");
        }
        else{
            System.out.println("not palindrome");
        }


    }
}
