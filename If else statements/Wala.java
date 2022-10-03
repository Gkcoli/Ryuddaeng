import java.util.Scanner;
public class App{

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.print("Ilagay Mo Edad Mo : ");
        int age = s.nextInt();

        if(age >= 18){
            System.out.println("Meron kang access kasi malaki kana");
         }else if(age >= 13){
            System.out.println("Kailangan mo pa nang 5 years bago makapasok");
        } else if(age >= 9){
            System.out.println("Wag ka muna dito please bata kapa");
        }else {
            System.out.println("Wala kang access kasi Wala katalagang magagawa");
        }
    }
}
