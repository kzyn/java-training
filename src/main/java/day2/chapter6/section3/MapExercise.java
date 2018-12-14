package day2.chapter6.section3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExercise {

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();
        CollectionUtils collectionUtils = new CollectionUtils();

        hashMap.put(1, "HashMapの値1");
        hashMap.put(2, "HashMapの値2");
        hashMap.put(3, "HashMapの値3");
        collectionUtils.printMapElements(hashMap);

        treeMap.put(1, "TreeMapの値1");
        treeMap.put(2, "TreeMapの値2");
        treeMap.put(3, "TreeMapの値3");
        collectionUtils.printMapElements(treeMap);
    }
}
