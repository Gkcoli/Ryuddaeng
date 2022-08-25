public class Character {
    // Attributes
    int strength;
    int agility;
    int intelligence;
    String name;

    // Constructor
    public Character(int str, int agi, int intel, String characterName) {
        strength = str;
        agility = agi;
        intelligence = intel;
        name = characterName;
        System.out.println("My name is " + name + "\n" + "My Strenght is " + strength + "\n" + "My Agility is " + agility + "\n" + "My Intelligence is "+ intelligence);
    }
}
