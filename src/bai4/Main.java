/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

/**
 *
 * @author MyPC
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap n");
        int n = in.nextInt();
        StackOfIntegers stack = new StackOfIntegers(n);
        for(int i=2;i<n;i++){
            if(ktra(i)) stack.push(i);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop() + " ");
        }
    }
    public static boolean ktra(int n){
        if(n==0 || n==1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
