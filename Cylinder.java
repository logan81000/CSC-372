package Critical_Thinking;

public class Cylinder extends Shape{
	
	double radius;
	double height;
	
	
	
	Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	@Override
	public double surface_area() {
		Cylinder radAndhei = new Cylinder(5, 20);
		double surface_area = 2*Math.PI*radAndhei.radius * radAndhei.height + 2*Math.PI*Math.pow(radAndhei.radius, 2);
		return surface_area;
	}

	@Override
	public double volume() {
		Cylinder radAndhei = new Cylinder(5, 20);
		double volume = Math.PI*Math.pow(radAndhei.radius, 2)*radAndhei.height;
		return volume;
	}
	
	public String toString() {
		String vol = Double.toString(volume());
		String surf = Double.toString(surface_area());
		return vol + " " + surf ;
	}
	
	public String run (String[] args) {
		String vol2 = Double.toString(volume());
		String surf2 = Double.toString(surface_area());
		System.out.println("Surface Area and Volume of the Cylinder is: " + surf2 + " and " + vol2);
	    return ""; 
	  }
	
	Cylinder() {
		toString();
	}


	public static void main(String[] args) {
		Cylinder runner = new Cylinder();
		String out = runner.run(args);

	}


}
