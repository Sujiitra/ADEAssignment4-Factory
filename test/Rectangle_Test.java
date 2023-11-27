/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import factorypattern.Rectangle;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sujiitramurukeshan
 *  Test class for the Rectangle class,
 * creates a test draw method,
 * assert equals when the method called, it returns Rectangle,
 * assert not equals when the method called, it returns draw,
 * assert same when the method called, it returns the same Rectangle value
 */
public class Rectangle_Test {
    
    public Rectangle_Test() {
    }
    
    Rectangle r=new Rectangle();
    @Test
     public void draw_test() {
    assertEquals("Rectangle",r.draw());
    assertNotEquals("Draw",r.draw());
    assertSame("Rectangle",r.draw());
     }
}
