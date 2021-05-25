package interview;

import java.util.*;

public class JavaComputeIfAbsent {
    public static void main (String[] args) {
        List<String> texts = Arrays.asList(
                "asd","xds","vas"
        );

        LinkedHashMap<String, LinkedHashSet<String>> res = new LinkedHashMap<>();

        for(String text: texts) {
            res.computeIfAbsent(text, val -> new LinkedHashSet<>()).add(text);
        }

        Set<String> keys = res.keySet();

        for(String key: keys) {
            System.out.println(key + "--" +
                    res.get(key));
        }

        System.out.println("stuff " + res);
    }
}
