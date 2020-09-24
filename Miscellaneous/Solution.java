import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc= new Scanner(System.in);
        
        int i,n,q;
        n=sc.nextInt();
        int arr[]=new int[n];
        int ps[]=new int[n];
        int sum=0;
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
         sum+=arr[i];
            ps[i]=sum;
        }
        q=sc.nextInt();
        while(q-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            
            if(x==1) {
                System.out.println(ps[y-2]);
                continue;
            }
            if(x<y)
                System.out.println(ps[y-2]-ps[x-2]);
            if(y<x)
            	System.out.println(ps[x-1]-ps[y-1]);
        }
        sc.close();
    }
}