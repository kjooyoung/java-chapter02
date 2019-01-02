package com.duzone.paint.shape;

import com.duzone.paint.i.Drawable;

public abstract class Shape implements Drawable {
	private String lineColor;
	private String fillColor;

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	// abstract 클래스는 객체로 만들면 안된다.
//	public abstract void draw();
	// interface Drawable 생성 후 주석 처리
}
