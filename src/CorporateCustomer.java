public class CorporateCustomer extends Customer{
    public String contactname;
    public int creditrating;
    public String creditLimit;
    public Employee salesrep;
    public String salesRep;

    public CorporateCustomer(String name, String address, Employee salesrep) {
        super(name, address);
        this.salesrep = salesrep;
    }

    public void billForMonth(int bill){
    }
    public void remind(){

    }
}
