import java.util.Date;
import java.util.List;

public class Order implements IList{
    public Date dateRecieved;
    public boolean isPrepaid;
    public String number;
    public double price;

    public OrderLine orderLine;
    List<OrderLine> lineItems;
    Customer customer;
    public Order(Customer customer, Date dateRecieved, boolean isPrepaid, String number, List<OrderLine> lineItems){
    this.customer = customer;
    this.dateRecieved = dateRecieved;
    this.isPrepaid = isPrepaid;
    this.number = number;
    this.lineItems = lineItems;

    }


    public void dispatch() {

    }
    public void close(){

    }
    public List<OrderLine> getLineItems(){
        return lineItems;
    }

    public void addlineItems(List<OrderLine> lineItems) {
        this.lineItems = lineItems;
    }
}
