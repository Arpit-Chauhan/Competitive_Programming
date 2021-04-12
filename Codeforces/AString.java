import java.io.*;
import java.util.*;


public class AString {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = sc.nextInt();
        while (tc-- > 0) {
            s=sc.nextLine();
            if (s.charAt(0)==s.charAt(s.length()-1))
                out.println("NO");
            else {
                Map<Character, Character> map = new HashMap<>();
                p = s.charAt(0);
                map.put(p, '(');
                char q = s.charAt(s.length() - 1);
                map.put(q, ')');
                StringBuilder ans1 = new StringBuilder();
                StringBuilder ans2 = new StringBuilder();
                for (i = 65; i <= 67; i++) {
                    if (!map.containsKey((char) i))
                        map.put((char) i, '(');
                }
                for (i = 0; i < s.length(); i++)
                    ans1.append(map.get(s.charAt(i)));
                if (checkbal(ans1))
                    out.println("YES");
                else{
                    map.clear();
                    map.put(p, '(');
                    map.put(q, ')');
                    for (i = 65; i <= 67; i++) {
                        if (!map.containsKey((char) i))
                            map.put((char) i, ')');
                    }
                    for (i = 0; i < s.length(); i++)
                        ans2.append(map.get(s.charAt(i)));
                    if (checkbal(ans2))
                        out.println("YES");
                    else
                        out.println("NO");
                }
            }
        }
        out.close();
    }


    static boolean checkbal(StringBuilder s){
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)=='(')
            stack.push(s.charAt(i));
            else if (stack.isEmpty())
                return false;
            else
                stack.pop();
        }
        return stack.isEmpty();
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