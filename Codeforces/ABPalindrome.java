import java.io.*;
import java.util.*;


public class ABPalindrome {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = sc.nextInt();
        while (tc-- > 0) {
            int a = sc.nextInt();
            int b= sc.nextInt();
            s= sc.nextLine();
            int n=a+b;
            StringBuilder ans=new StringBuilder();
            StringBuilder temp;

            for (i = 0; i <n; i++) {
                ans.append(s.charAt(i));
                if (s.charAt(i)=='0')
                    a--;
                else if (s.charAt(i)=='1')
                    b--;
            }

            boolean flag=false;
            for (i = 0; i <n/2 ; i++) {
                if (ans.charAt(i)=='?' && ans.charAt(n-i-1)=='?')
                    continue;
                else if (ans.charAt(i)=='0' && ans.charAt(n-i-1)=='?'){
                    if(a>0) {
                        ans.setCharAt(n - i - 1, '0');
                        a--;
                    }
                }
                else if (ans.charAt(i)=='1' && ans.charAt(n-i-1)=='?'){
                    if(b>0) {
                        ans.setCharAt(n - i - 1, '1');
                        b--;
                    }
                }
                else if(ans.charAt(i) == '?')
                {
                    if(ans.charAt(n-i-1) == '0'){
                        a -= 1;
                        ans.setCharAt(i, '0');
                    }
                    else{
                        b-=1;
                        ans.setCharAt(i,'1');
                    }
                }
                else if (ans.charAt(i)!=ans.charAt(n-i-1) || (a<0 ||b<0)){
                    flag=true;
                    break;
                }
            }
            if (flag)
                out.println(-1);
            else{
                for (i = 0; i < n/2; i++) {
                    if (ans.charAt(i)=='?' && ans.charAt(n-i-1)=='?'){
                        if (a>=2){
                            ans.setCharAt(i,'0');
                            ans.setCharAt(n-i-1,'0');
                            a-=2;
                        }
                        else if (b>=2){
                            ans.setCharAt(i,'1');
                            ans.setCharAt(n-i-1,'1');
                            b-=2;
                        }
                        else if(a<0 || b<0){
                            flag=true;
                            out.println(-1);
                            break;
                        }
                    }
                }
                if(n%2==1){
                    if (ans.charAt(n/2)=='?'){
                        if (a>0) {
                            ans.setCharAt(n / 2, '0');
                            a--;
                        }
                        else if (b>0) {
                            ans.setCharAt(n / 2, '1');
                            b--;
                        }
                        else
                            flag=true;
                    }
                }
                if (!flag && a==0 && b==0){
                    temp=ans.reverse();
                    String an=new String(temp);
                    String bn=new String(ans);
                    if (an.equals(bn))
                        out.println(ans);
                    else
                        out.println(-1);
                }
                else
                    out.println(-1);
            }
        }
        out.close();
    }


    /*
		FASTREADER
	*/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        /*DEFINED BY ME*/

        //READING ARRAY
        int[] readArray(int n) {
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = nextInt();
            return arr;
        }

        //COLLECTIONS SORT
        void sort(int arr[]) {
            ArrayList<Integer> l = new ArrayList<>();
            for (int i : arr)
                l.add(i);
            Collections.sort(l);
            for (int i = 0; i < arr.length; i++)
                arr[i] = l.get(i);
        }

        //EUCLID'S GCD
        int gcd(int a, int b) {
            if (b != 0)
                return gcd(b, a % b);
            else
                return a;
        }
    }
}