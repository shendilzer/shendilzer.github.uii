public class pattern3{
	public static void main (String [] agrs){
		for(int i = 15;i >= 1; i--){
			for(int a = 1;a <= i; a++){
				if(a % 2 == 1){
					System.out.print("*");}
						if(a % 2 == 0){
				System.out.print("^");
				}
			}
			for(int x = (15-i)*2;x>=1;x--){
				System.out.print(" ");}
			for(int x=i;x >= 1;x--){
				if(x % 2 == 1){
					System.out.print("*");}
						if(x % 2 == 0){
							System.out.print("^");
				}
			}
			System.out.print("\n");
		}				
		for(int i = 2;i <= 15; i++){
			for(int a = 1;a <= i; a++){
				if(a % 2 == 1){
				System.out.print("*");
				}
				if(a % 2 == 0){
				System.out.print("^");
				}
			}
			for(int x = (15-i)*2;x>=1;x--){
				System.out.print(" ");
			}
			for(int x=i;x >= 1;x--){
				if(x % 2 == 1){
				System.out.print("*");
				}
				if(x % 2 == 0){
				System.out.print("^");
				}
			}
			System.out.print("\n");
		}
	}
}