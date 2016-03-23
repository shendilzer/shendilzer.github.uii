public class pattern2 {

	
	public static void main(String[] args) {
		
		for(int s=15; s>=1; s--){
			for(int d=1; d<=s; d++)
			{
				if(d%2==0){
					System.out.print("^");
					}
				if(d%2==1){
					System.out.print("*");
				}
			}
		System.out.print("\n");

	}
		for(int a=1; a<=16;a++){
			for(int b=1;b<=a; b++)
			{
				if(b%2==0){
					System.out.print("^");
					}
				if(b%2==1){
					System.out.print("*");
				}
			}
			System.out.println();
			
		
		

	}
		}

}