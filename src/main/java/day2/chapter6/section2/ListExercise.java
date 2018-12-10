package day2.chapter6.section2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExercise {
    public static void main(String args[]) {
        CollectionUtils collectionUtils = new CollectionUtils();
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        arrayList.add("arrayList1");
        arrayList.add("arrayList2");
        arrayList.add("arrayList3");
        collectionUtils.printListElements(arrayList);

        linkedList.add("linkedList1");
        linkedList.add("linkedList2");
        linkedList.add("linkedList3");
        collectionUtils.printListElements(linkedList);
    }
}
