import java.util.Scanner;

public class DayOfProgrammer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		int n,i,days,date;
		days=date=0;
		
		int leap[]= {31,29,31,30,31,30,31,31,30,31,30,31};
		int nleap[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		n=sc.nextInt();
		if(n==1918) {
			for(i=0;i<8;i++) {
				days+=nleap[i];
			}
			days-=13;
				date=256-days;
				System.out.println(date+".09."+n);
				System.exit(0);
			
		}
			
		
		
		if(n<1919 ) {
			if(n%4==0) {
				for(i=0;i<8;i++) {
					days+=leap[i];
				}
					date=256-days;
					System.out.println(date+".09."+n);
				
			}else {
				for(i=0;i<8;i++) {
					
					days+=nleap[i];
				}
					date=256-days;
					System.out.println(date+".09."+n);
				
			}
		}
		if(n>=1919) {
			if(n%400==0 || (n%4==0 && n%100!=0)) {
				for(i=0;i<8;i++) {
					
					days+=leap[i];
				}
					date=256-days;
					System.out.println(date+".09."+n);
				
			}else {
				for(i=0;i<8;i++) {
					
					days+=nleap[i];
				}
					date=256-days;
					System.out.println(date+".09."+n);
				
			}
			}
		sc.close();
	}

}
