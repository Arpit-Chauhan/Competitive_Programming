import java.io.*;
import java.util.*;


public class NumberofMinimumsonaSegment {

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
            Pair tree[]=new Pair[4*n];
            cst(tree,0,n-1,0,arr);
            while(m-->0){
                int type=sc.nextInt();
                int l=sc.nextInt();
                int r=sc.nextInt();
                if(type==1)
                    update(tree,0,n-1,0,l,r);
                if(type==2) {
                    Pair ans=range(tree, 0, n - 1, 0, l, r-1);
                    out.println(ans.x+" "+ans.y);
                }
            }
        }
        out.close();
    }
	

    public static Pair cst(Pair tree[],int ss,int se, int si, int arr[]){
        if(ss==se){
            tree[si]=new Pair(arr[ss],1);
            return tree[ss];
        }
        int mid=ss+(se-ss)/2;
        cst(tree,ss,mid,2*si+1,arr);
        cst(tree,mid+1,se,2*si+2,arr);
        tree[si]=merge(tree[2*si+1],tree[2*si+2]);
        return tree[si];
    }

    public static Pair merge(Pair a,Pair b){
        if(a.x<b.x)
            return a;
        else if(a.x>b.x)
            return b;
        return new Pair(a.x,a.y+b.y);
    }

    public static Pair range(Pair tree[],int ss, int se,int si,int l,int r){
        if(l>se || r<ss)
            return new Pair(Integer.MAX_VALUE,0);
        if(ss>=l && se<=r)
            return tree[si];
        int mid=ss+(se-ss)/2;
        Pair s1=range(tree,ss,mid,2*si+1,l,r);
        Pair s2=range(tree,mid+1,se,2*si+2,l,r);
        return merge(s1,s2);
    }

    public static void update(Pair tree[],int ss,int se,int si,int ind,int val){
        if(ind>se || ind<ss)
            return;
        if(ss==se) {
            tree[si]= new Pair(val,1);
            return;
        }
        int mid = ss + (se-ss)/2;
        update(tree,ss,mid,2*si+1,ind,val);
        update(tree,mid+1,se,2*si+2,ind,val);
        tree[si] =merge(tree[2*si+1],tree[2*si+2]);
    }
/*--------------------------------------------------------
----------------------------------------------------------*/


    //Pair Class

    public static class Pair {
        int x, y;
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
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