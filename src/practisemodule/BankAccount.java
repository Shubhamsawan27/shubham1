package practisemodule;

	abstract class BankAccount {
		protected int id;
	 	protected float balance;
	 	
	 	public BankAccount(int id, float balance) {
			super();
			this.id = id;
			this.balance = balance;
		}
	 	
	 	abstract float calculateInterest(); 
	}


	 	

