package chapter02;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods goods = new Goods(); // 지역 변수 stack 영역
		goods.setName("nikon");
		goods.setPrice(44000);
		goods.setCountSold(100);
		goods.setCountStock(50);
		
		goods.showInfo(); // 정보값 전시
		System.out.println(goods.calDiscountPrice(0.3f));
		
		
		Goods goods2 = new Goods();
		Goods goods3 = new Goods();
		
		System.out.println(Goods.countOfGoods); // 객체 생성될 때마다 생성자가 실행 되기 때문에 값이 3이 출력된다.
	}

}
