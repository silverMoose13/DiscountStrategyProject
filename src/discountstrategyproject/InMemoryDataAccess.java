package discountstrategyproject;

/**
 *
 * @author Aaron
 */
//the responsibility of this class is to store and retrieve 
//the customer and product information. It is currently stored in memory
public class InMemoryDataAccess implements ReceiptDataAccessStrategy {

    ConsoleOutput consoleOutput = new ConsoleOutput();

    //set to private because we only want the database to have direct access to this info
    private Customer[] customers = {
        new Customer("001", "Bob Jones"),
        new Customer("002", "Lisa Smith"),
        new Customer("003", "Nancy Jones"),
        new Customer("004", "Arthur Cruise"),
        new Customer("005", "Sue Johnson")
    };

    //set different kinds of discounts later (Will these be a different constructor for each?
    //for example new QuantityDiscount(.20, 5) equals buy four get 1 free (2 params)
    //another example would be new PercentDiscount(.10) equals 10 percent off (1 param)
    //NoDiscount has no parameters
    private Product[] products = {
        new Product("10A", "Wisconsin Badgers Football Hat", 19.95, new NoDiscount()),
        new Product("10B", "Men's Striped Socks", 6.95, new NoDiscount()),
        new Product("10C", "Women's Watch", 108.95, new NoDiscount()),
        new Product("10D", "Leather Wallet", 24.95, new NoDiscount()),
        new Product("10E", "King Size Pillow Case", 10.95, new NoDiscount())
    };

    //customerId is the unique value amongst customers
    //customer Id is final since this won't change
    @Override
    public final Customer getCustomerInformation(final String customerId) {
        //customer can pay cash or not be in the database which
        //is OK then it will be set as null.
        if (customerId == null || customerId.isEmpty()) {
            return null;
        }
        Customer customer = null;

        for (Customer consumer : customers) {
            if (customerId.equals(consumer.getCustomerId())) {
                customer = consumer;
                break;
            }
        }
        return customer;
    }

    //productId is the unique value amongst products
    //productId is set to final since it won't change
    @Override
    public final Product getProductInformation(final String productId) {
        if (productId == null || productId.isEmpty()) {
            consoleOutput.display("Product Id must not be null or empty.");
            return null;
        }
        Product product = null;

        for (Product commercialGood : products) {
            if (productId.equals(commercialGood.getProductId())) {
                product = commercialGood;
                break;
            }
        }
        return product;
    }

}
