

public class service_charge2{

	public static double ServCharge = 0;
	public static double TotCharge = 0;
	public static double Charge = 0;
	public static double Senior = 0;
	public static double totDiscount = 0;
	public static double Discount = 0;

	public service_charge2(int AGE, double MONEY){
		ServCharge = (((MONEY - 1000)/100)*5)+35;
		Charge = MONEY+ServCharge;
		if((MONEY>=10000)&&(MONEY<=20000)){
			Discount = ServCharge*0.05;
		}
		if(MONEY>20000){
			Discount = ServCharge*0.1;
		}
		if(AGE>=60){
			Senior = ServCharge*0.2;
		}
		totDiscount = Discount+Senior;
		TotCharge = Charge - Discount-Senior;
	}

	
		public static double getServCharge(){
			return ServCharge;
		}
		public static double getTotCharge(){
			return TotCharge;
		}
		public static double getDiscount(){
			return Discount;
		}
		public static double getSenior(){
			return Senior;
		}
		public static double gettotDiscount(){
			return totDiscount;
		}
			
				
	}

	
	



