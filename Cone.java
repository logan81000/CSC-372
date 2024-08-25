package Critical_Thinking;

public class Cone extends Shape{
	
	double radius;
	double height;
	
	
	
	Cone(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	@Override
	public double surface_area() {
		Cone radAndhei = new Cone(5, 20);
		double surface_area = Math.PI*radAndhei.radius*(radAndhei.radius+Math.sqrt(Math.pow(radAndhei.height, 2) + Math.pow(radAndhei.radius, 2)));
		return surface_area;
	}

	@Override
	public double volume() {
		Cylinder radAndhei = new Cylinder(5, 20);
		double volume = Math.PI*Math.pow(radAndhei.radius, 2)*(radAndhei.height/3.0);
		return volume;
	}
	public String toString() {
		String vol = Double.toString(volume());
		String surf = Double.toString(surface_area());
		return vol + " " + surf ;
	}
	
	Cone() {
		toString();
	}
	
	public String run (String[] args) {
		String vol3 = Double.toString(volume());
		String surf3 = Double.toString(surface_area());
		System.out.println("Surface Area and Volume of the Cylinder is: " + surf3 + " and " + vol3);
	    return ""; 
	  }

	public static void main(String[] args) {
		Cone runner = new Cone();
		String out = runner.run(args);

	}

	

}
