
import java.io.*;
import java.util.*;


public class Knapsack {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;

        t = sc.nextInt();
        while (t-->0) {
            n = sc.nextInt();
            long w= sc.nextLong();
            int arr[] = sc.readArray(n);
            long half=(long)Math.ceil(w/2.0);
            long sum=0;
            int flag=0,flag2=0;
            for (i = 0; i < n; i++) {
                if (arr[i]>=half && arr[i]<=w) {
                    flag = 1;
                    out.println(1+"\n"+(i+1));
                    break;
                }
            }
            if (flag!=1){
                List<Integer> list=new ArrayList<>();
                for (i = 0; i < n; i++) {
                    long temp=sum+arr[i];
                    if (temp>=half && temp<=w){
                        list.add(i+1);
                        flag2=1;
                        out.println(list.size());
                        for (int item:list)
                            out.print(item+" ");
                        out.println();
                        break;
                    }
                    else if (temp<half){
                        list.add(i+1);
                        sum+=arr[i];
                    }
                }
                if (flag2!=1)
                    out.println(-1);
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