package test;

import main.Vector2D;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Vector2DTest {

    @Test
    void testToString() {
        Vector2D v = new Vector2D(10,20);
        Assertions.assertEquals(v.toString(), "[10, 20]");
    }

    @Test
    void add() {
        Vector2D v1 = new Vector2D(10,20);
        Vector2D v2 = new Vector2D(30,40);
        Vector2D result = v1.add(v2);
        Assertions.assertEquals(result, new Vector2D(40, 60));
    }

    @Test
    void dotProduct() {
        Vector2D v1 = new Vector2D(10,20);
        Vector2D v2 = new Vector2D(30,40);
        Vector2D result = v1.dotProduct(v2);
        Assertions.assertEquals(result, new Vector2D(300, 800));
    }

    @Test
    void scale() {
        Vector2D v = new Vector2D(10,20);
        Vector2D result = v.scale(2);
        Assertions.assertEquals(result, new Vector2D(20, 40));
    }

}