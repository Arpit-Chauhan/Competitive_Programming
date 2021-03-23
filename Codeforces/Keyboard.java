import java.io.*;
import java.util.*;


public class Keyboard {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;
        char arr[][]={{'q','w','e','r','t','y','u','i','o','p'},{'a','s','d','f','g','h','j','k','l',';'},{'z','x','c','v','b','n','m',',','.','/'}};
        p=sc.nextLine().charAt(0);
        s= sc.nextLine();
        StringBuilder ans=new StringBuilder();
        for (int k=0;k<s.length();k++) {
            char mat=s.charAt(k);
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 10; j++) {
                    if (arr[i][j] ==mat){
                        if (p=='R')
                            ans.append(arr[i][j-1]);
                        else
                            ans.append(arr[i][j+1]);
                    }
                }
            }
        }
            out.println(ans);

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