package project.util;

import java.util.ArrayList;

public class DataStore<T> {
    private ArrayList<T> data = new ArrayList<>();

    public void add(T item) { data.add(item); }
    public void showAll() {
        for(T item : data) {
            System.out.println(item);
        }
    }
}
