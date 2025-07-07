public class OOpsDemo {
    void eat() {
        System.out.println("Eating");
    }
}

class Test1 extends OOpsDemo {
    void run() {
        System.out.println("Running");
    }
}

class Test extends OOpsDemo{
    void drink() {
        System.out.println("Drinking");
    }

    public static void main(String[] args) {
        Test obj1 = new Test();
        obj1.eat();
        obj1.drink();
    }
}