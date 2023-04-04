package org.example.runner;

import java.util.Map;
import java.util.Optional;

/**
 * Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, remove them both.
 *
 *
 * mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
 * mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
 * mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
 */
public class MapAB2 {

    public Map<String, String> mapAB2(Map<String, String> map) {
        return Optional.of(map).map(m -> {
            if(m.containsKey("a") && m.containsKey("b")
                    && m.get("a").equals(m.get("b"))){
                m.remove("a");
                m.remove("b");
            }
            return m;
        }).orElse(null);
    }

}
