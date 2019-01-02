package com.duzone.paint.point;

public class ColorPoint extends Point {
	private String color;

	public ColorPoint() {
		
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y); // 부모의 변수
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// 오버라이드
	@Override // Annotation, 태그
	public void show() {
		// 부모 클래스인 Point의 private int x, private int y 대신 getX, getY 사용
		System.out.println("점[x=" + getX() + ", y=" + getY() + ", color = " + color + "]을 그렸습니다.");
	}

}
