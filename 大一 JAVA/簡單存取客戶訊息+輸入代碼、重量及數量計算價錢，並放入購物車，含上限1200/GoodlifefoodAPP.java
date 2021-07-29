public class GoodlifefoodAPP {

    public static void main(String args[]) {
        // display a welcome message
        System.out.println("Welcome to the Good Life Food Delivery Online System.");
        System.out.println("Code you can enter: Banana / Apple / Orange / Tomato / Potato / Cabbage" 
           +"\n"+"(Don't have case sensitive)"+"\n" +"Quantity from 1 to 1000."+"\n"+ "Weight from 1 to 10.");
        System.out.println();
        // create 1 or more line items
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
            String username = Console.getName(
                    "Your name is ");
            String password = Console.getPassword(
                    "Your password is ");
            
            String productCode = Console.getString(
                    "Enter product code: ");
            int quantity = Console.getInt(
                    "Enter quantity:     ", 0, 1000);
            int weight = Console.getInt(
                    "Enter weight:     ", 0, 10);

            // get the Product object
            Product product = ProductDB.getProduct(productCode);

            // create the LineItem object
            LineItem lineItem = new LineItem(product, quantity,weight);

            // display the output
            System.out.println();
            System.out.println("GOODLIFEFOOD");
            System.out.println("Code:        " + product.getCode());
            System.out.println("Description: " + product.getDescription());
            System.out.println("Price:       " + product.getPriceFormatted());
            System.out.println("Quantity:    " + lineItem.getQuantity());
            System.out.println("Weight:    " + lineItem.getWeight());
            System.out.println("Total:       "
                    + lineItem.getTotalFormatted() + "\n");
            if (lineItem.getTotal()<400){
                System.out.println("We need more. Come on ~");
            }
            else if (lineItem.getTotal()>400&&lineItem.getTotal()<1200){
                System.out.println("You had to pay 200 for delivery.");
                
            }
            else if (lineItem.getTotal()>1200){
                System.out.println("NICE welldone.Free delivery.");
                
            }
            // see if the user wants to continue
            choice = Console.getString("Continue? (y/n): ");
            System.out.println();
        }
    }
}