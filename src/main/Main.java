package main;

public class Main {

    public static void main(String[] args) {
        Vector2D a = new Vector2D(3, 7);
        Vector2D b = new Vector2D(5, 2);

        System.out.println(a.add(b));
        System.out.println(a.dotProduct(b));
        System.out.println(a.scale(5));
    }
}
