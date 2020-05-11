/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

/**
 *
 * @author Cuong Pham
 */
public class Rectangle extends Shape{

    private static Rectangle instance;

    public static Rectangle createRectangle(){
        if(instance==null)
            instance= new Rectangle();
        return instance;
    }

    @Override
    public String draw() {
        return "hình tam giác:";
    }
    
}
