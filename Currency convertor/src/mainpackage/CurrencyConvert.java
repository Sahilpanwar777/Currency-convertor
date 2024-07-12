package mainpackage;
import java.util.Scanner;

import EuroProg.*;
import PoundProg.*;
import UsDollarProg.*;
import InrProg.*;
public class CurrencyConvert {
	
	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Currency Convertor.");
		System.out.println("Choose option from below to perform");
		
		System.out.println("Enter 1 for Euro Currency");
		System.out.println("Enter 2 for Pound Currency");
		System.out.println("Enter 3 for USD Currency");
		System.out.println("Enter 4 for INR currency");
		System.out.println("Enter 5 to choose to continue the program or to exit the program.");
		int a = sc.nextInt();

		switch(a)
		{
		case 1:
			System.out.println("Choose operation you want to perform");
			System.out.println("Choose 1 to convert EURO to INR");
			System.out.println("Choose 2 to convert EURO to USD");
			System.out.println("Choose 3 to convert EURO to POUND");
			System.out.println("Choose 4 to Know more about the Euro Currency");
			int a1 = sc.nextInt();
				switch(a1) {
				case 1:
					System.out.println("Enter the amount you want to convert into INR:");
					double d1 = sc.nextDouble();
					Euro_to_inr.m1(d1);
					break;
				case 2:
					System.out.println("Enter the amount you want to convert into USD: ");
					double d2 = sc.nextDouble();
					Euro_to_usd eu = new Euro_to_usd();
					eu.m1(d2);
					break;
				case 3:
					System.out.println("Enter the amount you want to convert into Pound: ");
					double d3 = sc.nextDouble();
					Euro_to_pound ep = new Euro_to_pound();
					ep.m1(d3);
					break;
				case 4:
					System.out.println("The euro (symbol: €; currency code: EUR) is the official currency of 20 of the 27 member states of the European Union. \n This group of states is officially known as the euro area or, more commonly, the eurozone.\n The euro is divided into 100 euro cents.");
					break;
				}
			break;
		
		case 2:
			System.out.println("Choose operation you want to perform");
			System.out.println("Choose 1 to convert Pound to INR");
			System.out.println("Choose 2 to convert Pound to EURO");
			System.out.println("Choose 3 to convert Pound to USD");
			System.out.println("Choose 4 to Know more about the Pound Currency");
			int a2 = sc.nextInt();
			switch(a2) {
			case 1:
				System.out.println("enter the amount you want to convert to INR:");
				double d1 = sc.nextDouble();
				Pound_to_inr.m1(d1);
				break;
			case 2:
				System.out.println("Enter the amount you want to convert to EURO: ");
				double d2 = sc.nextDouble();
				Pound_to_euro pe = new Pound_to_euro();
				pe.m1(d2);
				break;
			case 3:
				System.out.println("Enter the amount you want to convert to USD: ");
				double d3 = sc.nextDouble();
				Pound_to_usd pu = new Pound_to_usd();
				pu.m1(d3);
				break;
			case 4:
				System.out.println("Pound Sterling (ISO code: GBP) is the currency of the United Kingdom and nine of its associated territories.\n The pound (sign: £) is the main unit of sterling, and the word pound is also used to refer to the British currency generally,\n often qualified in international contexts as the British pound or the pound sterling.");
				break;
			}
			break;
	
		case 3:
			System.out.println("Choose operation you want to perform");
			System.out.println("Choose 1 to convert USD to INR");
			System.out.println("Choose 2 to convert USD to EURO");
			System.out.println("Choose 3 to convert USD to Pound");
			System.out.println("Choose 4 to Know more about the USD Currency");
			int a3 = sc.nextInt();
			switch(a3) {
			case 1:
				System.out.println("Enter the amount you want to convert to INR :");
				double d1 = sc.nextDouble();
				Usd_to_inr.m1(d1);
				break;
			case 2:
				System.out.println("Enter the amount you want ot convert to EURO: ");
				double d2 = sc.nextDouble();
				Usd_to_euro ue = new Usd_to_euro();
				ue.m1(d2);
				break;
			case 3:
				System.out.println("Enter the amount you want to convert to Pound: ");
				double d3 = sc.nextDouble();
				Usd_to_pound up = new Usd_to_pound();
				up.m1(d3);
				break;
			case 4:
				System.out.println("The United States dollar (symbol: $; currency code: USD; also abbreviated US$ to distinguish it from other dollar-denominated currencies; referred to as the dollar, U.S. dollar, American dollar, or colloquially buck) \nis the official currency of the United States and several other countries.\nThe Coinage Act of 1792 introduced the U.S. dollar at par with the Spanish silver dollar, divided it into 100 cents, and authorized the minting of coins denominated in dollars and cents.");
				break;
			}
			break;
		case 4:
			System.out.println("Choose operation you want to perform");
			System.out.println("Choose 1 to convert INR to USD");
			System.out.println("Choose 2 to convert INR to EURO");
			System.out.println("Choose 3 to convert INR to Pound");
			System.out.println("Choose 4 to Know more about the INR Currency");
			int a4 = sc.nextInt();
			switch(a4) {
			case 1:
				System.out.println("Entet the amount you want to convert to USD:");
				double d1 = sc.nextDouble();
				Inr_to_usd.m1(d1);
				break;
			case 2:
				System.out.println("Entet the amount you want to convert to EURO:");
				double d2 = sc.nextDouble();
				Inr_to_euro.m1(d2);
				break;
			case 3:
				System.out.println("Entet the amount you want to convert to Pound:");
				double d3 = sc.nextDouble();
				Inr_to_pound.m1(d3);
				break;
			case 4:
	            break;
			}
			break;
			default :
				System.out.println("choose 1 to continue the Program.");
				System.out.println("choose 2 to exit.");
				method1();
		
			
		}
		System.out.println("choose 1 to continue the Program.");
		System.out.println("choose 2 to exit.");
	
		method1();
	}
	
	public static void method1() {
	  Scanner sc = new Scanner(System.in);
	  int a=sc.nextInt();
	  if(a==1) {
		  main(null);
	  }
	  if(a==2) {
		 System.out.println("Thank YOU....♡♡♡♡");
	  }
	  }
}
