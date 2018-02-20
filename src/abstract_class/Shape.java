package abstract_class;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.Scanner;

abstract class Figure {
  double dim1;
	abstract void findArea();
	abstract void findPerimeter();
}
 class circle extends Figure
 {
	 double pi=3.14;
	 circle()
	 {
		 Scanner c=new Scanner(System.in);
		 System.out.println("Enter radius of circle ");
		 dim1=c.nextDouble();
	 }
	 void findArea()
	 {
		 
		 System.out.println("Area of circle with radius "+dim1+" is "+(pi*dim1*dim1));
		 findPerimeter();
	 }
	 void findPerimeter()
	 {
		System.out.println("Perimeter of circle with radius "+dim1+" is "+(2*pi*dim1)); 
	 }
 }
 class rectangle  extends Figure
 {
	 double dim2;
	 rectangle()
	 {
		Scanner c=new Scanner(System.in);
		 System.out.println("Enter side of rectangle ");
		 dim1=c.nextDouble();
		 dim2=c.nextDouble();
		 findArea();
		 findPerimeter();
	 }
	 
	 void findArea()
	 {
		 
		 System.out.println("Area of rectangle with sides "+dim1+" & "+dim2+" is "+(dim1*dim2));
	 }
	 void findPerimeter()
	 {
		System.out.println("Perimeter of rectangle with sides "+dim1+" & "+dim2+" is "+(2*(dim1+dim2))); 
	 }
 }
 class triangle extends Figure
 {
	 double dim2,dim3;
	 triangle()
	 {
	 Scanner c=new Scanner(System.in);
	 System.out.println("Enter side of triangle ");
	 dim1=c.nextDouble();
	 dim2=c.nextDouble();
	 findArea();
	 findPerimeter();
	 }
	 void findArea()
	 {
		 
		 System.out.println("Area of triangle with base & height "+dim1+" & "+dim2+" is "+(1.5*(dim1*dim2)));
	 }
	 void findPerimeter()
	 {
		System.out.println("Perimeter of triangle with sides "+dim1+" & "+dim2+" is "+(dim1+dim2+dim3)); 
	 }
 

 }
 public class Shape
 {
	 public static void main(String s[])
	 {

		 Figure f1[]=new Figure[6];
		 for(int i=0;i<f1.length;i++)
		 {
			 if(i<2)
			 {
				 f1[i]=new rectangle();
				 f1[i].findArea();
				 f1[i].findPerimeter();
			 }
			 else if(i>2&&i<4)
			 {
				 f1[i]=new circle();
				 f1[i].findArea();
				 f1[i].findPerimeter();
			 }
			 else
			 {
				 f1[i]=new triangle();
				 f1[i].findArea();
				 f1[i].findPerimeter();
			 }
		 }
		 
		 
	 }
 }
