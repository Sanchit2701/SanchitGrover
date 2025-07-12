package HRManagementSystem;

import java.util.Scanner;

public class SalesManager extends SalesRep{
    public static String Firstname;
    public void information(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Firstname :");
        Firstname =sc.next();

        System.out.print("Lastname:");
        Lastname=sc.next();

        System.out.print("Registratio_number: ");
        Registratio_number=sc.nextInt();

        System.out.print("age: ");
        age= sc.nextInt();

        System.out.print("DaysWorked: ");
        DaysWorked= sc.nextInt();

        System.out.print("Vacation Days Taken: ");
        Vacationdaystaken= sc.nextInt();

        System.out.print("Salary: ");
        sal=sc.nextDouble();

        System.out.print("years Worked: ");
        yearsworked=sc.nextInt();

        System.out.print("total sales made : ");
        Salesmade = sc.nextInt();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String ID = sc.next();
        System.out.print("Enter Password: ");
        String Pass = sc.next();

        if (ID.equals("S") && Pass.equals("T")){
            System.out.println("hello executed");
            System.out.println("Access Granted");
            SalesManager obj = new SalesManager();
            obj.information();

            System.out.println(Firstname+" Salary Slip");
            obj.timeToRetirement();
            obj.vacationTimeLeft();
            obj.calculateBonus();

            obj.Calculate_commision();

        }

        else {
            System.out.println(ID);
            System.out.println(Pass);
            System.out.println("Error: Wrong details ");
        }
    }
}
