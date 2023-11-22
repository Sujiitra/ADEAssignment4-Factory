/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypattern;

/**
 *
 * @author sujiitramurukeshan
 */
//Factory Pattern Demo
public class ShapeFactory {
    //Gets the shape
    public Shape getShape(String shapeType){
        if(shapeType==null)
            return null;
        if(shapeType.equalsIgnoreCase("Circle")) //Checks whether it is a Circle
            return new Circle();
        else if(shapeType.equalsIgnoreCase("Rectangle")) //Checks whether it is a Rectangle
            return new Rectangle();
        else if(shapeType.equalsIgnoreCase("Square")) //Checks whether it is a Square
            return new Square();
    return null;    
    }
}
