package Collection;

import javax.print.attribute.SupportedValuesAttribute;
import java.util.*;

public class HashDemo {
    public static void main(String[] args){
        HashMap<Integer, String> list = new HashMap<>();

        list.put(12,"123df");
        list.put(17,"Ram");
        list.put(1,"1234");
        list.put(3,"Ram");
        list.put(12,"Sabc");
        list.put(14,null);
        list.put(17,"2hs8");

        System.out.println(list);

        TreeMap<Integer, String> list1 = new TreeMap<>();

        list1.put(12,"123df");
        list1.put(17,"Ram");
        list1.put(1,"1234");
        list1.put(3,"Ram");
        list1.put(12,"Sabc");
        list1.put(14,null);
        list1.put(17,"2hs8");

        System.out.println(list1);
        for (Map.Entry<Integer, String> me : list1.entrySet()){
            System.out.println(me.getKey()+" "+me.getValue()+" "+me.getClass());
        }

        list.forEach((Key, Value) ->{
                    System.out.println(Key+" "+Value);
                });
        /*
        Set s = list1.entrySet();
        Iterator itr = s.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

         */
    }
}
