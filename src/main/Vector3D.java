package main;

import java.util.Objects;

public class Vector3D implements Vector<Vector3D>{

    private final int a;
    private final int b;
    private final int c;


    public Vector3D(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public Vector3D add(Vector3D that) {
        return new Vector3D(this.a + that.a, this.b + that.b, this.c + that.c);
    }

    @Override
    public Vector3D dotProduct(Vector3D that) {
        return new Vector3D(this.a + that.a, this.b + that.b, this.c + that.c);
    }

    @Override
    public Vector3D scale(int scalar) {
            return new Vector3D(this.a * scalar, this.b * scalar, this.c * scalar);
        }

    @Override
    public String toString() {return "[" + a + ", " + b + ", " + c + "]" ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector3D vector3D = (Vector3D) o;
        return a == vector3D.a && b == vector3D.b && c == vector3D.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }
}


