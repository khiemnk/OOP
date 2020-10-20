/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author MyPC
 */
import java.util.*;
import bai1.SinhVien;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        SinhVienUtil utils = new SinhVienUtil();
        System.out.println("nhap so sinh vien");
        int n = in.nextInt();
        in.nextLine();
        int l=1;
        ArrayList <SinhVien> students = new ArrayList<>();
        while(l<=n){
            SinhVien sinhvien = SinhVienUtil.nhap(in);
            students.add(sinhvien);
            l++;
        }
        showMenu(students);
    }
    public static void showMenu(ArrayList<SinhVien> students){
        SinhVienUtil util = new SinhVienUtil();
        System.out.println("1. Show all students");
        System.out.println("2. Sort students by name");
        System.out.println("3. Show students by classes");
        System.out.println("0. Exit.");
        boolean exit = false;
        while(exit == false){
            int choise = in.nextInt();
            switch (choise){
                case 1:
                    util.showAllStudents(students);
                    System.out.println("Any choose ?");
                    break;
                case 2:
                    util.sortByName(students);
                    System.out.println("Any choose ?");
                    break;
                case 3:
                    util.showClasses(students);
                    System.out.println("Any choose ?");
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Any choose ?");
            }
        }
    }
}
