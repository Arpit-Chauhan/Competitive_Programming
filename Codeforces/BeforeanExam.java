import java.io.*;
import java.util.*;


public class BeforeanExam {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc =1;
        while (tc-- > 0) {
            int d = sc.nextInt();
            int sum= sc.nextInt();
            Pair arr[]=new Pair[d];
            int ans[]=new int[d];
            for (i = 0; i < d; i++)
                arr[i]=new Pair(sc.nextInt(), sc.nextInt());
            int maxsum=0,minsum=0;
            for (i = 0; i < d; i++) {
                maxsum+=arr[i].y;
                minsum+=arr[i].x;
            }
            if (sum>maxsum || sum<minsum)
            out.println("NO");
            else{
                out.println("YES");
                for (i = 0; i < d; i++) {
                    ans[i]=arr[i].x;
                    sum-=arr[i].x;
                }
                if (sum!=0){
                    for (i = 0; i < d; i++) {
                        int temp=ans[i];
                       ans[i]=Math.min(arr[i].y,sum+ans[i]);
                       sum-=ans[i]-temp;
                       if (sum==0)
                           break;
                    }
                }
                for (int it:ans)
                    out.print(it+" ");
                out.println();
            }
        }
        out.close();
    }
	


/*--------------------------------------------------------
----------------------------------------------------------*/


    //Pair Class

    public static class Pair implements Comparable<Pair> {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Pair o) {
            return this.x - o.x;
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
    }
}