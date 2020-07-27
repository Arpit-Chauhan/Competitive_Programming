import java.util.Scanner;
public class candy123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		int t,a,b,candy,limcan,bobcan;
		t=s.nextInt();
		limcan=bobcan=0;
		
		while(t>0) {
			a=s.nextInt();
			b=s.nextInt();
			
			for(candy=1;candy<=a+b;candy++) {
				
				if(candy%2!=0) {
					if(limcan<=a) {
					limcan+=candy;
					}if(limcan>a) {
						System.out.println("Bob");
						break;
					}
				}
				if(candy%2==0){
					if(bobcan<=b && limcan<=a) {
						bobcan+=candy;
					}if(bobcan>b) {
						System.out.println("Limak");
						break;
					}
				}
			}	
			limcan=0;
			bobcan=0;
			t--;
			
		}
		
		s.close();
		
	}

}
