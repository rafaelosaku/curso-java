package entities;

public class Triangle {

	public double a;
	public double b;
	public double c;

	public double area() {
		double p = (a + b + c) / 2.00;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

/*	Triangle x, y;

	x=new Triangle();y=new Triangle();

	System.out.println("Enter the measures of triangle X:");x.a=sc.nextDouble();x.b=sc.nextDouble();x.c=sc.nextDouble();

	System.out.println("Enter the measures of triangle Y:");y.a=sc.nextDouble();y.b=sc.nextDouble();y.c=sc.nextDouble();

	double areaX = x.area();

	double areaY = y.area();

	System.out.printf("Triangle X area: %.4f%n",areaX);System.out.printf("Triangle Y area: %.4f%n",areaY);

	if(areaX>areaY)
	{
		System.out.println("Larger area: X");
	}else
	{
		System.out.println("Larger area: Y");
	}*/
}
