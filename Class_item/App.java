public class App {

    public static void main(String[] args){

        Items shield = new Items(190, 8.1, 1, "Can protect you", true, "protector");
        shield.sayitemType();
        
        Items sword = new Items(120, 9.2, 2, "Can slice the head", true, "Long sword");
        sword.sayitemType();

        Items staff = new Items(18, 11, 1, "Can pierce enemy", false, "Spear");
        staff.sayitemType();
    }
}
