
import javax.swing.*;

public class main {
	


	

public static void main(String [] args){
		 JDialog.setDefaultLookAndFeelDecorated(true);
		
		String Disp = "";
		String name = JOptionPane.showInputDialog("Name:");
		
		String address = JOptionPane.showInputDialog("Address:");
		
		String age = JOptionPane.showInputDialog("Age:");
		int Age = Integer.parseInt(age);
		
		String money = JOptionPane.showInputDialog("Amount:");
		double Money = Double.parseDouble(money);
		
		if(Money<=1000){
			service_charge1 ServiceCharge1 = new service_charge1(Age,Money);
			Disp = (Disp+ "\nName:  "+name+"\nAge:  "+age+"\nAddress:  "+address+"\n\nAmount:  P"+money+"\nService Charge: "+service_charge1.getServCharge()+"\nSenior Discount: "+service_charge1.getSenior()+"\nDiscount: "+service_charge1.getDiscount()+"\nTotal Discount:  "+service_charge1.gettotDiscount()+"\nTotal Charge: P"+ServiceCharge1.getTotCharge());
			JOptionPane.showMessageDialog(null, new JTextArea(Disp));
		}
		else if(Money > 1000){
			service_charge2 ServiceCharge2 = new service_charge2(Age,Money);
			Disp = (Disp+ "\nName:  "+name+"\nAge:  "+age+"\nAddress:  "+address+"\n\nAmount:  P"+money+"\nService Charge: "+service_charge2.getServCharge()+"\nSenior Discount: "+service_charge2.getSenior()+"\nDiscount: "+service_charge2.getDiscount()+"\nTotal Discount:  "+service_charge2.gettotDiscount()+"\nTotal Charge: P"+service_charge1.getTotCharge());
			JOptionPane.showMessageDialog(null, new JTextArea(Disp));
		
		}
	
	
		
}

}
