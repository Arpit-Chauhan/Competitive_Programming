import java.io.*;
import java.util.*;


public class VideoPosts {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = 1;
        while (tc-- > 0) {
            int n = sc.nextInt();
            int k= sc.nextInt();
            int arr[] = sc.readArray(n);
            long sum=0;
            for (int item:arr)
                sum+=item;
            long avg=sum/k;
            if (sum%k!=0)
                out.println("No");
            else{
                boolean flag=false;
                ArrayList<Integer> list=new ArrayList<>();
                int count=0;int tempsum=0;
                for (i = 0; i < n; i++) {
                    tempsum+=arr[i];
                    count++;
                    i++;
                    while (tempsum<avg){
                        tempsum+=arr[i];
                        count++;i++;
                        if (tempsum>avg){
                            flag=true;
                            break;
                        }
                    }
                    if(tempsum==avg) {
                        list.add(count);
                        count = 0;
                        tempsum = 0;
                        i--;
                    }
                    else{
                        System.out.println("No");
                        return;
                    }
                }
                out.println("Yes");
                for (int item: list)
                    out.print(item+" ");
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

        /*DEFINED BY ME*/

        //READING ARRAY
        int[] readArray(int n) {
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = nextInt();
            return arr;
        }

        //COLLECTIONS SORT
        void sort(int arr[]) {
            ArrayList<Integer> l = new ArrayList<>();
            for (int i : arr)
                l.add(i);
            Collections.sort(l);
            for (int i = 0; i < arr.length; i++)
                arr[i] = l.get(i);
        }

        //EUCLID'S GCD
        int gcd(int a, int b) {
            if (b != 0)
                return gcd(b, a % b);
            else
                return a;
        }
    }
}