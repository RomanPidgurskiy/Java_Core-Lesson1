package ua.lviv.lgs;

public class Rectangle {

	private int width;
	private int length;
	
	Rectangle() {
		this.width = 2;
		this.length=3;
	}
	 
	Rectangle(int width, int length){
		this.width= width;
		this.length = length;
			
	}
	
	public String toString() {
		return "Square rectangle = " +(width*length) + 
				"  Perimeter of the rectangle = " + (length*2+width*2);
	}
	


}
