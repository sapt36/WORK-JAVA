import java.text.NumberFormat;

public class LineItem {

    private Product product;
    private int quantity;
    private int weight;

    public LineItem() {
        this.product = null;
        this.quantity = 0;
        this.weight = 0;
    }

    public LineItem(Product product, int quantity,int weight) {
        this.product = product;
        this.quantity = quantity;
        this.weight = weight;

    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public double getTotal() {
        double total = product.getPrice() * quantity * weight;
        return total;
    }

    public String getTotalFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(this.getTotal());
    }
}