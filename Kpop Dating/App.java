import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        // Dating App Game

        char swipe;
        String match = "";

        System.out.println("Welcome to KpopLeftnRight");
        System.out.println("Swipe Left to ignore or Swipe Right to match!");
        System.out.println(" ");

        System.out.println("1.  Ryujin");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'L') {
            match = match + " Ryujin";
        }

        System.out.println("2. Karina");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'L') {
            match = match + " Karina";
        }
   
        System.out.println("3. Wendy");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'L') {
            match = match + " Wendy";
        }
 
        System.out.println("4. Jeongyeon");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'L') {
            match = match + " Jeongyeon";
        }

        System.out.println("5. Liz");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'L') {
            match = match + " Liz";
        }

        System.out.println("6. Yunjin");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'L') {
            match = match + " Yunjin";
        }

        System.out.println("7. Yeji");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'L') {
            match = match + " Yeji";
        }

        System.out.println("8. Jennie");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'L') {
            match = match + " Jennie";
        }

        System.out.println("9. Sejeong");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'L') {
            match = match + " Sejeong";
        }

        System.out.println("10. Somi");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'L') {
            match = match + " Somi";
        }
       
        System.out.println("11. Irene");
        System.out.println("Swipe left or Swipe Right? (press L or R)");

        swipe = scan.next().charAt(0);
        
        if (swipe == 'L') {
            match = match + " Irene";
        }

        System.out.println("You will be matched with: " + match + " if they also swipe you right :)");

        System.out.println("Thank you for playing :)");
    }
}
