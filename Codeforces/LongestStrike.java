import java.io.*;
import java.util.*;


public class LongestStrike {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int k= sc.nextInt();
            long arr[] = sc.readArray(n);
            Map<Long,Long> map=new HashMap<>();
            for (long it:arr)
                map.put(it,map.getOrDefault(it,(long)0)+1);
            ArrayList<Long> list=new ArrayList<>();
            for(Map.Entry<Long,Long> entry: map.entrySet()){
                if(entry.getValue()>=k)
                    list.add(entry.getKey());
            }
            Collections.sort(list);
            if(list.size()==0)
                out.println(-1);
            else if (list.size()==1)
                out.println(list.get(0)+" "+list.get(0));
            else{
                long min=list.get(0),max=list.get(0),pos1=list.get(0),pos2=list.get(0);
                long ans=0,count=1;
                for(i =1 ; i<list.size() ; i++){
                    if(list.get(i)== pos1+1){
                        pos1 = list.get(i);
                        count++;
                    }
                    else{
                        if(count>ans){
                            ans=count;
                            min=pos2;
                            max=pos1;
                        }
                        count=1;
                        pos2=list.get(i);
                        pos1=list.get(i);
                    }
                }
                if(pos1!=pos2 && count>ans){
                    min=pos2;
                    max=pos1;
                }
                out.println(min+" "+max);
            }
        }
        out.close();
    }
//	public static int binser(int arr[],int k){
//
//    }


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
        long[] readArray(int n) {
            long arr[] = new long[n];
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