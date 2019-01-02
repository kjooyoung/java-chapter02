package com.duzone.paint.main;

import com.duzone.paint.i.Drawable;
import com.duzone.paint.point.ColorPoint;
import com.duzone.paint.point.Point;
import com.duzone.paint.shape.Circle;
import com.duzone.paint.shape.Rect;
import com.duzone.paint.shape.Shape;
import com.duzone.paint.shape.Triangle;
//import com.duzone.paint.shape.*;
import com.duzone.paint.text.GraphicString;

public class MainApp {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.setX(100);
		p1.setY(200);
//		drawPoint(p1);
		draw(p1);

		Point p2 = new Point(50, 50);
//		drawPoint(p2);
		draw(p2);
		System.out.println("------------------------------");
		// new ColorPoint();
		Point p3 = new ColorPoint();
		p3.setX(100);
		p3.setY(50);

		// p3 = (ColorPoint)p3.setColor("red"); // 우선순위 차이
		((ColorPoint) p3).setColor("red");
		// p3.show(true);
		// 부모인 Point의 Show() 메소드가 아니라 ColorPoint에서 오버라이드한 Show() 메소드가 호출된다.
		// p3.show(false);
//		drawPoint(p3);
		draw(p3);

		// 생성자 생성
		Point p4 = new ColorPoint(200, 100, "yellow");
//		drawPoint(p4);
		draw(p4);

		System.out.println("------------------------------");
		Shape triangle = new Triangle();
		triangle.setLineColor("balck");
		// Triangle t1 = (Triangle)triangle;
		// Down Casting -> 명시적( Exlicity )
		// t1.setX1(10);
		((Triangle) triangle).setX1(10);

		// Shape s = triangle;
		// drawTriangle(triangle);
		// draw(s);
		draw(triangle);

		System.out.println("------------------------------");
		Rect rect = new Rect();
		Shape r1 = rect;
		// Up Casting -> 암시적( Implicity )
//		drawRect(rect);
		draw(r1);

		System.out.println("------------------------------");
		Drawable circle = new Circle();
		// Circle로 만들어지는 객체는 Drawable의 객체라고도 할 수 있다.
//		drawCircle(	);
		draw(circle);

//		GraphicString gs = new GraphicString("Hello");
//		draw(gs);
		draw(new GraphicString("Hello"));

		// 연산자 instanceof 테스트
		// hierarchy 관계에서 형제끼리 instanceof 연산자는 사용이 불가능하다.
		Shape s = new Circle();
		System.out.println(s instanceof Shape);
		System.out.println(s instanceof Circle);
		System.out.println(s instanceof Rect);
		System.out.println(s instanceof Drawable);
		System.out.println(s instanceof Runnable);

		System.out.println("------------------------------");
		// Dawn Casting
		Circle c = (Circle) s;
		System.out.println(c instanceof Circle);
		System.out.println(c instanceof Shape);
		System.out.println(c instanceof Object);

		// 에러 : 계층 관계가 아닌 경우에는 연산을 할 수 없다.
		// System.out.println(c instanceof Rect);

	}

	// drawPoint 함수 생성, ColorPoint colorpoint를 생성하지 않고도 메소드 호출이 가능하다 public
//	static void drawPoint(Point point) {
//		point.show();
//	}
//
//	public static void draw(Shape shape) {
//		shape.draw();
//	}

	// 위 drawPoint, draw 메소드를 하나로 통합하기 위한 인터페이스 설계
	public static void draw(Drawable drawalbe) {
		drawalbe.draw();
	}

	// draw(Shape shape)를 이용하여 하나로 통합
//	  public static void drawTriangle(Triangle triangle) { triangle.draw(); }
//	  
//	  public static void drawRect(Rect rect) { rect.draw(); }
//	  
//	  public static void drawCircle(Circle circle) { circle.draw(); }

}
