import java.io.*;
import java.util.*;


public class FoxandBoxAccumulation {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;


        n = sc.nextInt();
        int arr[] = sc.readArray(n);
        sc.sort(arr);
        ArrayList<Integer> list=new ArrayList<>();

        for(int item:arr)
            list.add(item);

        boolean flag=false;
        int ans=0;
        ArrayList<Integer> temp=new ArrayList<>();
        while(!flag){
                int count=1;
                int curr=list.get(0);
                temp.add(list.get(0));
                for (j = 1; j < list.size() ; j++) {
                    if(list.get(j)!=0){
                        if(list.get(j)>=count) {
                            count++;
                            temp.add(list.get(j));
                        }
                    }
                }
                if(temp.size()!=1) {
                    ans++;
                    for (int k = 0; k <temp.size() ; k++)
                        list.remove(Integer.valueOf(temp.get(k)));
                    temp.clear();
                    if (list.size()==0)
                        flag=true;
                }
                else if(temp.size()==1)
                    flag=true;
        }
        out.println(ans+list.size());
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