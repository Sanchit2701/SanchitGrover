package Collection;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {

        Vector list = new Vector<>(4);
        list.add(1);
        list.add(19);
        list.add(90);
        list.add(11);
        list.add(null);

        System.out.println(list);

        list.set(2,12);

        System.out.println(list);
        System.out.println(list.capacity());

        /*
        //STACK

        Stack list = new Stack();
        list.push(90);
        list.push(9);
        list.push(30);
        list.push(20);
        list.addLast(01);
        System.out.println(list);
        list.push("XYZ");

        System.out.println(list);
        System.out.println(list.peek());
        System.out.println(list.pop());
        System.out.println(list);

         */

    }
}

        /*
        //LinkedList

        LinkedList list = new LinkedList();
        list.add(47);
        list.add("null");
        list.add("Kush");
        list.add(387);
        list.add(37);
        list.add(87);
        list.add(4);
        list.add(38);
        list.add(2,28);
        //list.addAll(6,879);

        ArrayList<Integer> list2 = new ArrayList<>();


        list.addAll(list2);
        System.out.println("ADD ALL IMPLEMENTED : "+list);

        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println(" ");


        //for(int i : list){
        //    System.out.println(i);
        //}

        System.out.println("iterator");
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }
        list.add(56);
        System.out.println(list);

        list.set(2,"Asthana");
        System.out.println(list);
    }

         */
