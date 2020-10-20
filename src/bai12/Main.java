/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

/**
 *
 * @author MyPC
 */
import java.util.*;

public class Main {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("1. Tính tổng và hiệu hai ma trận");
        System.out.println("2. Tính tích hai ma trận");
        System.out.println("3. Tìm chuyển vị của một ma trận");
        System.out.println("4. Kết thúc chương trình");
        boolean check = false;
        int choice = 1;
        do{
            System.out.println("Nhập lựa chọn");
            choice = in.nextInt();
            switch(choice){
                case 1:
                    choiceOne();
                    break;
                case 2:
                    choiceTwo();
                    break;
                case 3:
                    choiceThree();
                    break;
                case 4:
                    System.out.println("Chuong trinh ket thuc ");
                    check = true;
                    return;
                default:
                    System.out.println("Chon khong hop le hay chon lai");
            }
        }
        while(!check);
    }
    
    private static Matrix nhap() {
        int rows = 0;
        int cols = 0;
        System.out.println("Số hàng :");
        rows = in.nextInt();
        System.out.println("Số cột :");
        cols = in.nextInt();
        System.out.println("Nhập ma trận :");
        Matrix matrix = new Matrix(rows, cols);
        matrix.input(in);
        return matrix;
    }
    
    public static void choiceOne() throws Exception{
        System.out.println("Nhap ma tran a: ");
        Matrix a = nhap();
        System.out.println("Nhap ma tran b: ");
        Matrix b = nhap();
        System.out.println("Tong 2 ma tran a + b : ");
        a.add(b).output();
        System.out.println("Hieu 2 ma tran a - b : ");
        a.sub(b).output();
    }
    
    public static void choiceTwo() throws Exception{
        System.out.println("Nhap ma tran a");
        Matrix a = nhap();
        System.out.println("Nhap ma tran b");
        Matrix b = nhap();
        System.out.println("Tich 2 ma tran a*b :");
        a.mul(b).output();
    }
    
    public static void choiceThree(){
        System.out.println("Nhap ma tran a");
        Matrix a = nhap();
        System.out.println("Ma tran chuyen vi:");
        a.transpose().output();
    }
}
