import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

    int  i,j,k;
     
     Scanner input = new Scanner(System.in);

     System.out.println("Input the three numbers ");
     
     System.out.println("Input your first number ");
     i = input.nextInt();

     System.out.println("Input your second number ");
     j = input.nextInt();

     System.out.println("Input your third number ");
     k = input.nextInt();

     int sum = i+j+k;
     int product = i*j*k;
     int average = sum/3;

    System.out.println("Sum " + sum);
    System.out.println("Product " + product);
    System.out.println("Average " + average);
