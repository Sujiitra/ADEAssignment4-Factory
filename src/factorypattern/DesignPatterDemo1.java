/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorypattern;

/**
 *
 * @author sujiitramurukeshan
 */
public class DesignPatterDemo1 {

    /**
     * @param args the command line arguments
     */
    // Factory Pattern Demo
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeFactory shapeFactory= new ShapeFactory(); //Creates an Object
        Shape shape1=shapeFactory.getShape("Circle");
        shape1.draw(); 
        Shape shape2=shapeFactory.getShape("Rectangle");
        shape2.draw();
        Shape shape3=shapeFactory.getShape("Square");
        shape3.draw();
        
    }
    
}
