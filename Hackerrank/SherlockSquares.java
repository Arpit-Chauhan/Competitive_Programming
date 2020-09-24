<<<<<<< HEAD
import java.util.Scanner;

public class SherlockSquares {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        
        Scanner sc=new Scanner (System.in);
        int t,count;
        long a,b;
        double n,x,m,f;
        count=0;
        
        t=sc.nextInt();
        
        while(t-->0) {
        a=sc.nextLong();
        b=sc.nextLong();
        
       x=Math.sqrt(a);
       n=(long)Math.ceil(x);
       m=(long)n*n;
       while(m<=b) {
    	   f=n++;
    	   m=(long)f*f;
    	   count++;
       }
        if(count>0)
        System.out.println(count-1);
        else
        	System.out.println("0");
        count=0;
        }
           sc.close();     
    }

}
=======
import java.util.Scanner;

public class SherlockSquares {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        
        Scanner sc=new Scanner (System.in);
        int t,count;
        long a,b;
        double n,x,m,f;
        count=0;
        
        t=sc.nextInt();
        
        while(t-->0) {
        a=sc.nextLong();
        b=sc.nextLong();
        
       x=Math.sqrt(a);
       n=(long)Math.ceil(x);
       m=(long)n*n;
       while(m<=b) {
    	   f=n++;
    	   m=(long)f*f;
    	   count++;
       }
        if(count>0)
        System.out.println(count-1);
        else
        	System.out.println("0");
        count=0;
        }
           sc.close();     
    }

}
>>>>>>> 20c77ecbb41f8662abb4a4de6e48dad11dca14bb
