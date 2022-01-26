import java.util.*;
class perimeter
{
  public static void main(String args[])
  {
    perimeter obj=new perimeter(5);
    perimeter obj1=new perimeter(5,4);
  }
  perimeter(int a)
 {
  System.out.println("Perimeter of circle is "+(2*3.14*a));
 }
 perimeter(int a,int b)
  {
    System.out.println("Perimeter of rectangle is "+(2*(a+b)));
  }
}
    
