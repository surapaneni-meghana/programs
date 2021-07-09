'''
You are given a simple task, given a string S, find all the possible distinct permutations of the string.

Print all the distinct permutations of the string S, one on each line and in lexicographic order.

Input Format

Only one string S.

Constraints

1 <= S.length <= 8

Output Format

Print all the possible distinct permutations of the given string in lexicographic order.

Sample Input 0

ABC
Sample Output 0

ABC
ACB
BAC
BCA
CAB
CBA
'''

from itertools import permutations
s=input()
t=set()
s=sorted(s)
perm = permutations(s)
for i in list(perm):
    x=''.join(i)
    if x not in t:
        t.add(x)
        print(x)
