import java.util.List;

public class OrderLine{
    public int quantity;
    public double price;

    Product name;

    Order number;

    OrderLine (int quantity, double price, Product name, Order number){
        this.quantity = quantity;
        this.price = price;
        this.name = name;
        this.number = number;
    }

    public Product getProduct(){
        return name;
    }

}
