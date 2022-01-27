import java.util.*;
public class studentdetails
{ 
  public static void main(String[] args)
   { 
        Scanner obj = new Scanner(System.in);
        student s = new student();
        System.out.print("Enter student name: ");
        String name = obj.nextLine();
        System.out.print("Enter thr roll_no: ");
        int roll_no = obj.nextInt(), marks[] = new int[5];
        System.out.println("Enter the marks: ");

        for (int i = 0; i < 5; i++)
        {
            marks[i] = obj.nextInt();
        }
        s.read(name, roll_no, marks);
        s.display();
    }
}

class student
 {
    String name;
    int roll_no, marks[] = new int[5];
    void read(String n ,int r, int[] m)
    {
       name = n;
       roll_no = r;
       marks = m;
    }

    void display()
     {

        System.out.println("Name: " + name);

        System.out.println("Roll_no: " + roll_no);

        System.out.println("Marks: " + marks[0] + " " + marks[1] + " " + marks[2] + " " + marks[3] + " " + marks[4]);

    }

}

