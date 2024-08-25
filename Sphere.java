package Critical_Thinking;


public class Sphere extends Shape {
	
	
	
	double radius;
	
	Sphere(double radius) {
		this.radius = radius;
	}
	
	public double surface_area() {
		Sphere rad = new Sphere(1.25);
		double surface_area = 4 * Math.PI * Math.pow(rad.radius, 2);
		return surface_area;
	}

	
	public double volume() {
		Sphere rad = new Sphere(1.25);
		double volume = (4.0 / 3.0) * Math.PI * Math.pow(rad.radius, 3);
		return volume;
	}
	
	
	
	
	public String toString() {
		String vol = Double.toString(volume());
		String surf = Double.toString(surface_area());
		return vol + " " + surf ;
	}
	
	Sphere() {
		toString();
	}
	
	public String run (String[] args) {
		String vol1 = Double.toString(volume());
		String surf1 = Double.toString(surface_area());
		System.out.println("Surface Area and Volume of the Sphere is: " + surf1 + " and " + vol1);
	    return ""; 
	  }
	

	public static void main(String[] args) {
		Sphere runner = new Sphere();
		String out = runner.run(args);
	}

}
