public class MethodOverRiding{
    void run(){
        System.out.println("Running");
    }
}
class Run extends MethodOverRiding{
    @Override
     void run(){
        System.out.println("over");
    }

    public static void main(String[] args){
        MethodOverRiding obj = new MethodOverRiding();
        Run obj1 = new Run();
        obj.run();
        obj1.run();
    }
}