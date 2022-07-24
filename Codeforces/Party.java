import java.io.*;
import java.util.*;


public class Party {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m= sc.nextInt();
            int arr[] = sc.readArray(n);
            Pair pr[]=new Pair[m];
            int freq[]=new int[n];
            int ans=Integer.MAX_VALUE;
            for (i = 0; i < m; i++) {
                pr[i] = new Pair(sc.nextInt(), sc.nextInt());
                freq[pr[i].x-1]++;
                freq[pr[i].y-1]++;
            }
            if (m%2==0)
                out.println(0);
            else{
                for (i = 0; i < n; i++) {
                    if (freq[i]%2!=0)
                        ans=Math.min(arr[i],ans);
                }
                for (i = 0; i < m; i++) {
                    if(freq[pr[i].x-1]%2==0 && freq[pr[i].y-1]%2==0) {
                        int temp=arr[pr[i].x-1]+arr[pr[i].y-1];
                        ans = Math.min(ans,temp);
                    }
                }
                out.println(ans);
            }
        }
        out.close();
    }
	


/*--------------------------------------------------------
----------------------------------------------------------*/


    //Pair Class

    public static class Pair  {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

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

        void swap(int arr[], int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}