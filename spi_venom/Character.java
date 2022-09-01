public class Character {
    // Character attributes
    int strength;
    int agility;
    int intelligence;
    String name;

    // Character method
    public void sayMyName() {
        System.out.println("Hello Alien Creep Im " + name + "\n" + "My Strenght is " + strength + "\n" + "My Agility is " + agility + "\n" + "My Intelligence is "+ intelligence);
    }
    public void sayQuip() {
        System.out.println("Im your friendly neighborhood " + name);
    }
}
