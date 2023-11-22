/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorypattern;

/**
 *
 * @author sujiitramurukeshan
 */
public class Square implements Shape{
    @Override
    public String draw(){
        System.out.println("Inside Square::draw() method."); // Prints the shape
        return "Square"; // Return value
    }
    
}
