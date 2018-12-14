package day2.chapter6.section3;

import java.util.Map;

class CollectionUtils {

    public void printMapElements(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
