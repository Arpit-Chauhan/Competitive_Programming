import java.io.*;
import java.util.*;


public class FEMA2 {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;

        t = sc.nextInt();
        while(t-->0) {
            n = sc.nextInt();
            int k= sc.nextInt();
            s= sc.nextLine();
            int count=0,cs,flagm=0,flagi=0;
            int power;
            boolean ip=false,mp=false;
            while(flagm<n && flagi<n){
                if (s.charAt(flagm)=='M'){
                    cs=0;
                    if (s.charAt(flagi)=='I'){
                        for (i = Math.min(flagi,flagm); i <Math.max(flagm,flagi) ; i++) {
                            if (s.charAt(i)==':')
                                cs++;
                        }
                        power=k+1-Math.abs(flagi-flagm)-cs;
                        if (power>0){
                            count++;flagi++;flagm++;
                        }
                        else if (flagi<flagm)
                            flagi++;
                        else
                            flagm++;
                    }
                    else if (s.charAt(flagi)=='X'){
                        flagm=flagi;
                        flagm++;flagi++;
                    }
                    else
                        flagi++;
                }
                else if (s.charAt(flagm)=='X'){
                    flagi=flagm;
                    flagi++;
                    flagm++;
                }
                else
                    flagm++;
            }
            out.println(count);
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