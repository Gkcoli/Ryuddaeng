Import java.util.Scanner;
public class Order{
    
    static Scanner scan = new Scanner(System.in);


    public static void main(String[]args){
        
        System.out.print("G'day maam/sir welcome to KFC ");

        System.out.print("Can i take your first order? ");
        String yourfirstOrder = scan.next();
        System.out.print("Enter the price of the payment ");
        Double yourfirstOrderprice = scan.nextDouble();

        
        System.out.print("Can i take your second order? ");
        String yoursecondOrder = scan.next();
        System.out.print("Enter the price of the payment ");
        Double yoursecondOrderprice = scan.nextDouble();



        System.out.print("Can i take your third order? ");
        String yourthirdOrder = scan.next();
        System.out.print("Enter the price of the payment ");
        Double yourthirdOrderprice = scan.nextDouble();

        Double totalamount = yourfirstOrderprice + yoursecondOrderprice + yourthirdOrderprice;
        System.out.println("Your order is " + yourfirstOrder + ", " + yoursecondOrder + ", and " + yourthirdOrder + " your total amount to pay is " + totalamount);


   }
    
}
