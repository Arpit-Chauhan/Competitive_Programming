import java.io.*;
import java.util.*;


public class PuzzleFromTheFuture {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, n, i, j;
        String s;

        tc = sc.nextInt();
        while (tc-- > 0) {
            n = sc.nextInt();
            s=sc.nextLine();
            char arr[]=s.toCharArray();
            StringBuilder str=new StringBuilder();
            StringBuilder ans=new StringBuilder();
            ans.append('1');
            if (arr[0]=='1')
                str.append('2');
            else
                str.append('1');

            for (i = 1; i <n ; i++) {
                if (arr[i]=='1' && str.charAt(str.length()-1)=='2') {
                    ans.append('0');
                    str.append('1');
                }
                else if (arr[i]=='1' && str.charAt(str.length()-1)!='2') {
                    ans.append('1');
                    str.append('2');
                }
                else if (arr[i]=='0' && str.charAt(str.length()-1)=='2'){
                    ans.append('1');
                    str.append('1');
                }
                else if (arr[i]=='0'  && str.charAt(str.length()-1)=='1'){
                    ans.append('0');
                    str.append('0');
                }
                else if (arr[i]=='0' && str.charAt(str.length()-1)=='0'){
                    ans.append('1');
                    str.append('1');
                }
            }
            out.println(ans);
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