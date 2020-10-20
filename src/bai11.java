/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MyPC
 */
import bai10.*;
import java.util.*;

public class bai11 {

    public static boolean isRightTriangle(List<MyPoint> list) {
        
        double a = list.get(0).distance(list.get(1))*list.get(0).distance(list.get(1));
        double b = list.get(1).distance(list.get(2))*list.get(1).distance(list.get(2));
        double c = list.get(2).distance(list.get(0))*list.get(2).distance(list.get(0));
        System.out.println(a+" " + b + " " + c);
        if (a+b==c || a+c==b || b+c==a)
            return true;
        return false;
    }

    public static void check(List<MyPoint> list) {
        UtilPoint util = new UtilPoint();
        double a = util.distance(list.get(0), list.get(1));
        double b = util.distance(list.get(1), list.get(2));
        double c = util.distance(list.get(0), list.get(2));
        if (a + b <= c || a + c <= b || b + c <= a)
            System.out.println("Không phải tam giác");
        else {
            if (a == b && b == c)
                System.out.println("Tam giác đều");
            else {
                boolean isRightTriangle = isRightTriangle(list);
                if (a == b || b == c || a == c) {
                    if (isRightTriangle)
                        System.out.println("Tam giác vuông cân");
                    else
                        System.out.println("Tam giác cân");
                } else {
                    if (isRightTriangle)
                        System.out.println("Tam giác vuông");
                    else
                        System.out.println("Là tam giác");
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<MyPoint> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Nhập điểm thứ " + (i + 1));
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            list.add(new MyPoint(x, y));
        }
        check(list);
    }
}
