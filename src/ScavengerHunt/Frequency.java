package ScavengerHunt;

import java.util.Arrays;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number: ");
        int x = sc.nextInt();

        System.out.print("enter the digit u want to freq of: ");
        int y = sc.nextInt();

        int count=0;

        while (x!=0){
            int digit = x%10;
            if (digit==y){
                count++;
            }
            x=x/10;
        }
        System.out.println("frequency of "+ y+": "+ count);
    }
}
