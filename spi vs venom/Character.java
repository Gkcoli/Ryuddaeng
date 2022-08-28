public class App {
    public static void main(String[] args) {

        // Character Class
        Character Avenger = new Character();

        Avenger.strength = 10;
        Avenger.agility = 10;
        Avenger.intelligence = 10;
        Avenger.name = "Spiderman";
        Avenger.sayMyName();
        Avenger.sayQuip();

        // Enemy Class
        Enemy Symbiote = new Enemy();

        Symbiote.damage = 250;
        Symbiote.health = 500;
        Symbiote.armor = 100;
        Symbiote.hasMagicImmunity = false;
        Symbiote.name = "Venom";
        Symbiote.enemyDialogue();
        Symbiote.enemyQuip();

        
    }
}
