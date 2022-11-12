import java.io.*;
import java.util.*;


public class ScheduleManagement {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m=sc.nextInt();
            int arr[] = sc.readArray(m);
            Map<Integer,Integer> map=new HashMap<>();
            for(i = 1;i<=n;i++)
                map.put(i,0);
            for(int it:arr){
                map.put(it,map.getOrDefault(it,0)+1);
            }
            int low=1,high=1_000_000_000;
            int ans=0;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(check(map,mid)){
                    ans=mid;
                    high=mid-1;
                }
                else {
                    low=mid+1;
                }
            }
            out.println(ans);
        }
        out.close();
    }

    public static boolean check(Map<Integer,Integer> map, int time) {
        long work = 0,left = 0;
        for(int i:map.keySet()) {
            int tasks = map.get(i);
            if (time>=tasks)
                work+=(time-tasks)/2;
            else
                left+=tasks-time;
        }
        return left<=work;
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