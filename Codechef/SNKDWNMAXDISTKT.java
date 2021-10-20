import java.io.*;
import java.util.*;


public class SNKDWNMAXDISTKT {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            Pair arr[]=new Pair[n];
            for (i = 0; i < n; i++)
                arr[i]=new Pair(sc.nextInt());
            Pair temp[]=arr.clone();
            Arrays.sort(temp);
            int count=0;
            for (Pair tp:arr)
                if (tp.value==1)
                    count=1;
            Map<Pair,Integer> map=new HashMap<>();
            for (Pair it:temp){
                if (it.value==1) {
                    map.put(it, 1);
                    continue;
                }
                if (count>=it.value)
                    map.put(it,it.value);
                else{
                    map.put(it,it.value+count);
                    count++;
                }
            }
            for (Pair it:arr)
                out.print(map.get(it)+" ");
            out.println();
        }
        out.close();
    }
	


/*--------------------------------------------------------
----------------------------------------------------------*/


    //Pair Class

    public static class Pair implements Comparable<Pair> {
        int value;

        Pair(int value) {
            this.value = value;
        }

        @Override
        public int compareTo(Pair o) {
            return this.value - o.value;
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