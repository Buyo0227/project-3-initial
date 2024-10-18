package com.example.iterable;
import java.util.ArrayList;
import java.util.List;

class Bag <T> implements Container <T> {
    private List<T> bag = new ArrayList<T>();

    public boolean isEmpty() {

        return bag.isEmpty();
    }

    public int size() {

        return bag.size();
    }

    public void add(T item) {

        bag.add(item);
    }

    public java.util.Iterator<T> iterator() {

        return bag.iterator();
    }




}

