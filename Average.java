import java.util.*;
class Average
{
  public static void main(String[]args)
  {
  System.out.println("Enter the marks of below subjects out of 100: ");
  
  Scanner sc=new Scanner(System.in);
  System.out.println("Subject A : ");
  int a=sc.nextInt();
  System.out.println("Subject b : ");
  int b=sc.nextInt();
  System.out.println("Subject C : ");
  int c=sc.nextInt();
  System.out.println("Subject D : ");
  int d=sc.nextInt();
  System.out.println("Subject E : ");
  int e=sc.nextInt();
  
  int Total=a+b+c+d+e;
  System.out.println("Total Marks you have got is : " + Total);
  
  float Per = Total/5;
  System.out.println("Percentage is : " + Per);
  
  float Average = Total/5;
  System.out.println("Average is : " + Average);
  
  if (Per>=70 && Per<100) {
	  System.out.println("Congrats you have got 'A' Grade");
  } 
  else if (Per>=60 && Per<70) {
	  System.out.println("Congrats you have got 'B' Grade");
  }
  else if (Per>=35 && Per<60) {
	  System.out.println("Congrats you have got 'C' Grade");
  }
  else {
	  System.out.println("Unfortunately you are fail, kindly reattempt the exam..!");
  }
  
 }
 
}
