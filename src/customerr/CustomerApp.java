package customerr;

import chapter02.Customer;

public class CustomerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		// protected는 E다른 패키지에서 접근 X
//		c.name = "둘리";
		c.setAge(10);
//		System.out.println("손님의 이름은 : "+ c.name + "  나이는 : " + c.getAge());
		// private는 외부에서 접근 X
		// c.age = 10;
	}

}
