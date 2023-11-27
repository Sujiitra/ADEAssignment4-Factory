/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypattern;

/**
 *
 * @author sujiitramurukeshan
 * Circle class implements Shape interface,
 * draw method is overriden,
 * prints the shape,
 * returns the string circle
 */
public class Circle implements Shape{
    @Override
    public String draw(){
        System.out.println("Inside Circle::draw() method."); //Prints the shape
        return "Circle"; //Return value
    }
    
}
