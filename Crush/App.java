import java.util.Scanner;

public class App{

    static Scanner scan = new Scanner(System.in);
    public static void main(String []args){

        String crushname = revealMyCrush();
        System.out.println(crushname);

        

    }
    static String revealMyCrush(){
        System.out.println("Im willing to reveal my crush");
        System.out.println("Input your name: ");

        String myName = scan.nextLine();

        System.out.print("This is my first crush: ");

        String nameofMyFirstCrush = scan.nextLine();

        System.out.print("This is my second crush: ");

        String nameofMySecondCrush = scan.nextLine();

        return myName + " Is Engaged to " + nameofMyFirstCrush + "\n" + myName + " Is Divorce With " + nameofMySecondCrush;

    

    }
    
}
