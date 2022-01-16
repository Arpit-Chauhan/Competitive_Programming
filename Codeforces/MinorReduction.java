import java.io.*;
import java.util.*;


public class MinorReduction {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = sc.nextInt();
        while (tc-- > 0) {
            s= sc.nextLine();
            int n=s.length();
            int pos=-1;
            StringBuilder ans=new StringBuilder(s);
            boolean flag=false;
            for (i = n-1; i >0; i--) {
                int tmp=Character.getNumericValue(s.charAt(i));
                int tmp2=Character.getNumericValue(s.charAt(i-1));
               int  sum=tmp+tmp2;
                if (sum>=10) {
                    char te=Integer.toString(sum%10).charAt(0);
                    char te2=Integer.toString(sum/10).charAt(0);
                    ans.setCharAt(i-1,te2);
                    ans.setCharAt(i,te);
                   flag=true;
                   out.println(ans);
                   break;
                }
            }
            if (!flag){
                StringBuilder tmmp=new StringBuilder();
                int tmp=Character.getNumericValue(s.charAt(0));
                int tmp2=Character.getNumericValue(s.charAt(1));
                int  sum=tmp+tmp2;
                char te=Integer.toString(sum).charAt(0);
                tmmp.append(te);
                for (i = 2; i <n ; i++) {
                    tmmp.append(s.charAt(i));
                }
                out.println(tmmp);
//                ans.append(te);
//                ans.deleteCharAt(0);
//                ans.deleteCharAt(0);
            }
//            out.println(ans);
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