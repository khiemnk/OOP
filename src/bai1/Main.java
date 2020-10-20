/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author MyPC
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SinhVien a = new SinhVien();
        System.out.println("Nhap ma sinh vien, ten, lop, khoa hoc");
        a.setCode(in.nextLine());
        a.setName(in.nextLine());
        a.setRoom(in.nextLine());
        a.setMajor(in.nextLine());
        System.out.println(a);
    }
}
