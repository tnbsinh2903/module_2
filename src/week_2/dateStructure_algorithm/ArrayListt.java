package week_2.dateStructure_algorithm;

import java.util.ArrayList;

public class ArrayListt {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("Red");
        color.add("Yellow");
        color.add("blue");
        color.add("Pink");
        color.add("Orange");
        System.out.println(color.get(2));
        System.out.println(color.remove(3));
        System.out.println(color.size());
        System.out.println(color);
    }
}
