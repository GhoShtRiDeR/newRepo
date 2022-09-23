package assignmentConstructor;

public class Account {
	//Default Constructor is provided in java to facilitate the creation of new object.
	public long accountNo;
	public String customerName;
	static int count=0;
	/*Account(){
		count++;
		accountNo=31003002334L;
		customerName="Mohan Roy";
		System.out.println(count+". I am in Default Constructor");
	}
	*/
	/*Account(){
		accountNo=2385247513;
		customeName=JJGhosh;
		
		System.out.println("I am in Default Constructor");
	}
	*/
	//Since we have created a default constructor java does not provide another one.
	
	Account(long accountNo,String customerName){
		this.accountNo=accountNo;
		this.customerName=customerName;
		count++;
		System.out.println(count+". I am in Parameterised Constructor");
	}
	
	void showDetails() {
		System.out.println("=====================================================================");
		System.out.println("Account Number:- "+accountNo+"\nCustomer Name:- "+customerName);
		System.out.println("=====================================================================");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Account mohan = new Account();
		//mohan.showDetails();
		//this is not allowed as we already have a parameterised constructor and java will not provide another default constructor.
		
		//Account JJGhosh = new Account();
		//JJGhosh.showDetails();
		Account JJGhosh = new Account(303001013458l,"Jeet Jyoti Ghosh");
		JJGhosh.showDetails();
		
		Account Rakesh = new Account(303001001676l,"Rakesh Mohanty");
		Rakesh.showDetails();
		
		Account Rajat = new Account(303001011767l,"Rajat Padmawar");
		Account Salman= new Account(303001011798l,"Salman Hanfee");
		Rajat.showDetails();
		Salman.showDetails();
		
		
	}

}
