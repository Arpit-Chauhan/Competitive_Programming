import java.io.*;
import java.util.*;


public class ScenesFromAMemory {

    public static void main(String args[]) throws IOException {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = sc.nextInt();
        while (tc-- > 0) {
            int n= sc.nextInt();
            s= sc.nextLine();
            boolean flag=false;
            boolean flag2=false;
            for (i = 0; i < n; i++) {
                int temp=Integer.parseInt(String.valueOf(s.charAt(i)));
                if ((temp%2==0 && temp!=2) || temp==1 || temp==9){
                    System.out.println(1);
                    System.out.println(temp);
                    flag=true;
                    flag2=true;
                    break;
                }
            }

            if(!flag){
               Map<Integer,Integer> map=new HashMap<>();
                for (i = 0; i < n; i++) {
                    int temp=Integer.parseInt(String.valueOf(s.charAt(i)));
                    map.put(temp,map.getOrDefault(temp,0)+1);
                }
                if (map.get(2)!=null && map.get(2)>1){
                    System.out.println(2);
                    System.out.println(22);
                    flag2=true;
                }
                else if (map.get(3)!=null && map.get(3)>1){
                    System.out.println(2);
                    System.out.println(33);
                    flag2=true;
                }
                else if (map.get(5)!=null && map.get(5)>1){
                    System.out.println(2);
                    System.out.println(55);
                    flag2=true;
                }
                else if (map.get(7)!=null && map.get(7)>1){
                    System.out.println(2);
                    System.out.println(77);
                    flag2=true;
                }
                else{
                    boolean fl2=false,fl3=false,fl5=false,fl7=false;
                    if (s.indexOf('2')!=-1){
                        for (i = s.indexOf('2')+1; i <n ; i++) {
                            if (s.charAt(i)=='5'){
                                System.out.println(2);
                                System.out.println(25);
                                flag2=true;
                                fl2=true;
                                break;
                            }
                            if (s.charAt(i)=='7'){
                                System.out.println(2);
                                System.out.println(27);
                                flag2=true;
                                fl2=true;
                                break;
                            }
                        }
                    }
                     if (s.indexOf('3')!=-1 && !fl2) {
                        for (i = s.indexOf('3') + 1; i < n; i++) {
                            if (s.charAt(i) == '5') {
                                System.out.println(2);
                                System.out.println(35);
                                flag2 = true;
                                fl3=true;
                                break;
                            }
                            if (s.charAt(i) == '2') {
                                System.out.println(2);
                                System.out.println(32);
                                flag2 = true;
                                fl3=true;
                                break;
                            }
                        }
                    }
                     if (s.indexOf('5')!=-1 && !fl2 &&!fl3)  {
                        for (i = s.indexOf('5') + 1; i < n; i++) {
                            if (s.charAt(i) == '2') {
                                System.out.println(2);
                                System.out.println(52);
                                flag2 = true;
                                fl5=true;
                                break;
                            }
                            if (s.charAt(i) == '7') {
                                System.out.println(2);
                                System.out.println(57);
                                flag2 = true;
                                fl5=true;
                                break;
                            }
                        }
                    }
                     if (s.indexOf('7')!=-1 && !fl2 && !fl3 && !fl5) {
                        for (i = s.indexOf('7') + 1; i < n; i++) {
                            if (s.charAt(i) == '2') {
                                System.out.println(2);
                                System.out.println(72);
                                flag2 = true;
                                break;
                            }
                            if (s.charAt(i) == '5') {
                                System.out.println(2);
                                System.out.println(75);
                                flag2 = true;
                                break;
                            }
                        }
                    }
                }
            }
           if (!flag2) {
                System.out.println(n);
                System.out.println(s);
            }

        }
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