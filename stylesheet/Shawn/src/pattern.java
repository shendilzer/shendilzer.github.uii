
public class pattern {

	
	public static void main(String[] args) {
		for(int a=1; a<=15;a++){
			for(int b=16;b<=a; b++)
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
		for(int a=15; a>=1; a--){
			for(int b=1; b<=a; b++)
			{
				if(b%2==0){
					System.out.print("^");
					}
				if(b%2==1){
					System.out.print("*");
				}
			}
		System.out.print("\n");

	}
		}

}
