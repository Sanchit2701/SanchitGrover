package ScavengerHunt;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class Onlineclass {

    void stack(Scanner sc) {
        Stack<Integer> list = new Stack<>();
        list.add(1);
        list.add(19);
        list.add(90);
        list.add(11);

        System.out.println("Stack: " + list);
        System.out.print("Enter number for searching in Stack: ");
        int search = sc.nextInt();

        Iterator<Integer> itr = list.iterator();
        boolean found = false;
        while (itr.hasNext()) {
            if (search == itr.next()) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Found in Stack");
        } else {
            System.out.println("Not found in Stack");
        }
    }

    void vector(Scanner sc) {
        Vector<Integer> list1 = new Vector<>(4);
        list1.add(1);
        list1.add(19);
        list1.add(90);
        list1.add(11);

        System.out.println("Vector: " + list1);
        System.out.print("Enter number for searching in Vector: ");
        int search1 = sc.nextInt();

        Iterator<Integer> it = list1.iterator();
        boolean found = false;
        while (it.hasNext()) {
            if (search1 == it.next()) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Found in Vector");
        } else {
            System.out.println("Not found in Vector");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Onlineclass obj = new Onlineclass();
        obj.vector(sc);
        obj.stack(sc);
        sc.close();
    }
}
