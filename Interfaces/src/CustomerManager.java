
public class CustomerManager {
	private ICustomerDal ıcustomerDal;
	CustomerManager(ICustomerDal ıcustomerDal){
		this.ıcustomerDal = ıcustomerDal;
		
		
	}
	public void add() {
		// iş kodları yazılır 
		ıcustomerDal.add();
		
		
	}

}
