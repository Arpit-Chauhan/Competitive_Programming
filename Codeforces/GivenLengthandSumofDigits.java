import java.io.*;
import java.util.*;


public class GivenLengthandSumofDigits {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc =1;
        while (tc-- > 0) {
            int m = sc.nextInt();
            int sum=sc.nextInt();
            int tm=sum;
            if(sum>m*9 || (m>1 && sum==0))
            out.println(-1+" "+-1);
            else if(m==1 && sum==0)
                out.println(0+" "+0);
            else{
                StringBuilder ans=new StringBuilder();
                for (i = 0; i < m; i++) {
                    for (char k = '9'; k>='0'; k--) {
                        if(sum>=Character.getNumericValue(k)){
                            ans.append(k);
                            sum-=Character.getNumericValue(k);
                            break;
                        }
                    }
                }
                String temp=new String(ans.reverse());
                ans.reverse();
                char arr[]=temp.toCharArray();
                if(arr[0] == '0')
                {
                    arr[0] = '1';
                    for(i = 1; i < m; i++)
                    {
                        if(arr[i] != '0')
                        {
                            int d = (arr[i]-'0') -1;
                            arr[i] = (char)(d+'0');
                            break;
                        }
                    }
                }
                out.print(arr);
                out.println(" "+ans);
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