import java.io.*;
import java.util.*;


public class UWCOI21B {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;


        n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = sc.readArray(n);
        int b[]=sc.readArray(m);
        
        Arrays.sort(arr);
        Arrays.sort(b);
        long ans=0;
        int len=n;
        for (i = 0; i < m; i++) {
            int count=0;
            if (arr[0]>b[i]){
                int temp=len-1;
                while(temp>0 && arr[temp]>b[i])
                    temp--;
                ans+=n+temp;
                continue;
            }
            for (j = 0; j < n; j++) {
                if (arr[j]>b[i])
                    count++;
                else
                    break;
            }
            len++;
            ans+=count;
        }
        out.println(ans);

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
            Collections.sort(l,Collections.reverseOrder());
            for (int i = 0; i < arr.length; i++)
                arr[i] = l.get(i);
        }
    }
}