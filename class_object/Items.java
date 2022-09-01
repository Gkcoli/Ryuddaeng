public class Items {
    int price;
    double weight;
    int quantity;
    String description;
    boolean canbetraded;
    String type;
    
    public void sayitemType(){
        System.out.println("The price is " + price + "\n" + "This is the weight " + weight + "\n" + canbetraded + "\n" + "The description is " + description + "\n" + "Item " + type);
    }
   

   
    public Items(int prc, double wei, int qty, String des, boolean cbtr, String sayitemType){
        price = prc;
        weight = wei;
        quantity = qty;
        canbetraded = cbtr;
        description = des;
        type = sayitemType;
    }

}
