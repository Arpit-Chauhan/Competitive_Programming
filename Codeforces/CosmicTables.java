import java.io.*;
import java.util.*;


public class CosmicTables {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;

        int r = sc.nextInt();
        int c = sc.nextInt();
        int q = sc.nextInt();

        int arr[][]=new int[r][c];

        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        int row[]=new int[r];
        int col[]=new int[c];

        for (i = 0; i < r; i++)
            row[i]=i;
        for (i = 0; i < c; i++)
            col[i]=i;

        while(q-->0){
            char k=sc.next().charAt(0);
            int x=sc.nextInt();
            int y= sc.nextInt();
            if (k=='c'){
                int temp=col[x-1];
                col[x-1]=col[y-1];
                col[y-1]=temp;
            }
            else if (k=='r'){
                int temp=row[x-1];
                row[x-1]=row[y-1];
                row[y-1]=temp;
            }
            else
                out.println(arr[row[x-1]][col[y-1]]);

        }

        out.println();

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