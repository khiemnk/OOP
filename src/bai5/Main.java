/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

/**
 *
 * @author MyPC
 */
import bai4.StackOfIntegers;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input n");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n > 1){
            StackOfIntegers stack = new StackOfIntegers(n);
            int i=2;
            while(i<n){
                while (n%i == 0){
                    n/=i;
                    stack.push(i);
                }
                i++;
            }
            if(n != 1){
                stack.push(n);
            }
            while(!stack.isEmpty()){
                System.out.print(stack.pop() + " ");
            }
        }
        else
            System.out.println(n);
    }
}
