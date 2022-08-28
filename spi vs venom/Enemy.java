public class Enemy {
    // Enemy attributes
    int damage;
    int health;
    int armor;
    boolean hasMagicImmunity;
    String name;

    // Enemy method
    public void enemyDialogue() {
        System.out.println("Fear Spiderman i am " + name + " and I deal " + damage + " damage! ");
    }
    public void enemyQuip(){
        System.out.println("You cannot beat me Spiderman I will end you");
    }

}
