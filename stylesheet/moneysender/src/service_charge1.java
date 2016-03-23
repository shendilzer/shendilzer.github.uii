


 public class service_charge1 {
	
	    public static double ServCharge = 0;
		public static double TotCharge = 0;
		public static double Charge = 0;
		public static double Senior = 0;
		public static double totDiscount = 0;
		public static double Discount = 0;
 
		public service_charge1(int AGE, double MONEY){
			ServCharge = 35;
			Charge = MONEY+ServCharge;
			if(AGE>=60)
			{
				Senior = ServCharge*0.2;
			}
			totDiscount = Discount+Senior;
			TotCharge=Charge-Discount- Senior;
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