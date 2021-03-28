package main;

import java.util.Comparator;

public class VectorCompare<T extends Vector<T>> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
       return (int) (o1.length() - o2.length());
    }
}
