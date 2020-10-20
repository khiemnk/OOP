/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

/**
 *
 * @author MyPC
 */
import java.util.*;
import bai4.StackOfIntegers;
public class Main {
    public static void main(String[] args) {
        System.out.println("Input a match expression: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String s1 = solve(s);
        System.out.println(s1);
        StackOfIntegers stack = new StackOfIntegers(s1.length());
        for(int i=0;i<s1.length();i++){
            if(!check(s1.charAt(i))){
                stack.push(Integer.parseInt(""+s1.charAt(i)));
            }
            else{
                int a = stack.pop();
                int b = stack.pop();
                int tmp = 0;
                char c = s1.charAt(i);
                if(c=='+') tmp = a+b;
                if(c=='-') tmp = a-b;
                if(c=='*') tmp = a*b;
                if(c=='/') tmp = a/b;
                stack.push(tmp);
            }
        }
        System.out.println(stack.pop());
    }

    public static boolean check(char c){
        if(c=='+' || c=='-' || c == '*' || c == '/') return true;
        return false;
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
