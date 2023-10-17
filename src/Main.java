import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Date dt = new Date();
        //Mitarbeiter anlegen
        Employee e1 = new Employee(123);
        Employee e2 = new Employee(321);
        // Corporate Mitarbeiter anlegen
        CorporateCustomer c1 = new CorporateCustomer("Charles","Hauptstr 2",e1);
        CorporateCustomer c2 = new CorporateCustomer("Hugo","Hauptstr 2",e2);

        //Producte anlegen
        Product p1 = new Product("product1");
        Product p2 = new Product("product2");
        Product p3 = new Product("product3");
        //Stückliste anlegen
        List<OrderLine> lineItems = new ArrayList<OrderLine>();

        //Bestellung anlegen
        Order order = new Order(c1,dt,false,"00001",lineItems);
        //Bestellung 2 anlegen
        Order order2 = new Order(c2,dt,false,"00002",lineItems);


        //Producte für Linie auf Stückliste anlegen
        OrderLine item1 = new OrderLine(5,10.10, p1,order);
        OrderLine item2 = new OrderLine(10,3.0, p2,order);
        OrderLine item3 = new OrderLine(50,3.0, p2,order);
        OrderLine item4 = new OrderLine(1,300.0, p3,order);

        //Producte der Stückliste hinzufügen
        lineItems.add(item1);
        lineItems.add(item2);
        lineItems.add(item3);
        lineItems.add(item4);


        //Stückliste der Bestellung hinzufügen
        //order.addlineItems(lineItems);
        //Stückliste der 2ten Bestellung hinzufügen
        //order2.addlineItems(lineItems);

        // System.out.println(order.getLineItems());
        //Bestellung ausgeben
        System.out.println("Product List "+ order.number);
        for (OrderLine lineItem : order.lineItems) {
            System.out.println("Productname " + lineItem.name.name + " Quantity " +lineItem.quantity + " Price " + lineItem.price + " ordered By " + order.customer.name + order.dateRecieved);
        }
        System.out.println("Product List "+ order2.number);
        for (OrderLine lineItem : order2.lineItems) {
            System.out.println("Productname " + lineItem.name.name + " Quantity " +lineItem.quantity + " Price " + lineItem.price + " ordered By " + order2.customer.name + order2.dateRecieved);
        }

    }
}