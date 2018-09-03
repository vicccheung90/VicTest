package ArrayListTest;


import java.util.*;


public class CreateArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> Dtring = new ArrayList<Integer>();
        Dtring.add(1);
        Dtring.add(2);
        Dtring.add(3);
        Dtring.add(4);
        Dtring.add(5);
        Dtring.add(6);
        Dtring.add(7);
        Dtring.add(8);
        Dtring.add(9);
        System.out.println(Dtring);
        ArrayList Arr = new ArrayList();
        Arr.add(10);
        Dtring.addAll(Arr);
        System.out.println(Dtring);
        Arr.iterator();
        Arr.hashCode();
        System.out.println(Arr.hashCode());
//        for(Integer vaule : Dtring){
//            System.out.println(vaule++);
//
//        }
        Iterator list = Dtring.listIterator();
        while(list.hasNext()){
            System.out.println(list.next());
        }

    }
}
