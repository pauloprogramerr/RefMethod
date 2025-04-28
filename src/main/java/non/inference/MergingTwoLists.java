package non.inference;

import java.util.ArrayList;
import java.util.Arrays;

public class MergingTwoLists {




    public ArrayList<Integer> mergeLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list1.isEmpty ()){
            return list2;
        }
        if (list2.isEmpty ()){
            return list1;
        }
        ArrayList<Integer> list = new ArrayList<> ();
        if (list1.get (0) < list2.get (0)){
            list.add (list1.remove (0));
        }else {
            list.add (list2.remove (0));
        }
        list.addAll (mergeLists (list1, list2));
        return list;
    }
    public ArrayList< Integer> passList(){

        Integer[] arr1 = {2, 6, 9, 10, 14};
        Integer[] arr2 = {3, 5 ,7, 12, 13};

        ArrayList<Integer> list1 = new ArrayList<> ();
        list1.addAll (Arrays.asList (arr1));
        ArrayList<Integer> list2 = new ArrayList<> ();
        list2.addAll (Arrays.asList (arr2));

        ArrayList<Integer> list3 = mergeLists (list1, list2);


         list3
                .stream ()
                .forEach (s -> System.out.print (s + " "));

         return list3;
    }

    public static void main(String[] args) {
        MergingTwoLists m = new MergingTwoLists ();
        m.passList ();
    }
}
