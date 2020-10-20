/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;

/**
 *
 * @author MyPC
 */
import bai7.StackOfChars;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input a match expression: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(solve(s));
    }

    public static int prior(char c){
        if(c == '+' || c == '-') return 1;
        if(c == '*' || c == '/') return 2;
        if(c == '^') return 3;
        return 0;
    }

    public static String solve(String s){
        StackOfChars stackOfChars = new StackOfChars();
        String ans = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                ans += s.charAt(i);
            }
            else if(s.charAt(i) == '('){
                stackOfChars.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')'){
                while (!stackOfChars.isEmpty()){
                    char temp = stackOfChars.pop();
                    if(temp != '('){
                        ans += temp;
                    }
                }
            }
            else{
                while(!stackOfChars.isEmpty() && prior(s.charAt(i)) <= prior(stackOfChars.peak())){
                    ans += stackOfChars.pop();
                }
                stackOfChars.push(s.charAt(i));
            }
        }
        while(!stackOfChars.isEmpty() && stackOfChars.peak() != '('){
            ans += stackOfChars.pop();
        }
        return ans;
    }
}
