# technojam-tasks-DSA-Java
Q1 :
    Approach : I didn't know what Pascal's triangles were, so I searched, and made myself familiar with them. Next, I came to know that, aside from the conventional method, a number at (n,k) index could be given by
    the mathematical formula Num(n,k) = C(n,k) = n!/(k!*(n-k)!) where;
    n : index of row
    k : index of column
    both starting from '0'.
    I decided to implement this formula, used multiple for loops as multiple factorials needed to be calculated, and successfully implemented it.

    Challenges : 1. traversal in for loops to print spaces and numbers seemed very easy if we could initialize the iterator with '1' value but the formula worked only if the indexes were to start from '0'.
                 2. In the first run, the output was :           1 1
                                                                1 2 1
                                                               1 3 3 1 
                                                              1 4 6 4 1 
                                                            1 5 10 10 5 1
                   I went back to the code, re reading it, lost the track of the actual problem, and fixed certain other things I found that weren't expected, and forgot that I had to see why the first row
                   didn't appear, re-ran the code, totally forgetting my problem, and it worked fine this time.
                   Checked for the most optimal method, they used conventional method to find an element at a place in a row, and had done it in n2 and n2 time and space complexity respectively.
                   Mine takes n3 time and 1 space.
Q4 : 
    Approach : This is a question I've already seen on Leetcode, so it was easy to figure out.

P.S : I'm Abhay, a third sem student. I've recently started learning DSA, so gave a try to the problems I thought were the easiest. My DSA journey is going great, I love doing 
leetcode problems. I've recently started taking part in Hackerrank competitions to become familiar with the environment, although i couldn't solve a single problem when I tried the last time.
I am currently learning Web dev too, and I watch videos related to computer tech in my spare time. I like exploring things. Joining different disciplines is my ability. I can think deeply about situations and come 
up with useful  insights.  I hope I'd get selected to join Technojam, and meet  with inspiring people there, and make my learning enjoyable where I'd collaborate with innovative and welcoming peers.
I am excited to join Technojam.
