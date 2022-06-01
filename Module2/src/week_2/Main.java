package week_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import week_2.inheritance.geometric.Circle;

public class Main {
    @Test
    public void testCircle(){
        Circle circle = new Circle(2);
        double hai = circle.getRadius();
        circle.resize(50);
        Assertions.assertEquals(hai * ((double) 50/100),circle.getRadius());
    }
}
