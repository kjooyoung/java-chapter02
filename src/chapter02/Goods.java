package chapter02;

public class Goods {
	// Instance 변수
	private String name;
	private int price;
	private int countStock;
	private int countSold;

	public static int countOfGoods; // instance변수 : static 형식으로 시작하며 변수 값이 하나만 생김

	public Goods() {
		countOfGoods += 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price < 0) {
			price = 0;
		} // 조건값 설정
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

	public void showInfo() {
		System.out.println("상품이름 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("재고량 : " + countStock);
		System.out.println("판매량 : " + countSold);
	}

	public int calDiscountPrice(float discountRate) {
		return price - (int)(price * discountRate);
	}
}
