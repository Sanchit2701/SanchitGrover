import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int[] circularArray = {10, 20, 30, 40, 50};
        int size = circularArray.length;
        int steps = 7;

        for (int i = 0; i < steps; i++) {
            int index = (i) % size;
            System.out.println(index);
            System.out.print(circularArray[index] + " ");
        }

        /*
        Listnode node = new Listnode(1);

        Listnode node1 = new Listnode(2);
        Listnode node2 = new Listnode(3);
        Listnode node3 = new Listnode(4);

        node.next = node1;
        node1.next = node2;
        node2.next = node3;

        Listnode current = node;
        Listnode x= current.next.next.next;
        System.out.println(x.val);

        while (current != null) {
            System.out.println(current.val);
            current=current.next;

         */
        }
    }
