package org.example.runner;

import java.util.Map;
import java.util.Optional;

/**
 * Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, then set "c" to have the longer value. If the values exist and have the same length, change them both to the empty string in the map.
 *
 *
 * mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
 * mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
 * mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
 */
public class MapAB4 {

    public Map<String, String> mapAB4(Map<String, String> map) {
        return Optional.of(map).map(m -> {
            if(m.containsKey("a") && m.containsKey("b")){
                if(m.get("a").length() == m.get("b").length()){
                    m.put("a", "");
                    m.put("b", "");
                } else if(m.get("a").length() != m.get("b").length()){
                    if(m.get("a").length() > m.get("b").length()){
                        m.put("c", m.get("a"));
                    } else {
                        m.put("c", m.get("b"));
                    }
                }
            }
            return m;
        }).orElse(null);
    }
}
