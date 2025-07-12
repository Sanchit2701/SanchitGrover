package HRManagementSystem;

public class SalesRep extends employee {
    int Salesmade;

    public void Calculate_commision(){
        double commision =  Salesmade*0.2 ;
        System.out.println("Total Commision from sales: ₹"+commision);
    }

}
