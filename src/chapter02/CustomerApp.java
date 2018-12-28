package chapter02;

import chapter02.Customer;

//int i = 10; 외부변수
public class CustomerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();  // 지역변수, 함수에서 만들어지면 대체로 지역변수라 한다.
		// protected는 같은 패키지에서 접근 O
		c.name = "둘리";
		c.setAge(10);
		System.out.println("손님의 이름은 : " + c.name + "  나이는 : " + c.getAge());
		// private는 외부에서 접근 X
		// c.age = 10;
	}

}
