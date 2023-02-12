/*
Input Format

The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output:
For the first line, sum the lengths of A  and B.
For the second line, write Yes if A  is lexicographically greater than B otherwise print No instead.
For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space. */



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
       
        System.out.println(A.length()+B.length());
        int a =A.compareTo(B);
        if(a==1){
            System.out.println("Yes");
        }else System.out.println("No");
        String b = A.substring(0,1).toUpperCase();
        String m = A.substring(1,A.length());
        String n = b.concat(m);
        
        String d = B.substring(0,1).toUpperCase();
        String x = B.substring(1,B.length());
        String q = d.concat(x);
       
            System.out.println(n+" "+q);
        }
    }

