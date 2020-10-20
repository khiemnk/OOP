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
import bai1.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
public class SinhVienUtil {
    public static SinhVien nhap(Scanner in){
        System.out.println("Nhập mã sinh viên :");
        String code = in.nextLine();
        System.out.println("Nhập tên :");
        String name = in.nextLine();
        System.out.println("Nhập lớp :");
        String lop = in.nextLine();
        System.out.println("Nhập khoa :");
        String major = in.nextLine();
        return new SinhVien(code,name,lop,major);
    }
    public void showAllStudents(ArrayList<SinhVien> students){
        for(SinhVien student : students){
            System.out.println(student);
        }
    }
    
    public void sortByName(ArrayList<SinhVien> students){
        ArrayList <SinhVien> anotherList = new ArrayList<>(students);
        Collections.sort(anotherList, new SortByName());
        showAllStudents(anotherList);
    }
    public void showClasses(ArrayList<SinhVien> students){
        ArrayList<SinhVien> anotherList = new ArrayList<>(students);
        Collections.sort(anotherList,new SortByClass());
        showAllStudents(anotherList);
    }
}
