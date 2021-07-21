package practise;

public class practise {
	double pi=3.14;
	public double area(double radius)
	{
	if(radius<0)
	{
	return -1.0;
	}
	return pi*(radius *radius);
	}
	public static double area(double x,double y)
	{
	if(x<0&&y<0)
	{
	return -1.0;
	}
	return x*y;
	}
	public static void main (String[] args)
	{
	practise pr=new practise();
	System.out.println(pr.area(4));
	System.out.println(pr.area(4,5));

}
}
