package week_2.cleanCodeRefactoring.cylinder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {
    @Test
    @DisplayName("Testing getVolume(0,0) radius = 0 and height = 0")
    void testGetVolume0And0(){
        int radius = 0;
        int height = 0;
        double result = Cylinder.getVolume(0,0);
        double expected = 0;
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing get Volume(1,2) radius = 1, height = 2")
    void testGetVolume1And2() {
        int radius = 1;
        int height = 2;
        double expected = 18.84955592153876;

        double result = Cylinder.getVolume(radius, height);
        assertEquals(expected, result);
    }

}