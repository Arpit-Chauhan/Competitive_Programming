import java.io.*;
import java.util.*;


public class NonSubstringSubsequence_685 {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n,i,j;
        String s;

        t = sc.nextInt();
        while (t-->0) {
            n = sc.nextInt();
            int q = sc.nextInt();
            s = sc.nextLine();
            while (q-- > 0) {
                List<Integer> list =new ArrayList<>();
                int l = sc.nextInt();
                int r = sc.nextInt();
                String pat = s.substring(l - 1, r);
                list.add(s.indexOf(pat.charAt(0)));
                list.add(s.lastIndexOf(pat.charAt(pat.length()-1)));
                int flag = 0;
                String temp=pat.substring(1,pat.length()-1);
                String temp2="";
                int index=list.get(1)-1;
                for (i = pat.length()-2; i >0; i--) {
                    char p=pat.charAt(i);
                    for (j = index; j > list.get(0) ; j--) {
                        char k=s.charAt(j);
                        if (k==p) {
                            temp2=p+temp2;
                            list.add(j);
                            index--;
                            break;
                        }
                    }
                }
                if (temp.equals(temp2)){
                    Collections.sort(list);
                    for (i = 1; i < list.size(); i++) {
                        if (list.get(i)-list.get(i-1)>1){
                            flag=1;break;
                        }
                    }
                    if (flag==1)
                        out.println("YES");
                    else
                        out.println("NO");
                }
                else{
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