import java.utill.Scanner;
class addnumbers
{ 
 public static void main(String args[])
 {int x,y,z;
   System.out.println("enter two no.");
Scanner in=new Scanner(System.in);
x=in.nextInt();
y=in.nextInt();
in.close();
z=x+y;
System.out.println("sum="+z);
  }
}
