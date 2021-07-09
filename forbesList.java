/*
Forbes has a list of people and their wealth.

You have been hired as an intern and as a first task you have been asked to write a program such that given a list of amount of wealth of N people, after each element in the list print the top 3 richest people's amount of wealth.

If there are less than three people in the list currently, you can print -1.

See the sample test case for clarity.

NOTE : You are expected to use the maxHeap data structure to solve this problem

INPUT

First line contains the number of people N(1 <= N <= 10^5). Next N line contains the wealth of the N people each. Line number i + 1 will have the amount of wealth that the ith person has. (1 <= wealth <= 10^6)

OUTPUT

After every element of the list print the top three richest people's amount of money.

If there are less than three people in the list then print -1.

Sample Input 0

5
1
2
3
4
5
Sample Output 0

-1
-1
3 2 1
4 3 2
5 4 3
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        TreeSet<Integer> ts=new TreeSet<Integer>(new Comparator<Integer>()
          {
              public int compare(Integer i1,Integer i2){
                    return i2.compareTo(i1);
              }
          }
        );
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            ts.add(sc.nextInt());
            if(i<2) System.out.println("-1");
            else{
                Iterator<Integer> it=ts.iterator();
                System.out.println(it.next()+" "+it.next()+" "+it.next());
            }
        }
    }
}
