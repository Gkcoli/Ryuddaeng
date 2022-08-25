public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();
        knight.sayMyStrength();
        knight.sayMyAgility();
        knight.sayMyIntelligence();

        Character barbarian = new Character();

        barbarian.strength = 0;
        barbarian.agility = 5;
        barbarian.intelligence = 10;
        barbarian.name = "Vigor";
        barbarian.sayMyName();
        barbarian.sayMyStrength();
        barbarian.sayMyAgility();
        barbarian.sayMyIntelligence();


        Character monk = new Character();

        monk.strength = 5;
        monk.agility = 10;
        monk.intelligence = 0;
        monk.name = "Lee";
        monk.sayMyName();
        monk.sayMyStrength();
        monk.sayMyAgility();
        monk.sayMyIntelligence();

        Character archer = new Character();

        archer.strength = 3;
        archer.agility = 8;
        archer.intelligence = 10;
        archer.name = "Kate";
        archer.sayMyName();
        archer.sayMyStrength();
        archer.sayMyAgility();
        archer.sayMyIntelligence();

        Character priest = new Character();

        priest.strength = 2;
        priest.agility = 1;
        priest.intelligence = 8;
        priest.name = "John";
        priest.sayMyName();
        priest.sayMyStrength();
        priest.sayMyAgility();
        priest.sayMyIntelligence();




    }
}
