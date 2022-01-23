import java.io.*;
import java.util.*;


public class MeximumArray {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int arr[] = sc.readArray(n);
            ArrayList<Integer> list=new ArrayList<>();
            int[] suff=new int[n];
            int mex=0;
            boolean[] vis=new boolean[(int)2e5+5];
            for ( i=n-1;i>=0;i--) {
                vis[arr[i]]=true;
                while(vis[mex])
                    mex++;
                suff[i]=mex;
            }
            mex=suff[0];
            Set<Integer> set=new HashSet<>();
            for (i=0;i<n;i++) {
                if (arr[i]<mex)
                    set.add(arr[i]);
                if (set.size()==mex){
                    list.add(mex);
                    if(i+1<n){
                        mex=suff[i+1];
                        set.clear();
                    }
                }
            }
            out.println(list.size());
            for(int it:list)
                out.print(it+" ");
            if (list.size()!=0)
            out.println();
        }
        out.close();
    }

    public static int getmex(int arr[],int i,int j){
        int hash[]=new int[1000000];
        for (int k=i;k<=j;k++){
            hash[arr[k]]++;
        }
        for (int k=0;k< hash.length;k++){
            if (hash[k]==0)
                return k;
        }
        return -1;
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