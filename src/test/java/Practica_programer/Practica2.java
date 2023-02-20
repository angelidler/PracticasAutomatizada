package Practica_programer;

public class Practica2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n []= {50, 60, 60, 45, 70};
		int sum=0;
		int c=1;
		int result[]= {0,0};
		
		for(int i = 0; i<n.length;i++) {
			
			if(i==c) {
				c+=2;
				continue;
			}
			sum+=n[i];
		}
		result[0]=sum;
		sum=0;
		c=0;
for(int i = 0; i<n.length;i++) {
			
			if(i==c) {
				c+=2;
				continue;
			}
			sum+=n[i];
			
		}
result[1]=sum;
System.out.print(sum);

	}
	
	

}
