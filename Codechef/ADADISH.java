import java.io.*;
import java.util.*;


public class ADADISH {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;

        t = sc.nextInt();
        while (t-->0) {
            n = sc.nextInt();
            List<Integer> list=new ArrayList<>();

            for (i = 0; i < n; i++)
                list.add(sc.nextInt());

            int total,remt;
            Collections.sort(list);

            if (list.size()==1)
                out.println(list.get(0));
            else if (list.size()==2)
                out.println(list.get(1));
            else if (list.size()==3) {
                remt = list.get(2) - list.get(1);
                if (list.get(0) < remt)
                    list.set(0, 0);
                else
                    list.set(0, list.get(0) - remt);
                total = list.get(2) + list.get(0);
                out.println(total);
//                for (i = list.size() - 1; i > 0; i-=2) {
//                    j=i-1;
//                    if (i!=1 || n!=3) {
//                        remt = list.get(i) - list.get(j);
//                        list.set(i-2, list.get(i-2) - remt);
//                        total += list.get(i);
//                    }
            }
            else{
                remt = list.get(3) - list.get(2);
                if (list.get(1) < remt) {
                    remt=remt- list.get(1);
                    list.set(1, 0);
                }
                else {
                    list.set(1, list.get(1) - remt);
                    remt=0;
                }
                if (list.get(1)==0 && list.get(0) < remt)
                    list.set(0, 0);
                else
                    list.set(0,list.get(0)-remt);

                if (list.get(0)==0)
                    total=list.get(3);
                else
                    total=list.get(3)+Math.max(list.get(0),list.get(1));
                out.println(total);
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