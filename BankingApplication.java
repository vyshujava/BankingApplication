import java.util.*;
public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount obj = new  BankAccount("xyz" , "BA0001");
		obj.showMenu();
		
    	}
	
	
   } 		
		
		
	class BankAccount {
		
		String customerName; 
		int balance ; 
		int pt ; // previousTransaction; 
		String customerId;
	    
		
		// constructor - to get the customer details 
		
		BankAccount (String customerName , String customerId ) {
			
			customer name = cname ;
			customerId = cid;
			
		}
		
		// deposit
		
		void deposit (int amount)
		{
			if (amount != 0 ) {
				balance = balance + amount ; 
				pt = amount ;
			}
		}	
		
		// with drawal 
			
			void withdraw (int amount) {
				
				if (amount != 0 ) {
					balance = balance - amount ;
					pt = - amount ;
					
				}
			}
		
			// TO CHECK PREVIOUS TRANSACATION 
			
			void getPt() {
				
				if (pt > 0 ) {
					System.out.println("deposited amount ": +pt);
				}
					else if (pt < 0) {
						
						System.out.println("withdrawn amount " +Math.abs(pt) ); // abs method will convert a negative value to postive 
					}
				
					else {
						System.out.println("no transaction occured");
					}
				
				}
			
			void showMenu() {
				
				char select option = 0 ; // initialisation 
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Welcome " +customerName );
				System.out.println("Id  " +customerId );
				System.out.println(\n );
				System.out.println("A : check balance");
				System.out.println("B : Deposit");
				System.out.println("c : Withdraw ");
				System.out.println("D : previous transacation" );
				System.out.println(" E : exit " );
		
		
		// do while loop 
				
			do {
				
			System.out.println("enter an option : ");
			option = sc.next().charAt(0);
			
			switch (option) {
			
			}
			case : 'A' ;
			
			System.out.println("balance = " +balance);
			break; 
			
			case : 'B';
			
			System.out.println("enter amount to deposit : " );
		    int amount 	=sc.nextInt();
		    deposit(amount);
		    break;
		    
			case : 'C';
			
			
			System.out.println("enter amount to withdraw :");
			int amount2 = sc.nextInt();
			withdraw(amount2);
			break;
			
			
			case : 'D';
			
			getPt; 
			break;
			
			case :'E';
			System.out.println(thanks);
			break;
		
			default ; 
			
			System.out.println("try again");
			break;
		
			}
			
			while (option != 'E')
				
				System.out.println("Thank You ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

		
			
		}

}
