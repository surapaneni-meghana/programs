/*
Given an array of N integers, your task is to print the highest possible product by multiplying any three numbers from the array.

Input Format

First line contains an integer N.
Next line contains N space separated integers.

Constraints

1 <= N <= 106
0 <= |Ai| <= 103

Output Format

Output one numbers, the maximum product.

Sample Input 0

6
0 -1 3 100 70 50
Sample Output 0

350000
*/

# Enter your code here. Read input from STDIN. Print output to STDOUT
n=int(input())
l=list(map(int,input().split()))
l.sort(reverse=True)
x=l[0]*l[1]*l[2]
print(x)
