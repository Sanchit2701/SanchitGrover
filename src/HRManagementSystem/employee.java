package HRManagementSystem;

public class employee {

    String Lastname;
    int Registratio_number;
    int age;
    int DaysWorked;
    int Vacationdaystaken;
    double sal;
    int yearsworked;
    int Vacationleft;

    public void timeToRetirement(){
        int time_to_retirement = 60 - age;
        System.out.println("time to retirement: " + time_to_retirement);
    }

    public void vacationTimeLeft(){
        Vacationleft = (4- Vacationdaystaken);
        System.out.println("Vacation left: "+Vacationleft);
    }

    public void calculateBonus(){
        int Bonus = Vacationleft*1000 ;
        System.out.println("Bonus : ₹"+Bonus);
    }

}
