package org.example.runner;

import java.util.Map;
import java.util.Optional;

/**
 * Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both), set the other to have that same value in the map.
 *
 *
 * mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
 * mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
 * mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}
 */
public class MapAB3 {

    public Map<String, String> mapAB3(Map<String, String> map) {
        return Optional.of(map).map(m -> {
            if(m.containsKey("a") && m.containsKey("b")){
                return m;
            } else if (m.containsKey("a")){
                m.put("b", m.get("a"));
            } else if (m.containsKey("b")){
                m.put("a", m.get("b"));
            }
            return m;
        }).orElse(null);
    }

}
