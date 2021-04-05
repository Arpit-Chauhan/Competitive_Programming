import java.io.*;
import java.util.*;


public class TshirtsfromSponsor {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;
        Map<String,Integer> map=new HashMap<>();
        map.put("S",1);map.put("M",2);map.put("L",3);map.put("XL",4);map.put("XXL",5);
        tc = 1;
        while (tc-- > 0) {
            int arr[]=new int[6];
            for (i = 1; i <6 ; i++)
                arr[i]=sc.nextInt();
            int n=sc.nextInt();
            while (n-->0){
                s=sc.nextLine();
                int value= map.get(s);
                if (arr[value]>0) {
                    out.println(s);
                    arr[value]--;
                }
                else {
                    int res=Integer.MAX_VALUE;
                    int pos=-1;
                    for (i = (value+1)%6; i != value ; i = ((i+1) % 6))
                        if (arr[i]>0) {
                            if (Math.abs(value - i)<res) {
                                pos=i;
                                res = Math.min(Math.abs(value - i), res);
                            }
                        }
                    out.println(getKey(map,pos));
                    arr[pos]--;
                }
            }
        }
        out.close();
    }

    public static <K, V> K getKey(Map<K, V> map, V value)
    {
        for (Map.Entry<K, V> entry: map.entrySet())
        {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
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