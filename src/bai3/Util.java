/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author MyPC
 */
public class Util {
    public static double findArea(Rectangle rectangle){
        return rectangle.getHeight()*rectangle.getWidth();
    }
    public static double findPerimeter(Rectangle rectangle){
        return 2*(rectangle.getHeight()+rectangle.getWidth());
    }
}
