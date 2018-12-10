package day2.chapter6.section3;

import java.util.Map;

class CollectionUtils {

    public void printMapElements(Map<Integer, String> map) {
        for (Integer key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
    }
}
