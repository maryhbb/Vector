package main;

public interface Vector<T> {
     T add(T that);
     T dotProduct(T that);
     T scale(int scalar);
}
