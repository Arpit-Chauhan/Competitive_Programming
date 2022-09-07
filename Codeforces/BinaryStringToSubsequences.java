import java.io.*;
import java.util.*;


public class BinaryStringToSubsequences {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            s=sc.nextLine();
            int ans[]=new int[n];
            ArrayList<Integer> pos0=new ArrayList<>();
            ArrayList<Integer> pos1=new ArrayList<>();
            for (i = 0; i < n; i++) {
                int whichsub=pos0.size()+pos1.size()+1;
                if(s.charAt(i)=='0'){
                    if(pos1.isEmpty())
                        pos0.add(whichsub);
                    else{
                        whichsub=pos1.get(pos1.size()-1);
                        pos1.remove(pos1.size()-1);
                        pos0.add(whichsub);
                    }
                }
                else{
                    if(pos0.isEmpty())
                        pos1.add(whichsub);
                    else{
                        whichsub=pos0.get(pos0.size()-1);
                        pos0.remove(pos0.size()-1);
                        pos1.add(whichsub);
                    }
                }
                ans[i]=whichsub;
            }
            out.println(pos0.size()+pos1.size());
            for(int it:ans)
                out.print(it+" ");
            out.println();
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