import java.util.*;
class area
{
 public static void main(String args[])
 {
  area obj = new area();
  obj.area(3);
  obj.area(4,6);
  obj.area(7.5,8.5);
 }
 void area(int a)
 {
  double circle=3.14*a*a;
  System.out.println("Area of the circle is "+circle);
 }
 void area(int a,int b)
 {
  double triangle=0.5*(a*b);
  System.out.println("Area of the triangle is "+triangle);
 }
 void area(double a,double b)
 {
  double rectangle=a*b;
  System.out.println("Area of the rectangle is "+rectangle);
 }
}
