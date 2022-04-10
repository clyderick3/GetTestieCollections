package rocks.zipcode;

import java.util.ArrayList;

public class TestArrayList<T> {

    //I believe these are the most common:
    //Size
    //Contains
    //Add
    //Remove
    //Clear

    private ArrayList<T> list = new ArrayList<>();

    public ArrayList<T> getList() {
        return list;
    }

    public void addList(T[] arr) {
        list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
    }

    public int getSizeOfList(T[] arr) {
        return arr.length;
    }
}
