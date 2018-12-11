package day2.chapter6.section2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExercise {
    public static void main(String args[]) {
        CollectionUtils collectionUtils = new CollectionUtils();
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        arrayList.add("arrayListの要素1");
        arrayList.add("arrayListの要素2");
        arrayList.add("arrayListの要素3");
        collectionUtils.printListElements(arrayList);

        linkedList.add("linkedListの要素1");
        linkedList.add("linkedListの要素2");
        linkedList.add("linkedListの要素3");
        collectionUtils.printListElements(linkedList);
    }
}
