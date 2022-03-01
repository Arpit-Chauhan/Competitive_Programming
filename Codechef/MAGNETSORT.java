import java.io.*;
import java.util.*;


public class MAGNETSORT {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int arr[] = sc.readArray(n);
            s=sc.nextLine();
            int sorted[]=arr.clone();
            sc.sort(sorted);
            boolean flag=false;
            if(isSorted(arr))
                out.println(0);
            else {
                boolean flag2=false;
                int count = 0;
                for(i=0;i<n;i++)
                    if (s.charAt(i) == 'N')
                        count++;

                if(count == n || count == 0){
                    out.println(-1);
                    flag2=true;

                }
                if(!flag2) {
                    int start = Integer.MAX_VALUE, last = Integer.MIN_VALUE;
                    for (i = 0; i < n; i++) {
                        if (arr[i] != sorted[i]) {
                            start = Math.min(i, start);
                            last = Math.max(last, i);

                        }
                    }
                    boolean f1 = false, f2 = false;
                    for (i = 0; i < start; i++)
                        if (s.charAt(i) != s.charAt(last))
                            f1 = true;
                    for (i = last; i < n; i++)
                        if (s.charAt(i) != s.charAt(start))
                            f2 = true;
                    if (s.charAt(start) != s.charAt(last) || f1 || f2)
                        out.println(1);
                    else
                        out.println(2);
                }
            }
        }
        out.close();
    }
	

 public static boolean isSorted(int arr[]){
        for(int i=1;i<arr.length;i++){
            if (arr[i]<arr[i-1])
                return false;
        }
        return true;
}
/*--------------------------------------------------------
----------------------------------------------------------*/


    //Pair Class

    public static class Pair implements Comparable<Pair> {
        int x;char y;
        Pair(int x, char y) {
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