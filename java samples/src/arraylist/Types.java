package arraylist;

import java.util.ArrayList;

public class Types {
    public static void main(String[] args) {
        ArrayList<Integer> salList = new ArrayList<>();
        ArrayList<Float> floats = new ArrayList<>();
        // ArrayList<int> test - new ArrayList<>(); // not allowed for primitives

        salList.add(100);
        floats.add(99.4f);
    }
}
