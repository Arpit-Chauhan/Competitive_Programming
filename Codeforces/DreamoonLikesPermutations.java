import java.io.*;
import java.util.*;


public class DreamoonLikesPermutations {

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
            int front[]=new int[n];
            int back[]=new int[n];
            TreeSet<Integer> set=new TreeSet<>();
            for (i=0; i <n ; i++) {
                set.add(arr[i]);
                if(set.last()==i+1 && set.size()==i+1)
                    front[i]=i+1;
            }
            int endwith=1;
            set.clear();
            for (i =n-1; i>=0 ; i--) {
                set.add(arr[i]);
                if(set.last()==endwith && set.size()==endwith)
                    back[i]=endwith;
                endwith++;
            }
            StringBuilder ans=new StringBuilder();
            StringBuilder temp=new StringBuilder();
            int count=0;
            for (i = 0; i <n-1; i++) {
                if(front[i]>0 && back[i+1]>0 && front[i]+back[i+1]==n){
                    count++;
                    temp.append((i+1)+" "+(n-(i+1))+"\n");
                }
            }
            ans.append(count+"\n");
            ans.append(temp);
            out.print(ans);
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