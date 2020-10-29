import java.io.*;
import java.util.*;


public class LittlePigsandWolves {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;

        n = sc.nextInt();
        int m = sc.nextInt();
        char arr[][] =new char[n][m];
        for (i = 0; i < n; i++)
            arr[i]=sc.nextLine().toCharArray();

        int count=0;
        for (i = 0; i < n; i++) {
            for (j = 0; j <m ; j++) {
                char p=arr[i][j];
                if (p=='W'){
                    if( i>0 && arr[i-1][j]=='P'  )
                    {
                        arr[i-1][j]='.';
                        count++;
                    }
                    else if((i+1)<n && arr[i+1][j]=='P')
                    {
                        arr[i+1][j]='.';
                        count++;
                    }
                    else if(j>0 && arr[i][j-1]=='P' )
                    {
                        arr[i][j-1]='.';
                        count++;
                    }
                    else if((j+1)<m && arr[i][j+1]=='P' )
                    {
                        arr[i][j+1]='.';
                        count++;
                    }
                }
            }
        }
        out.println(count);
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