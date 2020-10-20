/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9;

/**
 *
 * @author MyPC
 */
import bai7.StackOfChars;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("Input number x and base b: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int b = in.nextInt();
        System.out.println(solve(x, b));
    }

    public static String solve(int x, int b){
        Character []chars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','Y','Z'};
        StackOfChars stack = new StackOfChars();
        String ans = "";
        while(x > 0){
            stack.push(chars[x%b]);
            x/=b;
        }
        while(!stack.isEmpty()){
            ans += stack.pop();
        }
        return ans;
    }
}
