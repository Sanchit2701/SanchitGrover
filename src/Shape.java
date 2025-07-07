import java.util.Scanner;

abstract class Shape {
    abstract void CalculateArea();
}

class Circle extends Shape{
    @Override
    void CalculateArea(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radius of circle: ");
        double r = sc.nextDouble();
        System.out.println("area of circle: "+(3.14*(r*r))) ;
        //System.out.println("no radius provided");
    }
}

class Rectangle extends Shape{
    @Override
    void CalculateArea(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter lenght of rect: ");
        int a = sc.nextInt();
        System.out.print("enter breath of rect: ");
        int b = sc.nextInt();
        System.out.println("area of rectangle: "+ (a*b));
    }

    public static void main(String[] args){
        Circle objC = new Circle();
        Rectangle objR = new Rectangle();

        objC.CalculateArea();
        objR.CalculateArea();
    }
}