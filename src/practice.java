import java.sql.SQLOutput;
import java.util.Scanner;

public class practice{
    public static void main(String[] args){

        int i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while (i<=10);

        /*
        Scanner sc = new Scanner();
        int a =sc.next() ;

        switch (a){
            case "A":{
                System.out.println();
            }
            case 78:{
                System.out.println("78");
            }
            default:{
                System.out.println("Else");
            }
        }

         */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the marks: ");
        int marks = sc.nextInt();

        if (marks >90 && marks<=100){
            System.out.println("Grade : A");
        }
        else if (marks>70 && marks<=90) {
            System.out.println("Grade : B");
        }
        else if (marks>60 && marks<=70) {
            System.out.println("Grade : C");
        }
        else if (marks>40 && marks<=60) {
            System.out.println("Grade : D");
        }
        else{
            System.out.println("Grade : FAIL");
        }
        /*
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        if ((number ^ 1)==number+1){
            System.out.println(number+" is even");
        }
        else{
            System.out.println(number +" is odd");
        }

         */



/*
public class practice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number in x: ");
        int x=sc.nextInt();
        System.out.print("enter number in y: ");
        int y=sc.nextInt();
        System.out.println("variable before swap: "+x+" "+y);
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("variable after swap "+x+" "+y);

 */


        /*
        Scanner sc = new Scanner(System.in);

        System.out.print("enter limit: ");
        int max= sc.nextInt();

        for (int i = max-1; i>=0; i-=1) {
            for (int j =i; j>=0;j-=1){
                System.out.print(j+1);
            }
            System.out.println("");
        }

         */


        /*
        #Revese print of star pattern
        Scanner sc = new Scanner(System.in);
        System.out.print("enter limit: ");
        int max= sc.nextInt();

        for (int i = max-1; i>=0; i-=1) {
            for (int j =i; j>=0;j-=1){
                System.out.print("*");
            }
            System.out.println("");
        }

         */



        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("enter limit: ");
        int max= sc.nextInt();

            }
        for (int i = 0; i<=max-1; i+=1){
            for (int j =0; j<=i;j+=1){
                System.out.print(j+1);
            }
            System.out.println("");

         */
    }
}