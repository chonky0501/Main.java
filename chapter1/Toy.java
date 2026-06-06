package chapter1;
/**
 * <p>represents a toy item in the inventory
 * each toy has a name, brand, price, qantity in stock
 * and a size size classification
 * </p>
 *  <ul>
 *       <li><b>name</b> -name of the toy (eg., "gundam")</li>
 *       <li><b>brand</b> -manufacturer or brand (eg., "lego")</li>
 *       <li><b>price</b> -selling price of the toy</li>
 *       <li><b>quantity -number of units available</b></li>
 *       <li><b>size</b> -size category (eg., 's' 'm' 'l')</li>
 *   </ul>
 * @author chonky
 * @version 1.0
 * @since 1.0
 */

//javadoc Toy.java - to generate javadoc html files
public class Toy {
    /**name of the toy (eg., "gundam") */
    public String name;
    /**manufacturer or brand (eg., "lego") */
    public String brand;
    /**selling price of the toy */
    public double price;
    /**number of units available */
    public int quantity;
    /**size category (eg., 's' 'm' 'l') */
    public char size;
    /** set the toy object price;
     * 
     * @param price the new price of the toy
     */
        public void setPrice(double price) {
      this.price = price;
      fruit4 f4;
    /* this is a sample
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
class fruit{  
}
class fruit2{
  
}
class fruit3{
  
}
/**sample fruit */
class fruit4{
  //public static void main(String[] args)✅
//static public void main(String[] args✅
//public static void main(String[] name) ✅
// "args" can be changed to a valid name
//static void main(String[] args)❌
//public void main(String[] args)❌ 
//void main(String[] args)❌ cant remove public static
// public static main(String[] args)❌cant remove void
//public static void main2(String[] args)❌ cant change main
//void public static main(String[] args)❌ cant rumble words
//void public static main(String[] 00name)❌ cant start w/ numbers

  static public void main(String[] args) {
    System.out.println("🍌");
  }
  
}
class house{
  //lot number, block number, name, coordinates
  //getLot getBlock,
}