public class ProductDB {

    public static Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        // create the Product object
        Product product = new Product();

        // fill the Product object with data
        product.setCode(productCode);
        if (productCode.equalsIgnoreCase("Banana")) {
            product.setDescription("Recommendation,from tainan");
            product.setPrice(1.25);
        } else if (productCode.equalsIgnoreCase("Apple")) {
            product.setDescription("Grow in Japan");
            product.setPrice(2.05);
        } else if (productCode.equalsIgnoreCase("Orange")) {
            product.setDescription("Juicy");
            product.setPrice(1.05);
        } else if (productCode.equalsIgnoreCase("Tomato")) {
            product.setDescription("Bloody");
            product.setPrice(3.65);
        } else if (productCode.equalsIgnoreCase("Potato")) {
            product.setDescription("No root");
            product.setPrice(3.15);
        } else if (productCode.equalsIgnoreCase("Cabbage")) {
            product.setDescription("New one");
            product.setPrice(6.35);
        } else {
            product.setDescription("Unknown enter again please");
        }
        return product;
    }
}