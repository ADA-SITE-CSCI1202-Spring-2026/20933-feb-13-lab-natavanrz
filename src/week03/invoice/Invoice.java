package week03.invoice;

public class Invoice {

    private String partnumber;
    private String partdescription;
    private int quantityofitems;
    private double priceperitem;

    public Invoice(String partnumber, String partdescription, int quantityofitems, double priceperitem) {
        this.partnumber = partnumber;
        this.partdescription = partdescription;
        this.quantityofitems = quantityofitems;
        this.priceperitem = priceperitem;
    }
}
