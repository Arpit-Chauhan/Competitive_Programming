import java.io.*;
import java.util.*;


public class AlmostRectangle_713 {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            char arr[][]=new char[n][n];
            for (i = 0; i < n; i++)
                arr[i]=sc.nextLine().toCharArray();
            int rf=-1,cf=-1,rs=-1,cs=-1;
            boolean flag=false;
            for (i = 0; i < n; i++)
                for (j = 0; j < n; j++) {
                    if (arr[i][j] == '*') {
                        if (!flag) {
                            rf = i;
                            cf = j;
                            flag=true;
                        } else {
                            rs = i;
                            cs = j;
                        }
                    }
                }

            if (rf==rs){
                boolean done=false;
                for (i = 0; i < n; i++) {
                    for (j = 0; j < n; j++) {
                        if (i!=rf){
                            arr[i][cf]='*';
                            arr[i][cs]='*';
                            done=true;
                            break;
                        }
                    }
                    if(done)
                        break;
                }
            }
            else if (cf==cs){
                boolean done=false;
                for (i = 0; i < n; i++) {
                    for (j = 0; j < n; j++) {
                        if (j!=cs){
                            arr[rf][j]='*';
                            arr[rs][j]='*';
                            done=true;
                            break;
                        }
                    }
                    if (done)
                        break;
                }
            }
            else{
                arr[rf][cs]='*';
                arr[rs][cf]='*';
            }

            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    out.print(arr[i][j]);
                }
                out.println();
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