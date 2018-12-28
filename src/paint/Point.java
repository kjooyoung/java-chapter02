package paint;

public class Point {
	private int x;
	private int y;

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void show() {
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
	}

	// 메소드 오버로딩
	// 하나의 메세지로 두가지 기능을 한다
	public void show(boolean visible) {
		if (visible) {
			show();//중복성을 피한다
		} else {
			System.out.println("점[x=" + x + ", y=" + y + "]을 지웠습니다.");
		}
	}
}
