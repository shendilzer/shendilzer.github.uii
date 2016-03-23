

import javax.swing.*;

public class ATM3 {
	
	@SuppressWarnings("deprecation")
	public static void main(String [] args){
		String acc_num="",name="",pass="",select="",ndeposit="",nwithdraw,loop;
		float newDeposit,withdraw;
		float depositMe=(float) 15000.00;
		int transaction=0,ret=0,account,pin,accountMe=2133426,passwordMe=3400;
		
		JTextField field1 = new JTextField ();
		JTextField field2 = new JTextField ();
		JPasswordField field3 = new JPasswordField ();
		
		Object [] message = 
			{
				"Enter Account Number:", field1,
				"Enter Name:", field2,
				"Enter PIN:", field3
			}; 
		
		int result = JOptionPane.showConfirmDialog(null,message,"Welcome To \nSM's ATM Machine",JOptionPane.OK_CANCEL_OPTION);
		if(result == JOptionPane.OK_OPTION) 
		{
			 acc_num = field1.getText();
			 name = field2.getText();
			 pass = field3.getText();
		}
		 pin = Integer.parseInt(pass);
		 account = Integer.parseInt(acc_num);
		 
		 if(account == accountMe && pin == passwordMe)
		 {
			 JOptionPane.showMessageDialog(null,"Welcome " + name );
		 }
		 else 
		 {
			 JOptionPane.showMessageDialog(null,"Wrong INPUT \n Account Number and PIN MISMATCHED!","\nACCESS DENIED",JOptionPane.WARNING_MESSAGE);
			 JOptionPane.showMessageDialog(null,"Please get your ATM CARD","\nACCESS DENIED",JOptionPane.WARNING_MESSAGE);
			 System.exit(0);
		 }
		do
		{
			
		select = JOptionPane.showInputDialog("Select Transaction\n\n1. Deposit\n2. Withdrawal\n3. Balance Inquiry\n4. Exit",JOptionPane.QUESTION_MESSAGE);
		transaction = Integer.parseInt(select);
		
switch(transaction)
{
		case 1://Deposit
		{	
				ndeposit = JOptionPane.showInputDialog("Enter Deposit:  ");
				newDeposit = Float.parseFloat(ndeposit);
				depositMe=depositMe+newDeposit;
				JOptionPane.showMessageDialog(null,"Transaction Complete!");					
		}
		break;
		case 2://Withdrawal
		{
				nwithdraw = JOptionPane.showInputDialog("Enter amount:  ",JOptionPane.QUESTION_MESSAGE);
				withdraw = Float.parseFloat(nwithdraw);
				
				if(withdraw%100 !=0)
				{
					JOptionPane.showMessageDialog(null,"This machine will ONLY dispense 1000's, 500's, 200's and 100's","INVALID AMOUNT!!!",JOptionPane.WARNING_MESSAGE);
				}
			
				else if(withdraw <= depositMe)
				{
					depositMe = depositMe-withdraw;
					JOptionPane.showMessageDialog(null,"Transaction Complete!");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"INVALID AMOUNT!!!","INVALID",JOptionPane.WARNING_MESSAGE);
				}
		}
		break;
	
		case 3://Balance Inquiry
		{
			if(account == accountMe && pin == passwordMe)
			{
				JOptionPane.showMessageDialog(null,"Name: "+name+"\nAccount no: "+acc_num+"\n\nAvailable Balance: Php. "+depositMe);
			}
		}
		break;
		
		case 4://Exit
		{	
			JOptionPane.showMessageDialog(null,"Thank you for Banking with us!");
			System.exit(0);
		}
		
		default:
		{
			JOptionPane.showMessageDialog(null,"INVALID INPUT!!!");
		}
}
		

		loop = JOptionPane.showInputDialog("Would you like another transaction?\n\n[1] YES\n[2] NO",JOptionPane.QUESTION_MESSAGE);
		ret = Integer.parseInt(loop);
		}
		while(ret == 1);
		
		if(ret == 2)
		{
			JOptionPane.showMessageDialog(null,"Thank you for Banking with us!");
			JOptionPane.showMessageDialog(null,"Please get your CARD!");
		}
		
		else 
		{
			JOptionPane.showMessageDialog(null,"INVALID INPUT!!!");
		}
	}
}
