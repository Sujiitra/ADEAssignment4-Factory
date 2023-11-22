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
 */
public class Circle_Test {
    
    public Circle_Test() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    Circle c=new Circle();
    @Test
    public void draw_test() {
    assertEquals("Circle",c.draw());
    assertNotEquals("Draw",c.draw());
    assertSame("Circle",c.draw());
    }
}
