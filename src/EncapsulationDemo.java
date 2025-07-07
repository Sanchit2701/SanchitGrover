public class EncapsulationDemo {
    int age;
    String name;

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] agrs){
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.setAge(20);
        obj.setName("Rose");

        System.out.println(obj.getAge());
    }
}
