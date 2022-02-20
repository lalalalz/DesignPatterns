package Flyweight.after;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {

    private Map<String, Font> fontPool = new HashMap<>();

    public Font getFont(String font) {
        if (!fontPool.containsKey(font)) {
            fontPool.put(font, new Font(
                    "white",
                    font.split(":")[0],
                    Integer.parseInt(font.split(":")[1]))
            );
        }
        return fontPool.get(font);
    }
}
