package com.sh.flyweight.after;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {
    private Map<String, Font> cache = new HashMap<>();

    public Font getFont(String fontName){
        if(cache.containsKey(fontName))
            return cache.get(fontName);
        else {
            String[] key = fontName.split(":");
            Font font = new Font(key[0], Integer.parseInt(key[1]));
            cache.put(fontName, font);
            return font;
        }

    }
}
