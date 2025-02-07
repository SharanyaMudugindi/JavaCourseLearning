import product.Shirt;
import product.Pants;
import product.Shirt.Size;
import product.Product;

public class MainInheritance {

    public static void main(String[] args) {
        Shirt shirt = new Shirt(150000, "pink", "Levi's", Size.SMALL);
        /*shirt.setSize(Size.SMALL);
        shirt.setBrand("blabla");
        shirt.setPrice(1500);
        shirt.setColor("blue");
        System.out.println(shirt.getBrand());*/
        
        Pants pant = new Pants(15000,"blue","nike",34,72);
        /*pant.setWaist(34);
        pant.setLength(72);
        pant.setBrand("blablaa");
        pant.setPrice(15000);
        pant.setColor("blue");*/
        
        shirt.fold();
        pant.fold();
        productStore(pant);
        pant.wear();
        shirt.wear();
    }
    //Polymorphism
    public static void productStore(Product product)
    {
        System.out.println("Than you for purcjasing "+product.getBrand());
    }
}
