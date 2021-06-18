/*Marc loves cupcakes, but he also likes to stay fit. He eats n cupcakes in one sitting, and each cupcake i has a calorie count c[i] . After eating a cupcake with c calories, he must walk at least 2^j * c (where j is the number cupcakes he has already eaten) miles to maintain his weight.

Given the individual calorie counts for each of the cupcakes, find and print a long integer denoting the minimum number of miles Marc must walk to maintain his weight. Note that he can eat the cupcakes in any order.

Notes: Has to be done greedily so that you have to burn as less calories as possible

Input Format

The first line contains an integer, N , denoting the number of cupcakes. The second line contains N space-separated integers describing the respective calorie counts of each cupcake,c[1]...c[n].

Constraints

1<=n<=40 1<=ci<=1000

Output Format

Print a long integer denoting the minimum number of miles Marc must walk to maintain his weight.

Sample Input 0

3
1 3 2
Sample Output 0

11
*/

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    int n;
    scanf("%d",&n);
    int cup[n];
    for(int i=0;i<n;i++)
        scanf("%d",&cup[i]);
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(cup[i]>=cup[j]){
                int t=cup[i];
                cup[i]=cup[j];
                cup[j]=t;
            }
        }
    }
    long r=0;
    for(int i=0;i<n;i++){
        r=r+pow(2,i)*cup[i];
    }
    printf("%li",r);
    return 0;
}
