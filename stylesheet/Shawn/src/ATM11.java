import javax.swing.*;

public class ATM11 {
	
	public static double money = 500.00;
	static double balance;
	public static int accountNumber, password,repassword, iaccountNumber, ipassword,	main = 0, choice1;
	public static String accountName;
	public static void main(String[] args){		
		Start();		
		SignIn();		
		LogIn();		
		WidDep();		
		Deposit();					
		Withdraw();
		}
public static int Start(){

		String Choice1 = JOptionPane.showInputDialog("WELCOME!\n\nDo You Have Already have an Account?   [1] Log In\nDon't have an Account?    [2] Create Account");
		int choice1 = Integer.parseInt(Choice1);
		
		if (choice1 == 1)
		{
			LogIn();
			JOptionPane.showMessageDialog(null, "Invalid Selection!\nTry Again.");
			return Start();
			}
		else if (choice1 == 2) return SignIn();
		else{
			JOptionPane.showMessageDialog(null, "Invalid Selection!\nTry Again.");
			return Start();
		}
	}
	
	public static int SignIn(){
		JDialog.setDefaultLookAndFeelDecorated(true);
		JTextField no1 = new JTextField();
		JTextField no2 = new JTextField();
		JTextField no3 = new JPasswordField();
		JTextField no4 = new JPasswordField();
		
		Object[] SignIn = {
			"Please fill up the following.\n\nAccount Number:", no1,
			"Account Name:",no2,
			"PIN:", no3,
			"Retype PIN", no4,	
		};
		
		JOptionPane.showConfirmDialog(null, SignIn, "Welcome To our ATM Machine", JOptionPane.OK_CANCEL_OPTION);
		
		String AccountNumber = no1.getText();
		String AccountName = no2.getText();
		String PIN = no3.getText();
		String RePIN = no4.getText();
		accountNumber = Integer.parseInt(AccountNumber);
		accountName= AccountName;
		password = Integer.parseInt(PIN);
		repassword = Integer.parseInt(RePIN);
				
		if (password == repassword){
			JOptionPane.showMessageDialog(null, "Account Created!!!");
			return Start();
		}
		else if (password != repassword){
			JOptionPane.showMessageDialog(null, "PIN does not match.\n\nTry Again.");
			return SignIn();
		}
		return main;
	}
	public static int LogIn(){
		JDialog.setDefaultLookAndFeelDecorated(true);
		JTextField no5 = new JTextField();
		JTextField no6 = new JPasswordField();
		
		Object[] login = {
				"Log In\n\nAccount Number", no5,
				"PIN", no6,
		};
		
		JOptionPane.showConfirmDialog(null, login, "SM's ATM Machine", JOptionPane.OK_CANCEL_OPTION);

		String IaccountNumber = no5.getText();
		String Ipassword = no6.getText();
		iaccountNumber = Integer.parseInt(IaccountNumber);
		ipassword = Integer.parseInt(Ipassword);
				
		if(accountNumber == iaccountNumber && password == ipassword) return WidDep();
		else if (accountNumber != iaccountNumber || password != repassword){
			JOptionPane.showMessageDialog(null, "Invalid Account Number / Password\n\nTry Again.",null,JOptionPane.OK_CANCEL_OPTION);
			return Start();
		}		
		return main;
		}
	public static int WidDep(){
		
		String Choice2 = JOptionPane.showInputDialog("Welcome " + accountName + "\n\n*Note: You have Php " +money+" as initial deposit.\n\n[1] Deposit\n[2] Withdrawal\n[3]Log out");
		int choice2 = Integer.parseInt(Choice2);
		
		if (choice2 == 1)
			return Deposit();
		else if (choice2 == 2)
			return Withdraw();
		else if (choice2 == 3){
		JOptionPane.showMessageDialog(null, "Successfully Logged Out.\n"+"Thank You For Using Our ATM Machine" );
		return Start();}
		else{
			JOptionPane.showMessageDialog(null,"Invalid Choice.\n\nTry Again.",null, JOptionPane.OK_CANCEL_OPTION);
			return WidDep();
		}
	}	
	
	public static int Deposit(){
		
		String Add = JOptionPane.showInputDialog("Your Current Balance is Php " + money + "\n\nHow much would you like to deposit:");
		double add = Double.parseDouble(Add);
		if(add%500==0){
			money=money+add;	
			JOptionPane.showMessageDialog(null,"Money Successfully Deposited"+"\nDeposit:Php "+add+""+"\n\nYour remaining balance is Php " + money + "");
		}
		else if(add%.50==0){
			money=money+add;	
			JOptionPane.showMessageDialog(null,"Money Successfully Deposited"+"\nDeposit:Php "+add+""+"\n\nYour remaining balance is Php " + money + "");	
			
		}
		
else if(add>=50){
			JOptionPane.showMessageDialog(null,"Invalid Input!!",null, JOptionPane.ERROR_MESSAGE);
			add=money;
		}
else if(add>=20){
	JOptionPane.showMessageDialog(null,"Invalid Input!!",null, JOptionPane.ERROR_MESSAGE);
	add=money;
}
else if(add>=10){
	JOptionPane.showMessageDialog(null,"Invalid Input!!",null, JOptionPane.ERROR_MESSAGE);
	add=money;
}
else if(add<=1){	
	JOptionPane.showMessageDialog(null,"Invalid Input!!",null, JOptionPane.ERROR_MESSAGE);
	add=money;
}
	money = money;
		return WidDep();
	}	
	
	public static int Withdraw(){
		
		String Choice3 = JOptionPane.showInputDialog("[1] Savings Account\n[2] Available Balance\n[3] Log Out");
		double choice3 = Double.parseDouble(Choice3);				
		double drawable =  money - 500;
		
		if (choice3 == 1){
			String Withdrawn = JOptionPane.showInputDialog("How much money would you like to withdraw?");
			double withdrawn = Double.parseDouble(Withdrawn);
			balance = money;
			
			



 while(withdrawn==20000)
	{
	 JOptionPane.showMessageDialog(null,"Invalid Input!!",null, JOptionPane.ERROR_MESSAGE);
		return Withdraw();
	}	

	if (withdrawn <= drawable) {
		balance=balance-withdrawn;
		JOptionPane.showMessageDialog(null, "You have successfully Withdrawed Php " +withdrawn + "\n\nYour remaining balance is Php " + balance + "");
	}
	
	else if (withdrawn >= drawable) {
		JOptionPane.showMessageDialog(null, "Not ALLOWED To Withdrawed Php " + withdrawn + "\n\nYour remaining balance is Php " + balance + "");			
	
		JOptionPane.showMessageDialog(null, "Insufficient Balance In Account.\n\nTry Again");
	}
	money = balance;
	
	return WidDep ();}
		else if (choice3 == 2){
			JOptionPane.showMessageDialog(null," "+accountName	 +"\nYour remaining balance is Php " + money + "\n\nWithdrawable Amount: Php " + drawable+" ");
			return WidDep();}
		else if (choice3 == 3){
			JOptionPane.showMessageDialog(null, "Successfully Logged Out."+"\nThank You For Using Our ATM Machine ");
			return LogIn();}
		else{
			JOptionPane.showMessageDialog(null,"Invalid Choice.\n\nTry Again.",null, JOptionPane.OK_CANCEL_OPTION);
			return Withdraw();
		}
	}	
}
	