import java.io.*;
import java.util.*;


public class UniqueBidAuction_686 {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;

        t = sc.nextInt();
        while (t-->0) {
            n = sc.nextInt();
            int arr[] = sc.readArray(n);
            int b[] = Arrays.copyOf(arr, n);
            Map<Integer,Integer> map=new HashMap<>();
            for (i = 0; i < n; i++)
                map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            int min=Integer.MAX_VALUE;
            int flag=0;
            for (int k:map.keySet()){
                int val=map.get(k);
                if (val==1){
                    min=Math.min(min,k);
                    flag=1;
                }
            }
            if (flag==0)
                out.println(-1);
            else{
                for (i = 0; i < n; i++) {
                    if (arr[i]==min){
                        out.println(i+1);
                        break;
                    }
                }
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

        /*DEFINED BY ME
         */
        int[] readArray(int n) {

            int arr[] = new int[n];

            for (int i = 0; i < n; i++)
                arr[i] = nextInt();

            return arr;
        }

        void sort(int arr[]) {
            ArrayList<Integer> l = new ArrayList<>();
            for (int i : arr)
                l.add(i);
            Collections.sort(l);
            for (int i = 0; i < arr.length; i++)
                arr[i] = l.get(i);
        }
    }
}