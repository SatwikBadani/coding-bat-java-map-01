package org.example.runner;

import java.util.Map;
import java.util.Optional;

/**
 * Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.
 *
 *
 * mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
 * mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
 * mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
 */
public class MapShare {

    public Map<String, String> mapShare(Map<String, String> map) {
        return Optional.of(map).map(mappedValue -> {
            if(mappedValue.containsKey("a")){
                mappedValue.put("b", mappedValue.get("a"));
            }
            mappedValue.remove("c");
            return mappedValue;
        }).orElse(null);
    }
}
