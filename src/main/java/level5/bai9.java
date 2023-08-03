package level5;

import java.util.HashMap;
import java.util.Map;

public class bai9 {
    public static void main(String[] args){
        Map<String, Integer>[] arr = new HashMap[4];
        arr[0] = new HashMap<>();
        arr[0].put("a", 2);
        arr[0].put("b", 10);

        arr[1] = new HashMap<>();
        arr[1].put("a", 12);
        arr[1].put("c", 11);

        arr[2] = new HashMap<>();
        arr[2].put("a", 8);
        arr[2].put("b", 14);
        arr[2].put("d", 20);

        arr[3] = new HashMap<>();
        arr[3].put("a", 8);

        Map<String, Integer> result = sumAll(arr);

        System.out.println(result);
    }

    public static Map<String, Integer> sumAll(Map<String, Integer>[] arr){
        Map<String, Integer> result = new HashMap<>();

        for(Map<String, Integer> obj: arr){
            for(Map.Entry<String, Integer> entry: obj.entrySet()){
                String key = entry.getKey();
                Integer value = entry.getValue();

                if(result.containsKey(key)){
                    Integer sum = result.get(key) + value;
                    result.put(key, sum);
                } else {
                    result.put(key, value);
                }
            }
        }

        return result;
    }
}
