
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ICustomerDal ıCustomerDal = new OracleCustomerDal();
		ıCustomerDal.add(); */ 
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		customerManager.add();

	}

}
