/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import factorypattern.Circle;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sujiitramurukeshan
 * Test class for the circle class,
 * creates a test draw method,
 * assert equals when the method called, it returns cicle,
 * assert not equals when the method called, it returns draw,
 * assert same when the method called, it returns the same circle value
 *
 */
public class Circle_Test {
    
    public Circle_Test() {
    }

    
    Circle c=new Circle();
    @Test
    public void draw_test() {
    assertEquals("Circle",c.draw());
    assertNotEquals("Draw",c.draw());
    assertSame("Circle",c.draw());
    }
}
