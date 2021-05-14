package shapedraw;

public abstract class Shape {
	abstract void draw();

}
class Line extends Shape{
	void draw() {
		System.out.println("Drawing line");
		}
	
	
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("Drawing rectangle");
		}	
}
class Cube extends Shape{
	void draw() {
		System.out.println("Drawing cube");
		}	
}
class Abstraction{
	public static void main(String[] args) {
		Shape l=new Line();
		l.draw();
		Shape r=new Rectangle();
		r.draw();
		Shape c=new Cube();
		c.draw();
		
	}
}
