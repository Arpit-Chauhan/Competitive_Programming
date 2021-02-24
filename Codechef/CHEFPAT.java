import java.io.*;
import java.util.*;


public class CHEFPAT {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int arr[] = sc.readArray(n);
            int b[]= Arrays.copyOf(arr,n);
            sc.sort(b);
            boolean vis[]=new boolean[n];
            int count=1;
            int ans[]=new int[n];
            Map<Integer,Integer> map=new HashMap<>();
            for (i = 0; i < n; i++) {
                map.put(b[i],count);
                count++;
            }
            for (i = 0; i < n; i++)
                ans[i]=map.get(arr[i]);

            Map<Integer,Integer> map2=new HashMap<>();
            for (i = n-1; i >=0 ; i--) {
                if (map2.containsKey(ans[i])) {
                    map2.put(ans[i],map2.get(ans[i]) + 1);
                    ans[i]=ans[i]-map2.get(ans[i])+1;
                }
                else
                    map2.put(ans[i],1);
            }
            for (i = 0; i < n; i++) {
                out.print(ans[i]+" ");
            }
            out.println();
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
            Collections.sort(l,Collections.reverseOrder());
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