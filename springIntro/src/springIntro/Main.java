package springIntro;

public class Main {
	
	public static void main(String[] args) {
		CustomerManager manager = new CustomerManager(new MySqlCustomerDal());
		manager.add();
		
	}
	
	//IoC - Inversion of Control
	//Factory Design Pattern
	//Dependency Injection

}
