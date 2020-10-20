/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai6;

/**
 *
 * @author MyPC
 */
import bai4.StackOfIntegers;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n:");
        int n = scanner.nextInt();
        StackOfIntegers stack = new StackOfIntegers(n);
        while (n>0)
        {
            stack.push(n%2);
            n/=2;
        }
        while (!stack.isEmpty())
            System.out.print(stack.pop());
        System.out.println("");
    }
}

