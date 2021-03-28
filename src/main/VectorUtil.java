package main;

import java.util.List;

public class VectorUtil<T extends Vector<T>> {
    public T manipulateVector(T v1, T v2, T v3, int s) {
        return v1.add(v2).dotProduct(v3).scale(s);
    }


    public void printInOrder (List<T> vectors) {

        VectorCompare<T> vc = new VectorCompare<>();
        vectors.sort(vc);

        for (T v: vectors) {
            System.out.println(v);
        }
    }
}


