import java.io.*;
import java.util.*;


public class LastYearsSubstring {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;

        t = sc.nextInt();
        while(t-->0) {
            n = sc.nextInt();
            s= sc.nextLine();
            int len =s.length();
            String pat="2020";
            boolean flag=false;
            if (s.charAt(0)!='2'){
                String temp=s.substring(len-4,len);
                if (temp.equals("2020"))
                    out.println("YES");
                else
                    out.println("NO");
            }
            else{
                if (s.charAt(1)=='0' && s.charAt(2)=='2'){
                    if (s.charAt(3)=='0' || s.charAt(len-1)=='0')
                        out.println("YES");
                    else
                        out.println("NO");
                }
                else if (s.charAt(1)=='0'){
                    for (i = 2; i <len-1 ; i++) {
                        char p=s.charAt(i);
                        if (p=='2'){
                            if (s.charAt(i+1)=='0'){
                                if (i==1 || i==len-2) {
                                    out.println("YES");
                                    flag=true;
                                    break;
                                }
                            }
                        }
                    }
                    if(!flag)
                        out.println("NO");
                }
                else if (s.charAt(1)!='0'){
                    String temp=s.substring(len-3,len);
                    if (temp.equals("020"))
                        out.println("YES");
                    else
                        out.println("NO");
                }
            }
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

        /*DEFINED BY ME
         */
        int[] readArray(int n) {

            int arr[] = new int[n];

            for (int i = 0; i < n; i++)
                arr[i] = nextInt();

            return arr;
        }

        void sort(int arr[]) {
            ArrayList<Integer> l = new ArrayList<>();
            for (int i : arr)
                l.add(i);
            Collections.sort(l);
            for (int i = 0; i < arr.length; i++)
                arr[i] = l.get(i);
        }
    }
}