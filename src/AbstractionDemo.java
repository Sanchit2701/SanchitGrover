abstract class AbstractionDemo {
    void run(){
        System.out.println("Running");
    }
    abstract void eat();

    public static void main(String[] args) {
        AbstractionDemo obj = new AbstractionDemo() {
            @Override
            void eat() {
                System.out.println("Eating Pizza");
            }
        };
    obj.run();
    AbstractionDemo obj2 = new AbstractionDemo() {
        @Override
        void eat() {
            System.out.println("Eating Dal Chawal");
        }
    };
    obj2.eat();

    }
}
