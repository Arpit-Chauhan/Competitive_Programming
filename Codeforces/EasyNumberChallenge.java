import java.io.*;
import java.util.*;

/*
*
* TLE
*
* */
public class EasyNumberChallenge {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j,k;
        String s;
        int a= sc.nextInt();
        int b= sc.nextInt();int c= sc.nextInt();
        long sum=0;
        List<Integer> list=new ArrayList<>();
        long mod=1073741824;
        for (i = 1; i <=a ; i++) {
            for (j = 1; j <=b ; j++) {
                for (k = 1; k <=c ; k++)
                    list.add(i*j*k);
            }
        }
        for (i = 0; i < list.size(); i++) {
            long count=0;
            long num=list.get(i);
            for (j = 1; j <=(long)Math.sqrt(num) ; j++) {
              if (num%j==0){
                  if (num/j==j)
                      count++;
                  else
                      count+=2;
              }
            }
            sum+=count;
        }
        out.println(sum%mod);

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