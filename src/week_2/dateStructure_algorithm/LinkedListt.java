package week_2.dateStructure_algorithm;

import java.util.LinkedList;

public class LinkedListt {
    public static void main(String[] args) {
        LinkedList<String> color = new LinkedList<>();
        color.add("Orange");
        color.add("Yellow");
        color.add("Pink");
        color.add("blue");
        color.add("Red");
        System.out.println("mảng gồm: " + color + " have a size: " + color.size());
        //System.out.println(color.indexOf("blue"));
        System.out.println("mảng trước khi cập nhật giá trị: " + color);
        color.set(3,"white");
        System.out.println("mảng sau khi cập nhật: " + color);
    }
}



