import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list.add(34);
        list.add(37);
        list.add(890);
        list.add(327);
        list.add(77);
        list1.add(12);
        list.addAll(4,list1);
        System.out.println(list);
        /*
        for(int i:list){
            System.out.println(i);
        }

         */

        Iterator itr = list.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
