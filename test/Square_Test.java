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
 */
public class Square_Test {
    
    public Square_Test() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    Square s=new Square();
    @Test
    public void draw_test() {
    assertEquals("Square",s.draw());
    assertNotEquals("Draw",s.draw());
    assertSame("Square",s.draw());
    }
}
