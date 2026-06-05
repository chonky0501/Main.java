public class Toy {
    String name;
    String brand;
    double price;
    int quantity;
    char size;
    // set the toy object price;
    public void setPrice(double price) {
        this.price = price;
    /* thi is a sample
    *program if
    *Toy class
    * is ran
    */
    }
    public static void main(String[] args) {
        Toy toy1 = new Toy();
        toy1.name = "Rage pink";
        toy1.brand = "Lab vuvu";
        toy1.price = 4500;
        toy1.quantity = 12;
        toy1.setPrice(toy1.price*0.5);
        System.out.println(toy1.brand);
    }
}
