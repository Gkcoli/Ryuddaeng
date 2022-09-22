import java.util.Scanner;

public class App {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        myPizzaOrder();
    }

    static void myPizzaOrder() {

        System.out.println("Welcome to Pizzaria! ");

        System.out.println("Please select from our menu:");
        System.out.println("Enter A if you want a ------Garlic Shrimp Pizza it costs------ 799.00$ ");
        System.out.println("Enter B if you want a -----Pepperoni Pizza it costs------ 750.00$ ");

        System.out.print("Enter your choice here: ");
        char choice = scan.next().charAt(0);

        String pizza = "";
        double price = 0;

        switch (choice) {
            case 'A':
                pizza = "-----Garlic Shrimp Pizza-----";
                price = 799.00;
                break;
            case 'B':
                pizza = "-----Pepperoni Pizza-----";
                price = 750.00;
                break;
            default:
                System.out.println("Invalid Order------------Please Try Again:< ");
                break;
        }

        System.out.println("What type of size would you like to get? ");
        System.out.println("S = small");
        System.out.println("M = medium");
        System.out.println("L = large");

        char pizzaSize = scan.next().charAt(0);

        String Size = "";

        switch (pizzaSize) {
            case 'S':
                Size = "Small";
                break;

            case 'M':
                Size = "Medium";
                break;

            case 'L':
                Size = "Large";
                break;

            default:
                System.out.println("Couldn't get your size order--------Please Try Again:< ");
                break;


        }

        
        System.out.println("What type of crust would you like?");
        System.out.println("H = Hand Tossed");
        System.out.println("T = Thin Crust");
        System.out.println("F = Stuffed Crust");

        char pizzaCrust = scan.next().charAt(0);

        String Crust = "";

        switch (pizzaCrust) {
            case 'H':
                Crust = "Hand tossed";
                break;
            
            case 'T':
                Crust = "Thin Crust";
                break;
            
            case 'F':
                Crust = "Stuffed Crust";
                break;

            default:
                System.out.println("Couldn't get your crust choice-------Please Try Again:< ");
                break;
        }

        System.out.println("How many boxes would you like?");
        System.out.println("Amount: ");
        double Amount = scan.nextDouble();


        price = price * Amount;
        System.out.println("Your order is a: " + Size + " sized " + Crust +" "+ pizza );
        System.out.println("Your total amount is $: " + price);

        scan.close();
    }
}
