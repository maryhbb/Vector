package main;

import java.util.Objects;

public class Vector2D implements Vector<Vector2D> {
    private final int a;
    private final int b;

    public Vector2D(int a, int b) {
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
    public Vector2D scale(int scalar) {
        return new Vector2D(this.a * scalar, this.b * scalar);
    }

    @Override
    public String toString() {
        return "[" + a + ", " + b + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector2D vector2D = (Vector2D) o;
        return a == vector2D.a && b == vector2D.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}