import java.io.*;
import java.util.*;


public class Median {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;

        n = sc.nextInt();
        int x= sc.nextInt();
        int arr[] = sc.readArray(n);
        List<Integer> list =new ArrayList<>();

        for (i = 0; i < n; i++)
            list.add(arr[i]);

        int count;
        if (list.contains(x))
             count=0;
        else {
            list.add(x);
            count = 1;
        }

        Collections.sort(list);
        int req=(int) Math.floor((list.size()+1)/2.0);
        int pos=-1;
        for (i = 0; i < list.size(); i++) {
            if (list.get(i)==x) {
                pos = i;
                break;
            }
        }
        while(list.get(req-1)!=x){
            if (pos<req){
                list.add(1);
                count++;
            }
            else{
                list.add(Integer.MAX_VALUE);
                count++;
            }
            Collections.sort(list);
            req=(int) Math.floor((list.size()+1)/2.0);
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