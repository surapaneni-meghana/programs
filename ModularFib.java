/*
The Fibonacci numbers (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...) are defined by the recurrence:

- F0 = 0
- F1 = 1
- Fi = Fi−1 + Fi−2 for i > 1


Write a program which calculates Mn = Fn mod 2^m for given pair of n and m.

Note that a mod b gives the remainder when a is divided by b.

Input Format

Input consists of several lines specifying a pair of n and m.

Constraints

0 ≤ n ≤ 1000000
0 ≤ m < 20

Output Format

Output should be corresponding Mn, one per line.

Sample Input 0

11 7
11 6
Sample Output 0

89
25
*/

import java.io.*;
import java.util.*;
import java.lang.Math.*;
public class Solution {
    static int fib(int n){
        int c=1,f=0,a=0,b=1;
        if(n==0) return 0;
        else if(n==1) return 1;
        else{
            while(c!=n){
                f=a+b;
                a=b;
                b=f;
                c++;
            }
            return f;
        }
    }
    public static void main(String[] args){
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n,m;
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        m=sc.nextInt();
        try{
        while(s!=""){
             n=Integer.parseInt(s);
            int x=(int)Math.pow(2,m);
             int r=fib(n)%x;
            //int x=(int)r;
            System.out.println(r);
            s=sc.next();
             m=sc.nextInt();
        }
        }catch(Exception e){
            
        }
       
    }
}
