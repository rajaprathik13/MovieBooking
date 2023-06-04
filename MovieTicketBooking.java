import java.util.Scanner;
public class MovieTicketBooking {
public static void main(String[] args) {
Demo d = new Demo ();
d.getname();
}
}
class Demo{
static Scanner sc = new Scanner(System.in);
static String [] movieList = {"1) Ponniyin Selvan2", "2) Yaathisai", "3) KFG-2", "4) Maanadu", "5) Leo", "6) Vikram"};
public static void getname() {
String name;
System.out.println("Enter your name: ");
name= sc.nextLine();
System.out.println("WELCOME "+name);
getmovie ();
}
public static void getmovie() {
System.out.println("Recommended Movies Specially For You: ");
for (int i=0; i<movieList.length; i++) {
System.out.println(movieList[i]);
}
int choice = sc.nextInt ();
  System.out.println("Please Confirm: ");
  System.out.println(movieList[choice-1]);
getseat();
}
     public static void getseat() {
          int n;
          System.out.println("Please Enter the Number of seats you Needed");
          n=sc.nextInt();
          int [] arr = new int[n];
          System.out.println("Please choose the Seat Numbers");
          for (int i=0; i<n; i++) {
          arr[i] = sc.nextInt ();
          }
          int amount = n*150; //1 ticket cost is 150//
          System.out.println("Total amount to pay: "+amount);
          System.out.println("Please select your Bank to Pay ");
          int bank=1;
          while(bank==1) {
          System.out.println("1) Axis Bank");
          System.out.println("2) ICIC Bank");
          System.out.println("3) HDFC Bank");
          System.out.println("4) UPI Transactions");
          int bak = sc.nextInt ();
          switch (bak) {
          case 1:
        	  System.out.println("Welcome to Axis Bank");
        	  break;
        	  case 2:
        	  System.out.println("Welcome to ICIC Bank");
        	  break;
        	  case 3:
        	  System.out.println("Welcome to HDFC Bank");
        	  break;
        	  case 4:
        	  System.out.println("Welcome to UPI Transactions");
        	  break;
        	  }
        	  break;
        	  }
        	  System.out.println("Enter the amount :");
        	  int amountpay = sc.nextInt ();
        	  if(amountpay == amount) {
        	  System.out.println("Your payment is Successfull ");
        	  System.out.println("Your seat has Been Successfully Confirmed and booked");
        	  System.out.println("Thank you for Choosing Us");
        	  System.out.println("Enjoy Your Movies with your Loved Ones, Have a Great Day:)");
        	  }else {
        		  System.out.println("Your Payment is Failure Please try Again ");
        	  }
}
}
