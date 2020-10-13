import java.io.*;
import java.util.*;


public class Sail {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, sx,sy,ex,ey, i, j;
        String s;
        String fx="",fy="";
        int flag=0;
        t = sc.nextInt();
        sx=sc.nextInt();
        sy=sc.nextInt();
        ex=sc.nextInt();
        ey=sc.nextInt();
        s=sc.nextLine();
        if (sx<ex) fx="E";
        if (sx>ex) fx="W";
        if (sy<ey) fy="N";
        if (sy>ey) fy="S";

        if (sx==ex && sy==ey)
            out.println(0);
        else {
            for (i = 0; i < t; i++) {
                if (sx!=ex && String.valueOf(s.charAt(i)).equals(fx) && fx.equals("E"))
                    sx++;
                if (sx!=ex && String.valueOf(s.charAt(i)).equals(fx) && fx.equals("W"))
                    sx--;
                if (sy!=ey && String.valueOf(s.charAt(i)).equals(fy) && fy.equals("N"))
                    sy++;
                if (sy!=ey && String.valueOf(s.charAt(i)).equals(fy) && fy.equals("S"))
                    sy--;
                if (sx==ex && sy==ey){
                    flag=1;
                    break;
                }
            }
            if (flag==1)
                out.println(i+1);
            else
                out.println(-1);
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