public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner s = new Scanner(System.in);

        int age = 18;
        boolean isVerified = false;

        if(age >= 18 && isVerified)
            System.out.println("Access Granted by the Owner");
        else if(age >= 18 && !isVerified)
            System.out.println("Access Not Granted by the Owner");
        else 
            System.out.println("Access Denied");
    }
}
