import java.io.*;
import java.util.*;


public class InternetAddress {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = 1;
        while (tc-- > 0) {
            s= sc.nextLine();
            String pro;
            StringBuilder ans=new StringBuilder();

            if (s.indexOf("http")==0)
                pro="http";
            else
                pro="ftp";

            int pos;
            pos=s.indexOf("ru");
            String con=s.substring(pos+2);

            if (pro.equals("http")) {
                String domain = s.substring(4,pos);
                if (domain.isEmpty()){
                    pos=s.indexOf("ru",pos+1);
                    domain=s.substring(4,pos);
                    con=s.substring(pos+2);
                }
                ans.append("http://" + domain + ".ru");
            }
            else {
                String domain = s.substring(3,pos);
                if (domain.isEmpty()){
                    pos=s.indexOf("ru",pos+1);
                    domain=s.substring(3,pos);
                    con=s.substring(pos+2);
                }
                ans.append("ftp://" + domain + ".ru");
            }
            if (!con.isEmpty())
                ans.append("/"+con);

            out.println(ans);
        }
        out.close();
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
    }
}