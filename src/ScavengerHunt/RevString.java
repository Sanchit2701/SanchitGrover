package ScavengerHunt;

import java.util.Scanner;

public class RevString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String x = sc.next();

        int l = x.length();
        String rev = "";

        for (int i=l-1;i>=0;i--){
            rev=rev+x.charAt(i);
        }
        System.out.println(rev);
    }
}
