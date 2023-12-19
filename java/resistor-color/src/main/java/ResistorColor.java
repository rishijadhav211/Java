import java.util.HashMap;
import java.util.Map;

class ResistorColor {
    final String[] colors={"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    Map<String, Integer> colorNumberMap = new HashMap<>();
    ResistorColor() {
        colorNumberMap.put("black", 0);
        colorNumberMap.put("brown", 1);
        colorNumberMap.put("red", 2);
        colorNumberMap.put("orange", 3);
        colorNumberMap.put("yellow", 4);
        colorNumberMap.put("green", 5);
        colorNumberMap.put("blue", 6);
        colorNumberMap.put("violet", 7);
        colorNumberMap.put("grey", 8);
        colorNumberMap.put("white", 9);
    }
    int colorCode(String color) {
        return colorNumberMap.get(color);
    }

    String[] colors() {
        return colors;
    }
}
