package org.example.runner;

import java.util.Map;
import java.util.Optional;

/**
 * Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys. If both keys are present, append their 2 string values together and store the result under the key "ab".
 *
 *
 * mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
 * mapAB({"a": "Hi"}) → {"a": "Hi"}
 * mapAB({"b": "There"}) → {"b": "There"}
 */
public class MapAB {

    public Map<String, String> mapAB(Map<String, String> map) {
        return Optional.of(map).map(mappedValue -> {
            if(mappedValue.containsKey("a") && mappedValue.containsKey("b")){
                mappedValue.put("ab",mappedValue.get("a") + mappedValue.get("b"));
            }
            return mappedValue;
        }).orElse(null);
    }

}
