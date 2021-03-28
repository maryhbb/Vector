package main;

public class Vector2D implements Vector<Vector2D> {
    private final double a;
    private final double b;

    public Vector2D(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Vector2D add(Vector2D that) {

        return new Vector2D(this.a + that.a, this.b + that.b);
    }

    @Override
    public Vector2D dotProduct(Vector2D that) {
        return new Vector2D(this.a * that.a, this.b * that.b);
    }

    @Override
    public Vector2D scale(double scalar) {
        return new Vector2D(this.a * scalar, this.b * scalar);
    }

    @Override
    public double length() {
        return  Math.sqrt(a * a + b * b);
    }

    @Override
    public String toString() {
        return "[" + a + ", " + b + "]";
    }


}