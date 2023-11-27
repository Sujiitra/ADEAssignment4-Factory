/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypattern;

/**
 *
 * @author sujiitramurukeshan
 * Rectangle class implements Shape interface,
 * draw method is overriden,
 * prints the shape,
 * returns the string rectangle
 * 
 */
public class Rectangle implements Shape{
    @Override
    public String draw(){
        System.out.println("Inside Rectangle::draw() method."); //Prints the shape
        return "Rectangle"; // Returns Value
    }
    
}
