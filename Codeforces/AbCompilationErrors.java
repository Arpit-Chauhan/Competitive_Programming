import java.io.*;
import java.util.*;


public class AbCompilationErrors {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = 1;
        while (tc-- > 0) {
            int n = sc.nextInt();
            int arr[] = sc.readArray(n);
            int b[]=sc.readArray(n-1);
            int c[]=sc.readArray(n-2);
            Map<Integer,Integer> map=new HashMap<>();
            Map<Integer,Integer> map2=new HashMap<>();
            Map<Integer,Integer> map3=new HashMap<>();
            for (i = 0; i < n; i++)
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            for (i = 0; i < n-1; i++)
                map2.put(b[i],map2.getOrDefault(b[i],0)+1);
            for (i = 0; i < n-2; i++)
                map3.put(c[i],map3.getOrDefault(c[i],0)+1);
            int first=disappear(map,map2);
            int second=disappear(map2,map3);
            out.println(first);
            out.println(second);
        }
        out.close();
    }
	

    static int disappear(Map<Integer,Integer> map,Map<Integer,Integer> map2){
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int val=entry.getValue();
            if (!map2.containsKey(entry.getKey()))
                return entry.getKey();
            else {
                int val2=map2.get(entry.getKey());
                if (val!=val2)
                    return entry.getKey();
            }
        }
        return 0;
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