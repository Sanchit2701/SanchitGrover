import javax.swing.plaf.synth.SynthOptionPaneUI;

public interface DemoInterface {
    void run();
    void eat();
    public static void main(String[] args){
        DemoInterface obj = new DemoInterface() {
            @Override
            public void run() {
                System.out.println("hello world");
            }

            @Override
            public void eat() {
            }
        };
        obj.run();
        obj.eat();
    }

}
