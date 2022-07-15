import java.io.*;
import java.util.*;


public class MarkAndHisUnfinishedEssay {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = sc.nextInt();
        while (tc-- > 0) {
            long n = sc.nextLong();
            long c=sc.nextLong();
            long q=sc.nextLong();
            s=sc.nextLine();

            ArrayList<long[]> temp = new ArrayList<>();
            temp.add(new long[]{0,n-1,0,n-1});

            long stor=n;
            while(c-->0){
                long l= sc.nextLong();
                long r=sc.nextLong();
                l--;r--;
                temp.add(new long[]{stor,stor+r-l,l,r});
                stor+=r-l+1;
            }
            boolean flag=false;
            for (i = 0; i < q; i++) {
                long k=sc.nextLong();
                k--;
                if(k<s.length())
                    out.println(s.charAt((int) k));
                else
                    out.println(sc.solve(temp,k,s));
            }
        }
        out.close();
    }
	


/*--------------------------------------------------------
----------------------------------------------------------*/


    //Pair Class

    public static class Pair implements Comparable<Pair> {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Pair o) {
            return this.x - o.x;
        }
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

        public static char solve(ArrayList<long[]> list,long k,String s){
            if(k<0)
                return '*';
            else if(k<s.length())
                return s.charAt((int)k);
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i)[0]<=k && list.get(i)[1]>=k){
                    return solve(list,list.get(i)[2]+k-list.get(i)[0],s);
                }
            }
            return '*';
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

        void swap(int arr[], int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}