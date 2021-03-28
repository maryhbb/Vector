package main;

public class Vector3D implements Vector<Vector3D>{

    private final double a;
    private final double b;
    private final double c;


    public Vector3D(double a, double b, double c) {
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
    public Vector3D scale(double scalar) {
            return new Vector3D(this.a * scalar, this.b * scalar, this.c * scalar);
        }

    @Override
    public double length() {
        return  Math.sqrt(a * a + b * b + c * c);
    }

    @Override
    public String toString() {return "[" + a + ", " + b + ", " + c + "]" ;
    }

}


