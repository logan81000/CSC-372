package Critical_Thinking;

public class ShapeArray extends Shape{
	
	ShapeArray() {
		
	}
	
	@Override
	public double surface_area() {
		return 0;
	}

	@Override
	public double volume() {
		return 0;
	}
	
	public String run (String[] args) {
		Sphere a = new Sphere();
		Cylinder b = new Cylinder();
		Cone c = new Cone();
		String Sphere = a.toString();
		String Cylinder = b.toString();
		String Cone = c.toString();
		String[] array = {"Surface Area and Volume of the Sphere is: " + Sphere, "Surface Area and Volume of the Cylinder is: " + Cylinder, "Surface Area and Volume of the Cone is: " + Cone};
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		return ""; 
	  }

	public static void main(String[] args) {
		ShapeArray runner = new ShapeArray();
		String out = runner.run(args);

	}



}
