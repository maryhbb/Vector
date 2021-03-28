package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        VectorUtil<Vector2D> util = new VectorUtil<>();
        Vector2D result = util.manipulateVector(
                new Vector2D(3, 4),
                new Vector2D(5, 1),
                new Vector2D(7, 2),
                5);
        result.toString();

        System.out.println(result);
        System.out.println(result.length());

        VectorUtil<Vector3D> util2 = new VectorUtil<>();
        Vector3D result2 = util2.manipulateVector(
                new Vector3D(3, 4, 5),
                new Vector3D(5, 1, 7),
                new Vector3D(7, 2, 8),
                5);
        result2.toString();

        System.out.println(result2);
        System.out.println(result2.length());

        Vector2D x = new Vector2D(3, 2);
        Vector2D y = x.add(new Vector2D(1, 2));
        System.out.println(y);


     /*   Vector2D myArray[] = {
                new Vector2D(3, 4),
                new Vector2D(5, 1),
                new Vector2D(7, 2)
        };*/


        List<Vector2D> myList = Arrays.asList(
                new Vector2D(3, 4),
                new Vector2D(2, 1),
                new Vector2D(7, 2)
        );
      util.printInOrder(myList);

    }
}
