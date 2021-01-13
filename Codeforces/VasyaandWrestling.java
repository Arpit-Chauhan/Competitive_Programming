import java.io.*;
import java.util.*;


public class VasyaandWrestling {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, n, i, j;
        String s;

        tc = sc.nextInt();
        long sumf = 0, sums = 0;
        StringBuilder strf = new StringBuilder();
        StringBuilder strs = new StringBuilder();
        List<Integer> list=new ArrayList<>(), list2=new ArrayList<>();
        boolean flag = false;
        while (tc-- > 0) {
            n = sc.nextInt();
            if (n > 0) {
                sumf += n;
                list.add(n);
                flag = true;
            } else {
                sums += Math.abs(n);
                list2.add(Math.abs(n));
                flag = false;
            }
        }
            if (sumf>sums)
                out.println("first");
            else if (sums>sumf)
                out.println("second");
            else{
                boolean flag2=false;
                for (i = 0; i < Math.min(list.size(),list2.size()); i++) {
                    if (list.get(i)>list2.get(i)){
                        out.println("first");
                        flag2=true;
                        break;
                    }
                    else if (list2.get(i)>list.get(i)){
                        out.println("second");
                        flag2=true;
                        break;
                    }
                }
                if(!flag2){
                    if (flag)
                        out.println("first");
                    else
                        out.println("second");
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
        public static int gcd(int a, int b) {
            if (b != 0)
                return gcd(b, a % b);
            else
                return a;
        }
    }
}