/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import factorypattern.Square;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sujiitramurukeshan
 * Test class for the Square class,
 * creates a test draw method,
 * assert equals when the method called, it returns Square,
 * assert not equals when the method called, it returns draw,
 * assert same when the method called, it returns the same Square value
 * 
 */
public class Square_Test {
    
    public Square_Test() {
    }

    Square s=new Square();
    @Test
    public void draw_test() {
    assertEquals("Square",s.draw());
    assertNotEquals("Draw",s.draw());
    assertSame("Square",s.draw());
    }
}
