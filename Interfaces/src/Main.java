
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ICustomerDal ─▒CustomerDal = new OracleCustomerDal();
		─▒CustomerDal.add(); */ 
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		customerManager.add();

	}

}
