package level5;

import javax.security.auth.login.AccountLockedException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class bai7 {
    public static void main(String[] args){
        String[] keys = {"b", "a", "c"};
        Map<String, Integer>[] collections = new HashMap[3];
        collections[0] = new HashMap<>();
        collections[0].put("a",1);
        collections[0].put("b", 1);
        collections[0].put("c", 2);
        collections[0].put("d", 4);
        collections[0].put("e",5);

        collections[1] = new HashMap<>();
        collections[1].put("a", 2);
        collections[1].put("b",1);
        collections[1].put("c", 5);
        collections[1].put("d", 4);
        collections[1].put("e", 5);

        collections[2] = new HashMap<>();
        collections[2].put("d", 4);
        collections[2].put("e", 5);
        collections[2].put("a", 22);
        collections[2].put("b", 11);
        collections[2].put("c", 51);

        Map<String, Integer>[] result = mapKey(keys, collections);
        for(Map<String, Integer> map: result){
            System.out.println(map);
        }
    }

    public static Map<String, Integer>[] mapKey(String[] keys, Map<String,Integer>[] collections){
        Map<String , Integer>[] result = new HashMap[collections.length];
        for(int i=0; i< collections.length; i++){
            Map<String, Integer> objectMap = new HashMap<>();
            for(String key: keys){
                if(collections[i].containsKey(key)){
                    objectMap.put(key, collections[i].get(key));
                }
            }
            result[i] = objectMap;
        }
        return result;
    }
}
