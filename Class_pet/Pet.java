public class Pet {
    String name;
    double trustlevel;
    int petlevel;
    boolean ishappy;
    
    

    public Pet(String nm, double trlvl, int petlvl, boolean ish){
        name = nm;
        trustlevel = trlvl;
        petlevel = petlvl;
        ishappy = ish;
    System.out.println("My name is " + name + "\n" + "My trust level is " + trustlevel + "\n" + "My pet level is " + petlevel + "\n" + "Is he/she happy? " + ishappy);
    }
    
}
