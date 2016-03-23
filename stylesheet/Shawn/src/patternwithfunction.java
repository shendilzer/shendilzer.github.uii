public class patternwithfunction {

	
	public static void main(String[] args) {
	Display();	
	}
	public static void Display() {
		
	
		
		for(int s=15; s>=1; s--){
			for(int d=1; d<=s; d++)
			{
				Display(d);
			}
		System.out.print("\n");

	}
		for(int a=1; a<=16;a++){
			for(int b=1;b<=a; b++)
			{
				Display(b);
			}
			System.out.println();
			
		
		

	}
		}
	private static void Display(int display) {
		
		if(display%2==0){
			System.out.print(" ^");
			}
		if(display%2==1){
			System.out.print(" *");
		}
	}

}