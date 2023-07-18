package level5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class bai5 {
    public static void main(String[] args) {
        List<Map<String, Integer>> collect = new ArrayList<>();
        Map<String, Integer> obj1 = new HashMap<>();
        obj1.put("a", 1);
        obj1.put("b", 2);
        collect.add(obj1);

        Map<String, Integer> obj2 = new HashMap<>();
        obj2.put("a", 1);
        obj2.put("b", 3);
        collect.add(obj2);

        Map<String, Integer> obj3 = new HashMap<>();
        obj3.put("a", 2);
        obj3.put("b", 2);
        collect.add(obj3);

        Map<Integer, List<Map<String, Integer>>> result = groupBy(collect, "a");
        System.out.println(result);
    }

    public static Map<Integer, List<Map<String, Integer>>> groupBy(List<Map<String, Integer>> collect, String field) {
        Map<Integer, List<Map<String, Integer>>> result = new HashMap<>();

        for (Map<String, Integer> obj : collect) {
            int fieldValue = obj.get(field);
            List<Map<String, Integer>> group = result.getOrDefault(fieldValue, new ArrayList<>());
            group.add(obj);
            result.put(fieldValue, group);
        }

        return result;
    }
}
