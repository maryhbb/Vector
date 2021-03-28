package main;
public class Main {
    public static void main(String[] args) {
//        Vector2D a = new Vector2D(3, 7);
//        Vector2D b = new Vector2D(5, 2);
//
//        System.out.println(a.add(b));
//        System.out.println(a.dotProduct(b));
//        System.out.println(a.scale(5));

        VectorUtil<Vector2D> util = new VectorUtil<>();
        Vector2D result = util.manipulateVector(
            new Vector2D(3, 4),
            new Vector2D(5, 1),
            new Vector2D(7, 2),
            5);
        result.toString();
        
        System.out.println(result);



        VectorUtil<Vector3D> util2 = new VectorUtil<>();
        Vector3D result2 = util2.manipulateVector(
                new Vector3D(3, 4, 5),
                new Vector3D(5, 1, 7),
                new Vector3D(7, 2, 8),
                5);
        result2.toString();

        System.out.println(result2);
    }
}
