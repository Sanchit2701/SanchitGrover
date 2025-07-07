import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the list limit: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i=0; i<n;i++){
            System.out.print("enter "+(i+1)+" element: ");
            arr[i]= sc.nextInt();
        }
        System.out.print("enter number for search: ");
        boolean Pos = false;

        int s =sc.nextInt();

        for (int i=0; i< n;i++){
            if (arr[i]==s){
                Pos=true ;
                System.out.println("element"+s+" found at index "+i);
                break;
            }
        }
        if (Pos==false) {
            System.out.println("element not found ");
        }


    }
}
        /*
        int arr[] = new int[5];
        arr[0]= 5 ;
        arr[1]= 51 ;
        arr[2]= 45;
        arr[3]= 12 ;
        arr[4]= 32 ;

         */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("enter how many elements you want to enter: ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("enter the elements of array- ");
        for (int i=0;i< arr.length;i++){
            System.out.print("enter "+(i+1)+" element: ");
            arr[i]= sc.nextInt();
        }
        int Sum = 0;
        for (int i=0;i<arr.length;i++){
            Sum+=arr[i];
        }
        System.out.println("the Sum of all elements is: " + Sum);

         */