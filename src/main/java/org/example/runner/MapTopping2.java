package org.example.runner;

import java.util.Map;
import java.util.Optional;

/**
 * Given a map of food keys and their topping values, modify and return the map as follows: if the key "ice cream" has a value, set that as the value for the key "yogurt" also. If the key "spinach" has a value, change that value to "nuts".
 *
 *
 * topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
 * topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
 * topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
 */
public class MapTopping2 {

    public Map<String, String> topping2(Map<String, String> map) {
        return Optional.of(map).map(m -> {
            if(m.containsKey("ice cream")){
                m.put("yogurt", m.get("ice cream"));
            }
            if(m.containsKey("spinach")){
                m.put("spinach", "nuts");
            }
            return m;
        }).orElse(null);
    }
}
