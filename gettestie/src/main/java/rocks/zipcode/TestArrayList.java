package rocks.zipcode;

import java.util.ArrayList;

public class TestArrayList<T> {

    //I believe these are the most common:
    //Size
    //Get
    //Add

    private ArrayList<T> list = new ArrayList<>();

    public ArrayList<T> getList() {
        return list;
    }

    public void initList(T[] arr) {
        list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
    }


}
