import java.io.*;
import java.util.*;


public class WrongAddition {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = sc.nextInt();
        while (tc-- > 0) {
            long x=sc.nextLong();
            long y=sc.nextLong();
            String a= Long.toString(x);
            s= Long.toString(y);
            char arr[]=a.toCharArray();
            char sr[]=s.toCharArray();
            StringBuilder ans=new StringBuilder();
            if (s.length()<a.length())
                out.println(-1);
            else{
                i=arr.length-1;
                j=sr.length-1;
                boolean flag=false;
                while(i>=0 && j>=0){
                    int tempa=Character.getNumericValue(arr[i]);
                    int temps=Character.getNumericValue(sr[j]);
                    if (tempa<=temps) {
                        ans.append(temps - tempa);
                        i--;j--;
                    }
                    else{
                        j--;
                        if (j==-1){
                            flag=true;
                            break;
                        }
                        if (temps==0)
                            temps=Character.getNumericValue(sr[j])*10;
                        else
                            temps+=Character.getNumericValue(sr[j])*10;
                        if (temps-tempa>9 || temps-tempa<0) {
                            flag = true;
                            break;
                        }
                        ans.append(temps-tempa);
                        i--;j--;
                    }
                }
                boolean flag2=false;
                if (i>=0 || flag) {
                    out.println(-1);
                    flag2=true;
                }
                if (!flag2){
                    while(j>=0){
                        ans.append(sr[j]);
                        j--;
                    }
                    ans.reverse();
                    i=0;
                    while(i<ans.length()){
                        if(ans.charAt(i)!='0') break;
                        i++;
                    }
                    out.println(ans.substring(i));
                }
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