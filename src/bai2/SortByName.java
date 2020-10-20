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
import bai1.SinhVien;
import java.util.Comparator;
public class SortByName implements Comparator<SinhVien> {
    public int compare(SinhVien o1, SinhVien o2) {
        return o1.getName().compareTo(o2.getName());
    }
}