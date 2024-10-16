import java.util.Scanner;
public class Ques02 {
	
   public static int main() {
	   System.out.println("Menu: ");
	   System.out.println("1.Dosa\n2.Samosa\n3.Noodles\n4.Momos\n5.GenerateBill");
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt(); 
	   return n;  
   }
   public static void main(String[] args) {
	   
	   Scanner sc=new Scanner(System.in);
	   int choice=0;
	   int totalOrder=0;
	   while((choice=main())!=0) {
		   int q;
		   switch(choice) {
		   case 1: System.out.println("Enter Quantity : ");
		           q=sc.nextInt();
			       totalOrder+=q*30; 
		   break;
		   case 2: System.out.println("Enter Quantity : ");
	               q=sc.nextInt();
			       totalOrder+=q*15; 
		   break;
		   case 3: System.out.println("Enter Quantity : ");
	               q=sc.nextInt();
			       totalOrder+=q*25; 
		   break;
		   case 4:System.out.println("Enter Quantity : ");
	              q=sc.nextInt();
			      totalOrder+=q*12; 
		   break;
		   case 5: System.out.println("Total order is : "+ totalOrder);
		   System.out.println("Thank you for visiting us!");
		   System.exit(choice);
		   }   
		 
	   }
	      
   }
}
