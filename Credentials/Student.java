public class Student {
String surname;
String firstName;
String middleInitial;
String dateofBirth;
String studentNumber;
String studentEmailAddress;
boolean iamAwesome; 
String amIAwesome;

public Student(String srn, String frn, String mdi, String dob, Boolean iaws){
    surname = srn;
    firstName = frn;
    middleInitial = mdi;
    dateofBirth = dob;
    iamAwesome = iaws;

    System.out.println("Annyeong Jeoneun " + surname  + firstName + middleInitial + "\n" + "I was born on " + dateofBirth + "\n" + "iamAwesome " + iamAwesome);
}
public void sayMyStudentNumber(){
    System.out.println("My Student Number is " + studentNumber);

}
public void sayMyStudentEmailAdress(){
    System.out.println("My Student Email Address is " + studentEmailAddress);
}
public void sayamIAwesome(){
    System.out.println("Am i Awesome? " + amIAwesome);
}


}
