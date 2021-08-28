/*
 * Creation : 11 Jul 2021
 */
package com.acn.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapSetandGetImmutable {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Ramesh", "1");
        ImmutableMap imap = new ImmutableMap(map);
        imap.getMap().put("Ramesh", "3");
        imap.showMap();

    }
}

class ImmutableMap {
    private final Map<String, String> map;

    public ImmutableMap(Map<String, String> map) {
        // this.map = map;
        Map<String, String> tempMap = new HashMap<>();
        for (Entry<String, String> ent : map.entrySet()) {
            tempMap.put(ent.getKey(), ent.getValue());
        }
        this.map = tempMap;

    }

    public Map<String, String> getMap() {
        return map;
    }

    public void showMap() {

        System.out.println(map.get("Ramesh"));
    }
}
