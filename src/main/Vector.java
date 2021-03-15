package main;

public interface Vector {
     Vector2D add(Vector2D that);
     Vector2D dotProduct(Vector2D that);
     Vector2D scale(int scalar);
}
