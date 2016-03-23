import javax.swing.JOptionPane;
import java.io.InputStream.*;
import java.util.Scanner;

public class atm{
	
	public static void main(String[] args) {
		String name;
		Scanner scanner= new Scanner (System.in);
		name=JOptionPane.showInputDialog("Enter Your Name: ");
		String AGE;
		int AID,age;
		AGE=JOptionPane.showInputDialog("Enter Your Age: ");
		age=Integer.parseInt(AGE);
		AID=age*365;
		
		if(AID<=5475){
			JOptionPane.showMessageDialog(null,"Nice To Meet you " + name + "!" + "\n" + "You're approximately " +AID+ " today!" + "\n" + " SORRY you are NOT qualified to DRIVE and You are NOT qualified to VOTE!");

		}
		else if((AID>=5840) && (AID<=6205)){
			JOptionPane.showMessageDialog(null,"Nice To Meet you " + name + "!" + "\n" + "You're approximately " +AID+ " today! " + "\n" + " CONGRATS you are QUALIFIED to DRIVE But you are NOT qualified to VOTE!");
			
		}
		else{
			JOptionPane.showMessageDialog(null,"Nice To Meet you " + name + "!" + "\n" + "You're approximately " +AID+ " today!" + "\n" + "CONGRATS you are QUALIFIED to DRIVE and to VOTE!");
	
		}
	}

}
