import java.util.Scanner;

public class newpractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter electricty used: ");
        int electricity = sc.nextInt();
        int bill=0;

        if (electricity <= 100){
            System.out.println("total bill is , Rs" +(electricity*6) );
        }
        else if (electricity>100 && electricity<=150){
            System.out.println("total bill is , Rs" + ( (electricity-100)*7 + 600));
        }
        else if (electricity>150 && electricity<=200){
            System.out.println("total bill is , Rs" + ((electricity-150)*10) + 50*7 + 600);
        }
        else if (electricity>200 && electricity<=300) {
            System.out.println("total bill is , Rs" + ((electricity-200)*15 + 50*10 + 50*7 +600));

        }
        else if (electricity>300) {
            System.out.println("total bill is, Rs" + (electricity-300)*20 + 100*15 + 50*10 + 50*7 + 600);
        }
    }
}
