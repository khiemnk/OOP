/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

/**
 *
 * @author MyPC
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input n:");
        int n = in.nextInt();
        List<MyPoint> points = new ArrayList<>();
        System.out.println("Nhap n point");
        for(int i=0;i<n;i++){
            double x = in.nextDouble();
            double y = in.nextDouble();
            points.add(new MyPoint(x,y));
        }
        MyPoint a = new MyPoint();
        MyPoint b = new MyPoint();
        double max = 0;
        for(int i=0;i<points.size()-1;i++){
            for(int j=i+1;j<points.size();j++){
                if(points.get(i).distance(points.get(j)) > max){
                    max = points.get(i).distance(points.get(j));
                    a = points.get(i);
                    b = points.get(j);
                }
            }
        }
        System.out.println("point 1: " + a.getX() + " " + a.getY());
        System.out.println("point 2: " + b.getX() + " " + b.getY());
        System.out.println("Distant: " + max);
    }
}
