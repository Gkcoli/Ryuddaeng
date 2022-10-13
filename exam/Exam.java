import java.util.Scanner;

public class Exam {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // Long exam 2
        // Total points possible (100 pts)
        // Methods and Conditions
        oddeven();
        priorcom();
        l();
        n();
        sizx();
    }
        // Part I
        // 1. Create a method.
        // 2. Call the method.
        // 3. Print result of the method.

        // ==============================================================================
        // 1. Create a method that will:
        // print "ODD" if the last two digits of your student number is an odd number
        // print "EVEN" if the last two digits of your student number is an even number.
        // (10 pts)
        static void oddeven(){
        System.out.println("1. ODD or EVEN numbers");
        System.out.print("Enter the last two digits of your student number: ");
        int lastTwoDigits = scan.nextInt();
        if(lastTwoDigits % 2 == 0)
           System.out.println(lastTwoDigits + " even");
        else 
        System.out.println(lastTwoDigits + " odd");
        }
        // ==============================================================================

        // 2. Create a method that will:
        // print "PRIME" if the last digit of your student number is a prime number
        // print "COMPOSITE" if the last digit of your student number is a composite
        // number.
        // print "NEITHER" if the last digit of your student number is neither a prime
        // nor a composite number.
        // (10 pts)
        static void priorcom(){
        System.out.println("2. PRIME or COMPOSITE number");
        System.out.print("Enter the last digit of your student number: ");
        int lastDigit = scan.nextInt();
        
        int i, m = 0, flag = 0;

        m = lastDigit/2;

        if (lastDigit==0||lastDigit==1){
            System.out.println("NEITHER");
        }   else{

            for(i = 2;i <= m; i++){
                if (lastDigit % i ==0){
                    System.out.println("COMPOSITE");
                    flag = 1;
                    break;
                }
            }

            if (flag==0){
                System.out.println("PRIME");
            }
        }
    }

        // ==============================================================================

        // 3. Create a method that will return the sum of the character length of your
        // firstname and your surname. (10 pts)
        static void l(){
        System.out.println("3. Length of your fullname");
        System.out.print("Enter your firstname: ");
        String firstName = scan.next();
        System.out.print("Enter your surname: ");
        String surName = scan.next();
        
        int a = firstName.length();
        int b = surName.length();
        System.out.println(a+b);
        }

        // ==============================================================================

        // 4. Create a method that will take three whole numbers and print the largest
        // number.
        static void n(){
        System.out.println("4. Largest Number");
        System.out.print("Enter first number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scan.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = scan.nextInt();
           int greater =
         Math.max(firstNumber, secondNumber);
           int greatest = greater;
           int z =
         Math.max(greatest, thirdNumber);
          System.out.println(z+"is the greatest number\n");
        }


        // ==============================================================================

        // 5. Create a method and think of a formula to get the last 6 digits of your
        // student number. (10 pts)
        static void sizx(){
        System.out.println("5. Last six digits");
        System.out.print("Enter your ten digit student number: ");
        int studentNumber = scan.nextInt();
        int stuNumber = studentNumber - 2022000000;
        System.out.println(stuNumber);
        
        
        // =========================================================================================================================

        // Part II
        // Print "valid" if the result is true.
        // Print "invalid" if the result is false.

        // ==============================================================================
        // 6. Create a condition to check if the entered student number is your student
        // number. (10 pts)
        System.out.println("6. Student number validation");
        System.out.print("Enter your ten digit student number: ");
        studentNumber = scan.nextInt();
        
        if (studentNumber == 2022103241) {
            System.out.println("valid");
        }else{
            System.out.println("invalid");
        }


        // ==============================================================================

        // 7. Create a condition to check if your firstname is in UPPERCASE and your
        // lastname is in lowercase. (10 pts)
        System.out.println("7. Case sensitivity check");
        System.out.print("Enter your firstname in UPPERCASE: ");

        String firstName = scan.next();
        System.out.print("Enter your lastname in lowercase: ");


        String surName = scan.next();
       
        if(firstName == firstName.toUpperCase() && surName == surName.toLowerCase()){
            System.out.println("valid");
        }else{
            System.out.println("invalid");
        }
      
     

        // ==============================================================================

        // 8. Create a nested condition that will ask the specialization of the student
        // is taking
        // depending if the student is a BSIT or BSCS student.

        // Condition 1
        // if the student is BSIT, ask again if the student is taking MWAA or MAA.

        // Condition 2
        // if the student is BSCS, ask again if the student is taking ML or DF.

        System.out.println("8. Nested conditions");
        System.out.print("Enter your enrolled course (BSIT or BSCS): ");
        String course = scan.next();
        switch(course){
            case "BSIT":
            System.out.println("Enter your selected specialization (MWA OR MAA): ");
            String specialization1 = scan.next();
            switch (specialization1){
                case "MWA":
                System.out.println("valid");
                break;
                case "MAA":
                System.out.println("valid");
                default:
                System.out.println("invalid");
                break;   
            }
        }

        switch(course){
            case "BSCS":
            System.out.println("Enter your selected specialization (DF OR ML): ");
            String specialization2 = scan.next();
            switch (specialization2){
                case "DF":
                System.out.println("valid");
                break;
                case "ML":
                System.out.println("valid");
                break;
                default:
                System.out.println("invalid");
                break;   
            }
        }
            
        // ==============================================================================

        // 9. Create a condition to check if the answer belongs to one of the possible
        // answers. (10 pts)

        // STEM
        // ICT
        // ABM
        // HUMSS
        // HOME ECONOMICS
        // ARTS AND DESIGN
        // TVL MARITIME

        System.out.println("9. Selection");

        System.out.println("STEM");
        System.out.println("ICT");
        System.out.println("HUMSS");
        System.out.println("HOME ECONOMICS");
        System.out.println("ARTS AND DESIGN");
        System.out.println("TVL MARITIME");
        System.out.print("Enter your SHS strand: ");

        String strand = scan.next();
        switch(strand){
            case "STEM":
                System.out.println("Valid");
               break;
            case "ICT":
                System.out.println("Valid");
               break;
            case "HUMMS":
                System.out.println("Valid");
               break;
            case "HOME ECONOMICS":
                System.out.println("Valid");
               break;
            case "ARTS AND DESIGN":
                System.out.println("Valid");
              break;
            case "TVL MARITIME":
                System.out.println("Valid");
              break;
           default:
                System.out.println("Invalid");
                 
                  
         

        }

        // ==============================================================================

        // 10. Create a condition to check if your student email address contains the
        // following pattern:
        // - Your surname
        // - The string "@students.national-u.edu.ph"
        // (10 pts)
        System.out.println("10. Validate student email address ");
        System.out.print("Enter your student email address: ");
        String studentEmailAddress = scan.next();
        
           
        if(studentEmailAddress.contains("@students.national-u.edu.ph") && studentEmailAddress.contains("colinaresgl")){
            System.out.println("valid");
        }
        else{
            System.out.println("invalid");
        }
     
        scan.close();
    }
}
