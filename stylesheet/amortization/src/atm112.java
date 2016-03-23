import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class atm112 {

	public static void main(String[] args) {
		String stat;
		stat = JOptionPane.showInputDialog("Please Choose Your Status: \n [1]withdraw \n [2]Deposite \n [3]Check Balance \n [4]Exit ");
		int Stat;
		Stat = Integer.parseInt(stat);
		DecimalFormat dollars = new DecimalFormat("$0.00");
		String inc;
		int Inc;
		double tax, tax_f;
		inc = JOptionPane.showInputDialog("Account No.: "+"Pin: ");
		
		inc = JOptionPane.showInputDialog("Enter Income: ");
		Inc = Integer.parseInt(inc);
		
		//for choice 1
		switch (Stat){
		case 1 : 
		{
			
			if((Inc>=0)&&(Inc<=8350)){
				tax = Inc * 0.10;
				JOptionPane.showMessageDialog(null,"Single Filer:\nIncome: " + inc + "\nTax: "+dollars.format(tax));
			}
			if((Inc>=8351)&&(Inc<=33950)){
				tax = 8350 * 0.10;
				tax_f =( tax + ((Inc - 8350 )* 0.15));
				JOptionPane.showMessageDialog(null,"Single Filer:\nIncome: " + inc + "\nTax: "+dollars.format(tax_f));
				
			}
			if((Inc>=33951)&&(Inc<=82250)){
				tax = 33950 * 0.15;
				tax_f =(tax + ((Inc - 33950 )* 0.25));
				JOptionPane.showMessageDialog(null,"Single Filer:\nIncome: " + inc + "\nTax: "+dollars.format(tax_f));
				
			}
			if((Inc>=82251)&&(Inc<=171550)){
				tax = 82250 * 0.25;
				tax_f =(tax + ((Inc - 82250 )* 0.28));
				JOptionPane.showMessageDialog(null,"Single Filer:\nIncome: " + inc + "\nTax: "+dollars.format(tax_f));
				
			}
			if((Inc>=171551)&&(Inc<=372950)){
				tax = 171550 * 0.28;
				tax_f =(tax + ((Inc - 171550 )* 0.33));
				JOptionPane.showMessageDialog(null,"Single Filer:\nIncome: " + inc + "\nTax: "+dollars.format(tax_f));
				
			}
			if(Inc>=372951){
				tax = 372950 * 0.33;
				tax_f =(tax + ((Inc - 372950 )* 0.35));
				JOptionPane.showMessageDialog(null,"Single Filer:\nIncome: " + inc + "\nTax: "+dollars.format(tax_f));
				
			}
		} break;
		
		//for choice 2
		case 2 :
		{
			if((Inc>=0)&&(Inc<=16700)){
				tax = Inc * 0.10;
				JOptionPane.showMessageDialog(null,"Married Filing Jointly/Qualified Widow(er):\nIncome: " + inc + "\nTax: "+dollars.format(tax));
			}
			if((Inc>=16701)&&(Inc<=67900)){
				tax = 16700 * 0.10;
				tax_f =( tax + ((Inc - 16700 )* 0.15));
				JOptionPane.showMessageDialog(null,"Married Filing Jointly/Qualified Widow(er): " + inc + "\nTax: "+dollars.format(tax_f));
				
			}
			if((Inc>=67901)&&(Inc<=137050)){
				tax = 67900 * 0.15;
				tax_f =(tax + ((Inc - 67900 )* 0.25));
				JOptionPane.showMessageDialog(null,"Married Filing Jointly/Qualified Widow(er):\nIncome: " + inc + "\nTax: "+dollars.format(tax_f));
				
			}
			if((Inc>=137051)&&(Inc<=208850)){
				tax = 137050 * 0.25;
				tax_f =(tax + ((Inc - 137050 )* 0.28));
				JOptionPane.showMessageDialog(null,"Married Filing Jointly/Qualified Widow(er):\nIncome: " + inc + "\nTax: "+dollars.format(tax_f));
				
			}
			if((Inc>=208851)&&(Inc<=372950)){
				tax = 208850 * 0.28;
				tax_f =(tax + ((Inc - 171550 )* 0.33));
				JOptionPane.showMessageDialog(null,"Married Filing Jointly/Qualified Widow(er):\nIncome: " + inc + "\nTax: "+dollars.format(tax_f));
				
			}
			if(Inc>=372951){
				tax = 372950 * 0.33;
				tax_f =(tax + ((Inc - 372950 )* 0.35));
				JOptionPane.showMessageDialog(null,"Married Filing Jointly/Qualified Widow(er):\nIncome: " + inc + "\nTax: "+dollars.format(tax_f));
				
			}
			
		}break;
		//for choice 3
		case 3 :
		{
					if((Inc>=0)&&(Inc<=8350)){
						tax = Inc * 0.10;
						JOptionPane.showMessageDialog(null,"Married Filing Separately:\nIncome: " + inc + "\nTax: "+dollars.format(tax));
					}
					if((Inc>=8351)&&(Inc<=33950)){
						tax = 8350 * 0.10;
						tax_f =( tax + ((Inc - 8350 )* 0.15));
						JOptionPane.showMessageDialog(null,"Married Filing Separately: " + inc + "\nTax: "+dollars.format(tax_f));
						
					}
					if((Inc>=33951)&&(Inc<=68525)){
						tax = 33950 * 0.15;
						tax_f =(tax + ((Inc - 33950 )* 0.25));
						JOptionPane.showMessageDialog(null,"Married Filing Separately:\nIncome: " + inc + "\nTax: "+dollars.format(tax_f));
						
					}
					if((Inc>=68526)&&(Inc<=104425)){
						tax = 68525 * 0.25;
						tax_f =(tax + ((Inc - 68525 )* 0.28));
						JOptionPane.showMessageDialog(null,"Married Filing Separately:\nIncome: " + inc + "\nTax: "+dollars.format(tax_f));
						
					}
					if((Inc>=104426)&&(Inc<=186475)){
						tax = 104425 * 0.28;
						tax_f =(tax + ((Inc - 104425 )* 0.33));
						JOptionPane.showMessageDialog(null,"Married Filing Separately:\nIncome: " + inc + "\nTax: "+dollars.format(tax_f));
						
					}
					if(Inc>=186476){
						tax = 186475 * 0.33;
						tax_f =(tax + ((Inc - 186475 )* 0.35));
						JOptionPane.showMessageDialog(null,"Married Filing Separately:\nIncome: " + inc + "\nTax: "+dollars.format(tax_f));
						
					}
					
				}break;
				//for choice 4
			case 4 : 
			{
					if((Inc>=0)&&(Inc<=11950)){
						tax = Inc * 0.10;
						JOptionPane.showMessageDialog(null,"Head of Household:\nIncome: " + inc + "\nTax: "+dollars.format(tax));
					}
					if((Inc>=11951)&&(Inc<=45500)){
						tax = 11950* 0.10;
						tax_f =( tax + ((Inc - 11950 )* 0.15));
						JOptionPane.showMessageDialog(null,"Head of Household: " + inc + "\nTax: "+dollars.format(tax_f));
						
					}
					if((Inc>=45501)&&(Inc<=117450)){
						tax = 45500 * 0.15;
						tax_f =(tax + ((Inc - 45500 )* 0.25));
						JOptionPane.showMessageDialog(null,"Head of Household:\nIncome: " + inc + "\nTax: "+dollars.format(tax_f));
						
					}
					if((Inc>=117451)&&(Inc<=190200)){
						tax = 117450 * 0.25;
						tax_f =(tax + ((Inc - 117450 )* 0.28));
						JOptionPane.showMessageDialog(null,"Head of Household:\nIncome: " + inc + "\nTax: "+dollars.format(tax_f));
						
					}
					if((Inc>=190201)&&(Inc<=372950)){
						tax = 190200 * 0.28;
						tax_f =(tax + ((Inc - 190200 )* 0.33));
						JOptionPane.showMessageDialog(null,"Head of Household:\nIncome: " + inc + "\nTax: "+dollars.format(tax_f));
						
					}
					if(Inc>=372951){
						tax = 372950 * 0.33;
						tax_f =(tax + ((Inc - 372950 )* 0.35));
						JOptionPane.showMessageDialog(null,"Head of Household:\nIncome: " + inc + "\nTax: "+dollars.format(tax_f));
						
					}
					
				}break;
				default :
					JOptionPane.showMessageDialog(null,"Invalid Choice!");


	}
	}
}




