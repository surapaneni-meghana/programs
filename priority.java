/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		PriorityQueue<Integer> arrL= new PriorityQueue<Integer>();
		arrL.add(10);
		arrL.add(5);
		arrL.add(20);
		Iterator<Integer> i=arrL.iterator();
		while(i.hasNext()){
		    System.out.print(i.next()+" ");
		}
		System.out.println();
		for(int a:arrL){
		    System.out.print(a+" ");
		}
		System.out.println();
		System.out.println(arrL);
	}
}
