import java.util.*;
class concatenate
{
 public static void main(String args[])
 {
  concatenate obj =new concatenate();
  obj.concatenate("Akhil"+" "+"Krishnan");
  obj.concatenate("5"+"6");
 } 
 void concatenate(int a)
 {
  System.out.println("concatenated no is: "+a);
 }
 void concatenate(String a)
 {
  System.out.println("Concatenated string: "+a);
 }
} 
