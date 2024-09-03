package EBI;

import java.util.List;

public class Lab1 {

    public static void main(String[] args) {
        // Create instances of Rectangle and Circle
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();
        Circle circ1 = new Circle();
        Circle circ2 = new Circle();

        // Create ArrayList of Rectangle and add rectangles
        List<Rectangle> rectangles = List.of(rect1, rect2);

        // Create ArrayList of Shape (including Rectangle and Circle) and add shapes
        List<Shape> shapes = List.of(rect1, rect2, circ1, circ2);
        
        test newTest = new test();
        newTest.drawShapes(rectangles);
        newTest.drawShapes(shapes);
    }
    
    public static abstract class Shape {
    	public abstract void draw();
    }
    
    public static class Rectangle extends Shape {
    	 public void draw() {
    		System.out.println("drawing a rectangle");
    	}
    }
    
    public static class Circle extends Shape {
    	 public void draw() {
    		System.out.println("drawing a circle");
    	}
    }
    
    
    public static class test {
    	public void drawShapes(List<? extends Shape> shapes) {
    		for(Shape x : shapes) {
    			x.draw();
    		}
    		
    	}
    }
    
        
}