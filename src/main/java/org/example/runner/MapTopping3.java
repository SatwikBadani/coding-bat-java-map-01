package org.example.runner;

import java.util.Map;
import java.util.Optional;

/**
 * Given a map of food keys and topping values, modify and return the map as follows: if the key "potato" has a value, set that as the value for the key "fries". If the key "salad" has a value, set that as the value for the key "spinach".
 *
 *
 * topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
 * topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
 * topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
 */
public class MapTopping3 {

    public Map<String, String> topping3(Map<String, String> map) {
        return Optional.of(map).map(m -> {
            if(m.containsKey("potato")){
                m.put("fries", m.get("potato"));
            }
            if(m.containsKey("salad")){
                m.put("spinach", m.get("salad"));
            }
            return m;
        }).orElse(null);
    }

}
