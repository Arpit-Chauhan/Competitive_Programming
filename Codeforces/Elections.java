import java.io.*;
import java.util.*;


public class Elections {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = sc.nextInt();
        while (tc-- > 0) {
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();
            long max=Math.max(a,Math.max(b,c));
            if (a==b && b==c)
                out.println(1+" "+1+" "+1);
            else {
                boolean flag=false;
                if ((a==max && b==max) || (a==max && c==max))
                    flag=true;
                else if ((b==max && c==max))
                    flag=true;
                long temp=max;
                if (flag)
                    max++;
                if (a == temp)
                    out.print(max-a + " ");
                else {
                    if (!flag)
                    out.print(max - a + 1 + " ");
                    else
                        out.print(max - a + " ");
                }
                if (b == temp)
                    out.print(max-b + " ");
                else {
                    if (!flag)
                        out.print(max - b+ 1 + " ");
                    else
                        out.print(max - b + " ");
                }
                if (c == temp)
                    out.print(max-c + " ");
                else {
                    if (!flag)
                        out.print(max - c + 1 + " ");
                    else
                        out.print(max - c + " ");
                }
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

        void swap(int arr[], int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}