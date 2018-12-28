package chapter02;

public class SwapTest {

	public static void main(String[] args) {
		//
		// call by value
		//
		int a = 10;
		int b = 20;
		System.out.println(a + " : " + b);
		// swap
		// int temp = a;
		// a = b;
		// b = temp;
		swap(a, b);
		System.out.println(a + " : " + b);

		//
		// call by reference
		//
		Value m = new Value(); // 기본 생성자가 생성되기 때문에 오류가 발생하지 않는다
		m.value = 10;
		Value n = new Value();
		n.value = 20;

		System.out.println(m.value + " : " + n.value);
		swap(m, n);
		System.out.println(m.value + " : " + n.value);
	}

	public static void swap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
	}

	public static void swap(Value i, Value j) {
		int temp = i.value;
		i.value = j.value;
		j.value = temp;

		// Integer 객체는 불변객체이다
		// 불변객체 : 값이 세팅이 되면 값을 변경할 수 없다.
		// Integer i2 = 10; // 자동으로 객체 형식으로 바꿔준다(오토박싱)
		// Integer i2 = new Integer(10); // 사용 X
		// int j2 = i2; // 객체인 i2를 int형에 넣는다(x)아웃박싱
		// int j2 = i2.intValue();
	}
}
