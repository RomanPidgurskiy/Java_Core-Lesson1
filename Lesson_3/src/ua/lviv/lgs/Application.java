package ua.lviv.lgs;

public class Application {
  
	
	public static void main(String[] args) {
		
	 Rectangle a1 = new Rectangle(); 
	 Rectangle a2 = new Rectangle(25,30); 
	 
System.out.println(a1);
System.out.println(a2);
	 
    Circle diametr = new Circle();
   
    double result_area;
    diametr.setAre(10);
    result_area = diametr.getAre();
    System.out.println("Площа кола = "+result_area);
    
    double result_length;
    diametr.setLength(10);
    result_length = diametr.getLength();
    System.out.println("Довжина кола = "+result_length);
	
	}
}
