package ua.lviv.lgs;

public class Circle {
	
	private double area;
	private double length_Circle;
	
	
	    public double getAre(){
	       return area;
	        }

	    public void setAre(double diametr){   
	    	this.area = 0.25*3.14*Math.pow(diametr,2); 
	        } 
	
	    
	    public double getLength(){
		       return length_Circle ;
		    }

	    public void setLength(double radius){   
		    	this.length_Circle = 2*3.14*radius; 
		    }
	

}
