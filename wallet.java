import java.util.*;
import java.sql.*;
public class wallet
{

	String name;
	int pass;
	int balance;
	int addbalance;
	int withdraw;
	Scanner s = new Scanner(System.in);

	public void login()
	{
		System.out.print("Enter Your Name:-");
		name = s.next();
		System.out.print("Enter Your Password:-");
		pass= s.nextInt();

		
	}
		public void signup()
	{
		System.out.print("Enter Your Name:-");
		name = s.next();
		System.out.print("Enter Your Password:-");
		pass= s.nextInt();
		

		
	}
	public void AddBalance()
	{
		System.out.println("Enter The Ammount You Want To Add:-");
		addbalance =s.nextInt();
		balance+=addbalance;
		System.out.println("Ammount Added Succesfull...!!!");
		System.out.println("-----------------------------------");
	}
		public void Balance()
	{
		System.out.println("Your Current Balance Is:-"+balance);
		System.out.println("-----------------------------------");
		
	}
	public void Withdraw()
	{
		System.out.println("Enter The Ammount You Want Withdrawl:-");
		withdraw = s.nextInt();
		balance-=withdraw;
		System.out.println("Withdrawl Succesfull...!!!");
		System.out.println("-----------------------------------");
	}

	public static void main(String[] args)
	 {
	 	
		 
		 	
	 	Scanner s = new Scanner(System.in);
	 	int menu;
	 	int option;
	 	wallet w1 = new wallet();
	 	System.out.println("PRESS 1 FOR LOGIN");
	 	System.out.println("PRESS 2 FOR SIGN UP");
	 	option = s.nextInt();
	 	if (option==1) {
	 		
	 	w1.login();
	 	}
	 	else if (option==2 )
	 	{
	 		w1.signup();		
	 	}
	 	System.out.println("----Welcome To Your E-Wallet----");
	 	while (true) 
	 	{	
	 	System.out.println("1.Current Balance");
	 	System.out.println("2.Add Money");
	 	System.out.println("3.Withdraw");
	 	System.out.println("4.Exit");
	 	menu = s.nextInt();

	 	if (menu == 1) {
	 			w1.Balance();
	 	}
	 	else if (menu == 2) {
	 		w1.AddBalance();
	 	}
	 	else if (menu == 3) {
	 		w1.Withdraw();
	 	}
	 	else if (menu == 4) {
	 		break;
	 	}
	 }
	
	
	 
	 
	}
	
}