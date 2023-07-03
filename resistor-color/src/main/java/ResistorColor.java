import java.util.HashMap;
class ResistorColor {
    int colorCode(String color) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("black",0);
        map.put("brwon",1);
        map.put("red",2);
        map.put("orange",3);
        map.put("yellow",4);
        map.put("green",5);
        map.put("blue",6);
        map.put("violet",7);
        map.put("grey",8);
        map.put("white",9);

        return map.get(color);
    }

    String[] colors() {
        String[] colorArray = new String[]{"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
        return colorArray;
    }
}
