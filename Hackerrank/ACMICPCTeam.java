import java.util.*;

public class ACMICPCTeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		
		int n,i,j,slen,not,max,count;
		count=not=0;
		int k,yo,dig,dig1,l,c;
		long len,f=1;long ff=1;
		String on;
		on="";
		
		n=sc.nextInt();
		slen=sc.nextInt();
		sc.nextLine();
		
		String a[]=new String[n];
	
		List<Integer> list=new ArrayList<Integer>();
		 c=0;
		 		 
		 for(i=0;i<n;i++) 
			 a[i]=sc.nextLine();
		 
		for(i=0;i<n-1;i++) {
			
			for(j=i+1;j<n;j++) {
						for(k=0;k<slen;k++) {
							char p=a[i].charAt(k);
							char t=a[j].charAt(k);
							dig=Integer.parseInt(String.valueOf(p));
							dig1=Integer.parseInt(String.valueOf(t));
							yo=dig|dig1;
						on=Integer.toString(yo)+on;
						}
					for(l=0;l<on.length();l++) {
						char h=on.charAt(l);
						if(h=='1')
							count++;
					}
					list.add(count);
					c++;	
					on="";
					count=0;	
			}
		}
		
		 max=list.get(0);
		 for(i=0;i<list.size();i++) {
			 if(list.get(i)>max)
			 max=list.get(i);
		 }
		 for(i=0;i<list.size();i++) {
			 if(list.get(i)==max)
				 not++;
		 }
		System.out.println(max);
		System.out.println(not);
			
sc.close();
	}

}
