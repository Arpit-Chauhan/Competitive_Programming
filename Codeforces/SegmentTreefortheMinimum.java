import java.io.*;
import java.util.*;


public class SegmentTreefortheMinimum {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = 1;
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m=sc.nextInt();
            int arr[] = sc.readArray(n);
            int tree[]=new int[4*n];
            cst(tree,0,n-1,0,arr);
            while(m-->0){
                int type=sc.nextInt();
                int li=sc.nextInt();
                int rv=sc.nextInt();
                if(type==1)
                    update(tree,0,n-1,0,rv,li);
                if(type==2)
                    out.println(rangeMin(tree,0,n-1,0,li,rv-1));
            }
            out.println();
        }
        out.close();
    }

    public static int cst(int tree[],int ss,int se,int si,int arr[]){
        if(ss==se){
            tree[si]=arr[ss];
            return arr[ss];
        }
        int mid=ss+(se-ss)/2;
        tree[si]=Math.min(cst(tree,ss,mid,2*si+1,arr),cst(tree,mid+1,se,2*si+2,arr));
        return tree[si];
    }
	
    public static int rangeMin(int tree[],int ss,int se,int si,int l,int r){
        if(l>se || r<ss)
            return Integer.MAX_VALUE;
        if(ss>=l && se<=r)
            return tree[si];
        int mid=ss+(se-ss)/2;
        return Math.min(rangeMin(tree,ss,mid,2*si+1,l,r),rangeMin(tree,mid+1,se,2*si+2,l,r));

    }

    public static void update(int tree[],int ss, int se,int si, int val, int ind){
        if(ind>se ||ind<ss)
            return;
        if(ss==se){
            tree[si]=val;
            return;
        }
        int mid=ss+(se-ss)/2;
        update(tree,ss,mid,2*si+1,val,ind);
        update(tree,mid+1,se,2*si+2,val,ind);
        tree[si]=Math.min(tree[2*si+1],tree[2*si+2]);
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