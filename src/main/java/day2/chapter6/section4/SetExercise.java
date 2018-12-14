package day2.chapter6.section4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class SetExercise {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
        CollectionUtils collectionUtils = new CollectionUtils();

        hashSet.add("HashSetの値1");
        hashSet.add("HashSetの値2");
        hashSet.add("HashSetの値3");
        collectionUtils.printSetElements(hashSet);

        treeSet.add("TreeSetの値1");
        treeSet.add("TreeSetの値2");
        treeSet.add("TreeSetの値3");
        collectionUtils.printSetElements(treeSet);
    }
}
