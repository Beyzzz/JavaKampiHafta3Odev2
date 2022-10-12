
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		BaseLogger [] Loggers = new BaseLogger[] {new DatabaseLogger(), new FileLogger(), new EmailLogger()};
		for(BaseLogger logger : Loggers) {
			logger.log("log mesajı"); */
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		  customerManager.add();
		}
	}


