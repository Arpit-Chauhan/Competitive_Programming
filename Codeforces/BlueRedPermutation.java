import java.io.*;
import java.util.*;


public class BlueRedPermutation {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int temp[] = sc.readArray(n);
            s = sc.nextLine();
            char temp2[] = s.toCharArray();
            int countblue=0;
            for (i = 0; i < n; i++)
                if (temp2[i]=='B')
                    countblue++;

            Pair arr[] = new Pair[n];
            for (i = 0; i < n; i++)
                arr[i] = new Pair(temp[i], temp2[i]);
            Arrays.sort(arr);
            Arrays.sort(arr,(a,b)->a.y-b.y);
            boolean flag=true;
            for (i = 0; i < countblue; i++) {
                if(arr[i].x<(i+1)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                for (i = countblue; i < n; i++) {
                    if (arr[i].x > (i + 1)) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag)
                out.println("YES");
            else
                out.println("NO");
//            for (Pair pr:arr)
//                out.print(pr.x+" ");
//            out.println();
        }
        out.close();
    }
	


/*--------------------------------------------------------
----------------------------------------------------------*/


    //Pair Class

    public static class Pair implements Comparable<Pair> {
        int x;
        char y;

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