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
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap chieu dai, rong, mau sac: ");
        Rectangle rectangle = new Rectangle();
        double width = in.nextDouble();
        double height = in.nextDouble();
        in.nextLine();
        String color = in.nextLine();
        rectangle.setWidth(width);
        rectangle.setHeight(height);
        rectangle.setColor(color);
        System.out.println(rectangle);
        Util util = new Util();
        System.out.println(util.findArea(rectangle));
        System.out.println(util.findPerimeter(rectangle));
    }
}
